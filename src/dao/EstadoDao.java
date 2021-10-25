package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import javax.swing.JComboBox;
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

    public List<Estado> pegarTodosEstados(JComboBox jcbEstado) {
        List<Estado> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from est ORDER BY id").list();
            for (Estado estados : lista) {
                jcbEstado.addItem(estados.getNome());
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
}
