package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Endereco;
import org.hibernate.Session;

public class EnderecoDao extends DaoMestre {
    
    public static EnderecoDao enderecoDao = null;

    public static EnderecoDao getInstance() {
        if (enderecoDao == null) {
            enderecoDao = new EnderecoDao();
        }
        return enderecoDao;
    }

    public List<Endereco> pegarTodosEnderecos() {
        List<Endereco> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from ende ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Endereco pegarEnderecoPeloId(int id) {
        Session sessao = factory.openSession();
        Endereco ende = null;
        try {
            transaction = sessao.beginTransaction();
            ende = (Endereco) sessao.get(Endereco.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return ende;
    }

    public static boolean atualizarEndereco(Endereco novoEndereco, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Endereco antigoEndereco = (Endereco) sessao.load(Endereco.class, id);
            for (int i = 0; i < 10; i++) {
                if (novoEndereco.getRua() != null) {
                    antigoEndereco.setRua(novoEndereco.getRua());
                }
                if (novoEndereco.getNumero() != null) {
                    antigoEndereco.setNumero(novoEndereco.getNumero());
                }
                if (novoEndereco.getCep() != null) {
                    antigoEndereco.setCep(novoEndereco.getCep());
                }
                if (novoEndereco.getCidade() != null) {
                    antigoEndereco.setCidade(novoEndereco.getCidade());
                }
                sessao.update(antigoEndereco);
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
