/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DaoMestre.factory;
import static dao.DaoMestre.transaction;
import java.util.List;
import model.ViagemFuncionario;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ViagemFuncionarioDao extends DaoMestre {

    public static ViagemFuncionarioDao viaFuncionarioDao = null;

    public static ViagemFuncionarioDao getInstance() {
        if (viaFuncionarioDao == null) {
            viaFuncionarioDao = new ViagemFuncionarioDao();
        }
        return viaFuncionarioDao;
    }
    
     public static List<ViagemFuncionario> pegarViagemFuncionarioId(Integer viagemId, String cargo) {
        List<ViagemFuncionario> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
                lista = sessao.createCriteria(ViagemFuncionario.class)
                        .createAlias("funcionario", "f")
                        .add(Restrictions.eq("viagem.id", viagemId))
                        .add(Restrictions.eq("f.cargo", cargo))
                        .addOrder(Order.asc("id")).list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }
}


