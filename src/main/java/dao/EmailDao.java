package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Email;
import org.hibernate.Session;

public class EmailDao extends DaoMestre {
    
    public static EmailDao emailDao = null;

    public static EmailDao getInstance() {
        if (emailDao == null) {
            emailDao = new EmailDao();
        }
        return emailDao;
    }

    public List<Email> pegarTodosEmails() {
        List<Email> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from emai ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Email pegarEmailPeloId(int id) {
        Session sessao = factory.openSession();
        Email em = null;
        try {
            transaction = sessao.beginTransaction();
            em = (Email) sessao.get(Email.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return em;
    }

    public static boolean atualizarEmail(Email novoEmail, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Email antigoEmail = (Email) sessao.load(Email.class, id);
            for (int i = 0; i < 10; i++) {
                if (novoEmail.getMensagem() != null) {
                    antigoEmail.setMensagem(novoEmail.getMensagem());
                }
                if (novoEmail.getDestinatario() != null) {
                    antigoEmail.setDestinatario(novoEmail.getDestinatario());
                }
                if (novoEmail.getData() != null) {
                    antigoEmail.setData(novoEmail.getData());
                }
                if (novoEmail.getAssunto() != null) {
                    antigoEmail.setAssunto(novoEmail.getAssunto());
                }
                if (novoEmail.getCliente() != null) {
                    antigoEmail.setCliente(novoEmail.getCliente());
                }
                sessao.update(antigoEmail);
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
