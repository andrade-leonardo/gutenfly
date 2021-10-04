package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Estado;
import org.hibernate.Session;

public class EstadoDao extends DaoMestre {
    
    public static EstadoDao estadoDao = null;

    public static EstadoDao getInstance() {
        if (estadoDao == null) {
            estadoDao = new EstadoDao();
        }
        return estadoDao;
    }


    public List<Estado> pegarTodosEstados() {
        List<Estado> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from est ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Estado pegarEstadoPeloId(int id) {
        Session sessao = factory.openSession();
        Estado est = null;
        try {
            transaction = sessao.beginTransaction();
            est = (Estado) sessao.get(Estado.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return est;
    }

    public static boolean atualizarEstado(Estado novoEstado, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Estado antigoEstado = (Estado) sessao.load(Estado.class, id);
            for (int i = 0; i < 10; i++) {
                if (novoEstado.getNome() != null) {
                    antigoEstado.setNome(novoEstado.getNome());
                }
                if (novoEstado.getUf() != null) {
                    antigoEstado.setUf(novoEstado.getUf());
                }
                sessao.update(antigoEstado);
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
