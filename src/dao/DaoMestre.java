/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DaoMestre {

    public static DaoMestre daoMaster = null;

    protected static SessionFactory factory;
    protected static Transaction transaction;

    public DaoMestre() {
        factory = HibernateUtil.getSessionFactory();
    }

    public static DaoMestre getInstance() {
        if (daoMaster == null) {
            daoMaster = new DaoMestre();
        }
        return daoMaster;
    }

    public static boolean insert(Object o) {
        boolean feedBack = false;
        Session session = factory.openSession();
        try {
            transaction = session.beginTransaction();
            session.save(o);
            transaction.commit();
            feedBack = true;
        } catch (Exception e) {
            transaction.rollback();
            feedBack = false;
            e.printStackTrace();
        } finally {
            session.close();
        }
        return feedBack;
    }
    
    public static boolean delete(Object o) {
        boolean feedBack = false;
        Session session = factory.openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(o);
            transaction.commit();
            feedBack = true;
        } catch (Exception e) {
            transaction.rollback();
            feedBack = false;
            e.printStackTrace();
        } finally {
            session.close();
        }
        return feedBack;
    }
}
