package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Aviao;
import org.hibernate.Session;

public class AviaoDao extends DaoMestre {
    
    public static AviaoDao aviaoDao = null;

    public static AviaoDao getInstance() {
        if (aviaoDao == null) {
            aviaoDao = new AviaoDao();
        }
        return aviaoDao;
    }
    

    public List<Aviao> pegarTodosAvioes() {
        List<Aviao> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from av ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Aviao pegarAviaoPeloId(int id) {
        Session sessao = factory.openSession();
        Aviao avi = null;
        try {
            transaction = sessao.beginTransaction();
            avi = (Aviao) sessao.get(Aviao.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return avi;
    }

    public static boolean atualizarAviao(Aviao novoAviao, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Aviao antigoAviao = (Aviao) sessao.load(Aviao.class, id);
            for (int i = 0; i < 10; i++) {
                if (novoAviao.getNome() != null) {
                    antigoAviao.setNome(novoAviao.getNome());
                }
                if (novoAviao.getCapacidade() != null) {
                    antigoAviao.setCapacidade(novoAviao.getCapacidade());
                }
                if (novoAviao.getSituacao() != null) {
                    antigoAviao.setSituacao(novoAviao.getSituacao());
                }
                if (novoAviao.getEmpresa() != null) {
                    antigoAviao.setEmpresa(novoAviao.getEmpresa());
                }
                sessao.update(antigoAviao);
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
