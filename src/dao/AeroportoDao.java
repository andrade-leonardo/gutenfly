package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Aeroporto;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AeroportoDao extends DaoMestre {

    public static AeroportoDao aeroportoDao = null;

    public static AeroportoDao getInstance() {
        if (aeroportoDao == null) {
            aeroportoDao = new AeroportoDao();
        }
        return aeroportoDao;
    }

    public static List<Aeroporto> pegarTodosAeroportos(String nome, String cep, String situacao) {
        List<Aeroporto> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (!nome.equals("") || !cep.equals("") || !situacao.equals("")) {
                lista = sessao.createCriteria(Aeroporto.class)
                        .add(Restrictions.like("nome", nome + "%"))
                        .add(Restrictions.eq("situacao", ("Ativo".equals(situacao))))
                        .createAlias("endereco", "e")
                        .add(Restrictions.like("e.cep", "%"+ cep + "%"))
                        .addOrder(Order.asc("id")).list();
            } else {
                lista = sessao.createQuery("from aero ORDER BY id").list();
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

    public static Aeroporto pegarAeroportoPeloId(int id) {
        Session sessao = factory.openSession();
        Aeroporto aero = null;
        try {
            transaction = sessao.beginTransaction();
            aero = (Aeroporto) sessao.get(Aeroporto.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return aero;
    }

    public static boolean atualizarAeroporto(Aeroporto novoAeroporto, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Aeroporto antigoAeroporto = (Aeroporto) sessao.get(Aeroporto.class, id);
            antigoAeroporto.setNome(novoAeroporto.getNome());
            antigoAeroporto.setCnpj(novoAeroporto.getCnpj());
            antigoAeroporto.setTelefone(novoAeroporto.getTelefone());
            antigoAeroporto.setEmail(novoAeroporto.getEmail());
            antigoAeroporto.setSituacao(novoAeroporto.getSituacao());
            antigoAeroporto.setEndereco(novoAeroporto.getEndereco());

            sessao.update(antigoAeroporto);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public static void popularTabela(JTable tabela, String nome, String estado, String situacao) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[7];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "E-mail";
        cabecalho[3] = "Telefone";
        cabecalho[4] = "Cidade";
        cabecalho[5] = "Estado";
        cabecalho[6] = "Situação";

        dadosTabela = new Object[pegarTodosAeroportos(nome, estado, situacao).size()][7];

        int lin = 0;

        try {
            for (Aeroporto a : pegarTodosAeroportos(nome, estado, situacao)) {
                dadosTabela[lin][0] = a.getId();
                dadosTabela[lin][1] = a.getNome();
                dadosTabela[lin][2] = a.getEmail();
                dadosTabela[lin][3] = a.getTelefone();
                dadosTabela[lin][4] = a.getEndereco().getCidade().getNome();
                dadosTabela[lin][5] = a.getEndereco().getCidade().getEstado().getNome();
                dadosTabela[lin][6] = a.getSituacao() == true ? "Ativo" : "Inativo";

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
        }
        );

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(5);
                    break;
                case 1:
                    column.setPreferredWidth(80);
                    break;
                case 2:
                    column.setPreferredWidth(80);
                    break;
                case 3:
                    column.setPreferredWidth(30);
                    break;
                case 4:
                    column.setPreferredWidth(40);
                    break;
                case 5:
                    column.setPreferredWidth(30);
                    break;
                case 6:
                    column.setPreferredWidth(20);
                    break;
            }
        }
    }
}
