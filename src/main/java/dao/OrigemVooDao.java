package dao;

import static dao.DaoMestre.factory;
import static dao.DaoMestre.transaction;
import java.util.List;
import javax.swing.JComboBox;
import model.Aeroporto;
import model.DestinoVoo;
import model.OrigemVoo;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class OrigemVooDao extends DaoMestre {

    public static OrigemVooDao origemDao = null;

    public static OrigemVooDao getInstance() {
        if (origemDao == null) {
            origemDao = new OrigemVooDao();
        }
        return origemDao;
    }

    public static OrigemVoo pegarOrigemId(Integer viagemId) {
        OrigemVoo origemVoo = new OrigemVoo();
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Query byIdQuery = sessao.createQuery("FROM origvo as m WHERE m.viagem.id = :viagem_id");
            byIdQuery.setParameter("viagem_id", viagemId);
            origemVoo = (OrigemVoo) byIdQuery.uniqueResult();
            
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return origemVoo;
    }
}
