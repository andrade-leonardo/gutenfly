package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Aviao;
import model.Empresa;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AviaoDao extends DaoMestre {

    public static AviaoDao aviaoDao = null;

    public static AviaoDao getInstance() {
        if (aviaoDao == null) {
            aviaoDao = new AviaoDao();
        }
        return aviaoDao;
    }

    public static List<Aviao> pegarTodosAvioes(String nome, int empresaId, JComboBox jcbAvi) {
        List<Aviao> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (empresaId != 0) {
                lista = sessao.createCriteria(Aviao.class)
                        .add(Restrictions.like("nome", nome + "%"))
                        .add(Restrictions.eq("empresa.id", empresaId))
                        .addOrder(Order.asc("id")).list();
            } else if (!nome.equals("")) {
                lista = sessao.createCriteria(Aviao.class)
                        .add(Restrictions.like("nome", nome + "%"))
                        .addOrder(Order.asc("id")).list();
            } else {
                lista = sessao.createQuery("from av ORDER BY id").list();
            }
            for (Aviao avi : lista) {
                jcbAvi.addItem(avi.getNome());
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Aviao pegarAviaoPeloId(int id) {
        Session sessao = factory.openSession();
        Aviao avi = null;
        try {
            transaction = sessao.beginTransaction();
            avi = (Aviao) sessao.get(Aviao.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return avi;
    }

    public static boolean atualizarAviao(Aviao novoAviao, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Aviao antigoAviao = (Aviao) sessao.get(Aviao.class, id);
            antigoAviao.setNome(novoAviao.getNome());
            antigoAviao.setCapacidade(novoAviao.getCapacidade());
            antigoAviao.setSituacao(novoAviao.getSituacao());
            antigoAviao.setEmpresa(novoAviao.getEmpresa());
            sessao.update(antigoAviao);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }
    
     public static void validaBuscaAviao(JComboBox comboAviao, JTextField idAviao) {
        for (Aviao aviao : AviaoDao.getInstance().pegarTodosAvioes("", 0, new JComboBox())) {
            if (comboAviao.getSelectedItem().equals(aviao.getNome())) {
                idAviao.setText(String.valueOf(aviao.getId()));
            }
        }
    }

    public static void popularTabela(JTable tabela, String nome, int empresaId) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Capacidade";
        cabecalho[3] = "Situação";
        cabecalho[4] = "Empresa";

        dadosTabela = new Object[pegarTodosAvioes(nome, empresaId, new JComboBox()).size()][6];

        int lin = 0;

        try {
            for (Aviao a : pegarTodosAvioes(nome, empresaId,  new JComboBox())) {
                dadosTabela[lin][0] = a.getId();
                dadosTabela[lin][1] = a.getNome();
                dadosTabela[lin][2] = a.getCapacidade();
                dadosTabela[lin][3] = a.getSituacao() == true ? "Ativo" : "Inativo";
                dadosTabela[lin][4] = a.getEmpresa().getNome();

                lin++;

            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            public Class getColumnClass(int column) {
                return Object.class;
            }
        });

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(15);
                    break;
                case 1:
                    column.setPreferredWidth(100);
                    break;
                case 2:
                    column.setPreferredWidth(20);
                    break;
                case 3:
                    column.setPreferredWidth(20);
                    break;
                case 4:
                    column.setPreferredWidth(80);
                    break;
            }
        }
    }
}
