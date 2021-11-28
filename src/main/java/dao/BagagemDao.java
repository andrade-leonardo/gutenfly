package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Bagagem;
import org.hibernate.Session;

public class BagagemDao extends DaoMestre {
    
    public static BagagemDao bagagemDao = null;

    public static BagagemDao getInstance() {
        if (bagagemDao == null) {
            bagagemDao = new BagagemDao();
        }
        return bagagemDao;
    }
    

    public List<Bagagem> pegarTodasBagagens() {
        List<Bagagem> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from bag ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Bagagem pegarBagagemPeloId(int id) {
        Session sessao = factory.openSession();
        Bagagem bag = null;
        try {
            transaction = sessao.beginTransaction();
            bag = (Bagagem) sessao.get(Bagagem.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return bag;
    }

    public static boolean atualizarBagagem(Bagagem novaBagagem, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Bagagem antigaBagagem = (Bagagem) sessao.load(Bagagem.class, id);
            for (int i = 0; i < 10; i++) {
                if (novaBagagem.getTamanho() != null) {
                    antigaBagagem.setTamanho(novaBagagem.getTamanho());
                }
                if (novaBagagem.getPeso() != null) {
                    antigaBagagem.setPeso(novaBagagem.getPeso());
                }
                if (novaBagagem.getFuncionario() != null) {
                    antigaBagagem.setFuncionario(novaBagagem.getFuncionario());
                }
                sessao.update(antigaBagagem);
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
