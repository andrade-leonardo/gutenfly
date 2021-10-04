package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Viagem;
import org.hibernate.Session;

public class ViagemDao extends DaoMestre {
    
    public static ViagemDao viagemDao = null;
      
     public static ViagemDao getInstance() {
        if (viagemDao == null) {
            viagemDao = new ViagemDao();
        }
        return viagemDao;
    }

    public List<Viagem> pegarTodasViagens() {
        List<Viagem> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from via ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Viagem pegarViagemPeloId(int id) {
        Session sessao = factory.openSession();
        Viagem avi = null;
        try {
            transaction = sessao.beginTransaction();
            avi = (Viagem) sessao.get(Viagem.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return avi;
    }

    public static boolean atualizarViagem(Viagem novaViagem, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Viagem antigaViagem = (Viagem) sessao.load(Viagem.class, id);
            for (int i = 0; i < 10; i++) {
                if (novaViagem.getPreco() != null) {
                    antigaViagem.setPreco(novaViagem.getPreco());
                }
                if (novaViagem.getSituacao() != null) {
                    antigaViagem.setSituacao(novaViagem.getSituacao());
                }
                if (novaViagem.getAviao() != null) {
                    antigaViagem.setAviao(novaViagem.getAviao());
                }
                sessao.update(antigaViagem);
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
