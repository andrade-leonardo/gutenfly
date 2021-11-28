package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Funcionario;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class FuncionarioDao extends DaoMestre {

    public static FuncionarioDao funcionarioDao = null;

    public static FuncionarioDao getInstance() {
        if (funcionarioDao == null) {
            funcionarioDao = new FuncionarioDao();
        }
        return funcionarioDao;
    }

    public static List<Funcionario> pegarTodosFuncionarios(String nome, String cep, String status, String cargo, JComboBox jcbFunc) {
        List<Funcionario> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (!nome.equals("") || !cep.equals("") || !status.equals("")) {
                lista = sessao.createCriteria(Funcionario.class)
                        .createAlias("usuario", "u")
                        .createAlias("endereco", "e")
                        .add(Restrictions.like("nome", nome + "%"))
                        .add(Restrictions.eq("u.status", ("Ativo".equals(status))))
                        .add(Restrictions.like("e.cep", "%" + cep + "%"))
                        .addOrder(Order.asc("id")).list();
            } else if (!cargo.equals("")) {
                lista = sessao.createCriteria(Funcionario.class)
                        .add(Restrictions.like("nome", nome + "%"))
                        .add(Restrictions.eq("cargo", cargo))
                        .addOrder(Order.asc("id")).list();
            } else {
                lista = sessao.createQuery("from func ORDER BY id").list();
            }
            for (Funcionario func : lista) {
                jcbFunc.addItem(func.getNome());
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

    public static Funcionario pegarFuncionarioPeloId(int id) {
        Session sessao = factory.openSession();
        Funcionario func = null;
        try {
            transaction = sessao.beginTransaction();
            func = (Funcionario) sessao.get(Funcionario.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return func;
    }

    public static boolean atualizarFuncionario(Funcionario novoFunc, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Funcionario antigoFunc = (Funcionario) sessao.load(Funcionario.class, id);
            antigoFunc.setNome(novoFunc.getNome());
            antigoFunc.setCpf(novoFunc.getCpf());
            antigoFunc.setCargo(novoFunc.getCargo());
            antigoFunc.setTelefone(novoFunc.getTelefone());
            antigoFunc.setEndereco(novoFunc.getEndereco());
            antigoFunc.setUsuario(novoFunc.getUsuario());
            sessao.update(antigoFunc);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }
    
     public static void validaBuscaFuncionario(JComboBox comboFuncionario, JTextField idFuncionario) {
        for (Funcionario funcionario : FuncionarioDao.getInstance().pegarTodosFuncionarios("", "", "", "", new JComboBox())) {
            if (comboFuncionario.getSelectedItem().equals(funcionario.getNome())) {
                idFuncionario.setText(String.valueOf(funcionario.getId()));
            }
        }
    }

    public static void popularTabela(JTable tabela, String nome, String cep, String status) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[8];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Cargo";
        cabecalho[3] = "E-mail";
        cabecalho[4] = "Telefone";
        cabecalho[5] = "Cidade";
        cabecalho[6] = "Estado";
        cabecalho[7] = "Status";

        dadosTabela = new Object[pegarTodosFuncionarios(nome, cep, status, "", new JComboBox()).size()][8];

        int lin = 0;

        try {
            for (Funcionario f : pegarTodosFuncionarios(nome, cep, status, "", new JComboBox())) {
                dadosTabela[lin][0] = f.getId();
                dadosTabela[lin][1] = f.getNome();
                dadosTabela[lin][2] = f.getCargo();
                dadosTabela[lin][3] = f.getUsuario().getEmail();
                dadosTabela[lin][4] = f.getTelefone();
                dadosTabela[lin][5] = f.getEndereco().getCidade().getNome();
                dadosTabela[lin][6] = f.getEndereco().getCidade().getEstado().getNome();
                dadosTabela[lin][7] = f.getUsuario().getStatus() == true ? "Ativo" : "Inativo";

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
                    column.setPreferredWidth(20);
                    break;
                case 3:
                    column.setPreferredWidth(80);
                    break;
                case 4:
                    column.setPreferredWidth(30);
                    break;
                case 5:
                    column.setPreferredWidth(40);
                    break;
                case 6:
                    column.setPreferredWidth(30);
                    break;
                case 7:
                    column.setPreferredWidth(20);
                    break;
            }
        }
    }
}
