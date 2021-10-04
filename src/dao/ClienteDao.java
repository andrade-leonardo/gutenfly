package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Cliente;
import org.hibernate.Session;

public class ClienteDao extends DaoMestre {
    
    public static ClienteDao clienteDao = null;

    public static ClienteDao getInstance() {
        if (clienteDao == null) {
            clienteDao = new ClienteDao();
        }
        return clienteDao;
    }
    
     public static List<Cliente> pegarTodosClientes(){
        List<Cliente> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from cli ORDER BY id").list();
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
             cli = (Cliente)sessao.get(Cliente.class, id);
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
            Cliente antigoCliente = (Cliente) sessao.load(Cliente.class, id);
            for (int i = 0; i < 10; i++) {
                if (novoCliente.getNome() != null) {
                    antigoCliente.setNome(novoCliente.getNome());
                }
                if (novoCliente.getCpf() != null) {
                    antigoCliente.setCpf(novoCliente.getCpf());
                }
                if (novoCliente.getTelefone() != null) {
                    antigoCliente.setTelefone(novoCliente.getTelefone());
                }
                if (novoCliente.getEndereco() != null) {
                    antigoCliente.setEndereco(novoCliente.getEndereco());
                }
                sessao.update(antigoCliente);
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }  
}
