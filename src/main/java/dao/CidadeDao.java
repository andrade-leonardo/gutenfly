package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import javax.swing.JComboBox;
import model.Cidade;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;

public class CidadeDao extends DaoMestre {

    public static CidadeDao cidadeDao = null;

    public static CidadeDao getInstance() {
        if (cidadeDao == null) {
            cidadeDao = new CidadeDao();
        }
        return cidadeDao;
    }
    
   public static List<Cidade> pegarTodasCidades() {
        List<Cidade> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from cid ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }
      

    public static List<Cidade> popularCidades(JComboBox jcbCidade, int estadoId) {
        List<Cidade> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if(estadoId != 0) {
            lista = sessao.createCriteria(Cidade.class)
                        .add(Expression.eq("estado.id", estadoId))
                        .addOrder(Order.asc("id")).list();
            } else {
                lista = sessao.createCriteria(Cidade.class)
                        .addOrder(Order.asc("id")).list();
            }
            for (Cidade cidade : lista) {
                jcbCidade.addItem(cidade.getNome());
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

    public static Cidade pegarCidadePeloId(int id) {
        Session sessao = factory.openSession();
        Cidade cid = null;
        try {
            transaction = sessao.beginTransaction();
            cid = (Cidade) sessao.get(Cidade.class, id);
            System.out.println(cid.getId());
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return cid;
    }
}
