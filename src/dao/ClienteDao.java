package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Cliente;
import model.Usuario;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ClienteDao extends DaoMestre {

    public static ClienteDao clienteDao = null;

    public static ClienteDao getInstance() {
        if (clienteDao == null) {
            clienteDao = new ClienteDao();
        }
        return clienteDao;
    }

     public static List<Cliente> pegarTodosClientes(String nome, String cep, String status) {
        List<Cliente> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (!nome.equals("") || !cep.equals("") || !status.equals("")) {
                lista = sessao.createCriteria(Cliente.class)
                        .createAlias("usuario", "u")
                        .createAlias("endereco", "e")
                        .add(Restrictions.like("nome", nome + "%"))
                        .add(Restrictions.eq("u.status", ("Ativo".equals(status))))
                        .add(Restrictions.like("e.cep", "%"+ cep + "%"))
                        .addOrder(Order.asc("id")).list();
            } else {
                lista = sessao.createQuery("from cli ORDER BY id").list();
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

    public static Cliente pegarClientePeloId(int id) {
        Session sessao = factory.openSession();
        Cliente cli = null;
        try {
            transaction = sessao.beginTransaction();
            cli = (Cliente) sessao.get(Cliente.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return cli;
    }

    public static boolean atualizarCliente(Cliente novoCliente, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Cliente antigoCliente = (Cliente) sessao.get(Cliente.class, id);
            antigoCliente.setNome(novoCliente.getNome());
            antigoCliente.setCpf(novoCliente.getCpf());
            antigoCliente.setTelefone(novoCliente.getTelefone());
            antigoCliente.setEndereco(novoCliente.getEndereco());
            antigoCliente.setUsuario(novoCliente.getUsuario());
            sessao.update(antigoCliente);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }
    
    public static void popularTabela(JTable tabela, String nome, String cep, String status) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[7];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "E-mail";
        cabecalho[3] = "Telefone";
        cabecalho[4] = "Cidade";
        cabecalho[5] = "Estado";
        cabecalho[6] = "Status";

        dadosTabela = new Object[pegarTodosClientes(nome, cep, status).size()][7];

        int lin = 0;

        try {
            for (Cliente c : pegarTodosClientes(nome, cep, status)) {
                dadosTabela[lin][0] = c.getId();
                dadosTabela[lin][1] = c.getNome();
                dadosTabela[lin][2] = c.getUsuario().getEmail();
                dadosTabela[lin][3] = c.getTelefone();
                dadosTabela[lin][4] = c.getEndereco().getCidade().getNome();
                dadosTabela[lin][5] = c.getEndereco().getCidade().getEstado().getNome();
                dadosTabela[lin][6] = c.getUsuario().getStatus() == true ? "Ativo" : "Inativo";

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
