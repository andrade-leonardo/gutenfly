package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Empresa;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class EmpresaDao extends DaoMestre {

    public static EmpresaDao empresaDao = null;

    public static EmpresaDao getInstance() {
        if (empresaDao == null) {
            empresaDao = new EmpresaDao();
        }
        return empresaDao;
    }

    public static List<Empresa> pegarTodasEmpresas(String cnpj, String nome) {
        List<Empresa> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (!cnpj.equals("") || !nome.equals("")) {
                lista = sessao.createCriteria(Empresa.class)
                        .add(Restrictions.like("cnpj", cnpj + "%"))
                        .add(Restrictions.like("nome", nome + "%"))
                        .addOrder(Order.asc("id")).list();

            } else {
                lista = sessao.createQuery("from em ORDER BY id").list();
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
    
    public List<Empresa> popularEmpresas(JComboBox jcbEmpresa) {
        List<Empresa> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from em ORDER BY id").list();
            for (Empresa empresas : lista) {
                jcbEmpresa.addItem(empresas.getNome());
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
    
    public static void validaBuscaEmpresa(JComboBox empresaPesquisa, JTextField idEmpresa) {
        for (Empresa empresa : EmpresaDao.getInstance().pegarTodasEmpresas("", "")) {
            if (empresaPesquisa.getSelectedItem().equals(empresa.getNome())) {
                idEmpresa.setText(String.valueOf(empresa.getId()));
            }
        }
    }

    public static Empresa pegarEmpresaPeloId(int id) {
        Session sessao = factory.openSession();
        Empresa emp = null;
        try {
            transaction = sessao.beginTransaction();
            emp = (Empresa) sessao.get(Empresa.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return emp;
    }

    public static boolean atualizarEmpresa(Empresa novaEmpresa, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Empresa antigaEmpresa = (Empresa) sessao.get(Empresa.class, id);
            antigaEmpresa.setNome(novaEmpresa.getNome());
            antigaEmpresa.setCnpj(novaEmpresa.getCnpj());
            antigaEmpresa.setTelefone(novaEmpresa.getTelefone());
            antigaEmpresa.setEmail(novaEmpresa.getEmail());
            sessao.update(antigaEmpresa);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public static void popularTabela(JTable tabela, String cnpj, String nome) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Código";
        cabecalho[1] = "Cnpj";
        cabecalho[2] = "E-mail";
        cabecalho[3] = "Nome";
        cabecalho[4] = "Telefone";

        dadosTabela = new Object[pegarTodasEmpresas(cnpj, nome).size()][6];

        int lin = 0;

        try {
            for (Empresa e : pegarTodasEmpresas(cnpj, nome)) {
                dadosTabela[lin][0] = e.getId();
                dadosTabela[lin][1] = e.getCnpj();
                dadosTabela[lin][2] = e.getEmail();
                dadosTabela[lin][3] = e.getNome();
                dadosTabela[lin][4] = e.getTelefone();

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
                    column.setPreferredWidth(15);
                    break;
                case 1:
                    column.setPreferredWidth(100);
                    break;
                case 2:
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(100);
                    break;
                case 4:
                    column.setPreferredWidth(100);
                    break;
            }
        }
    }
}
