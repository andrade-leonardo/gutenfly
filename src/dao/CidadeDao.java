package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Cidade;
import org.hibernate.Session;

public class CidadeDao extends DaoMestre {

    public List<Cidade> pegarTodosCidades() {
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

    public static Cidade pegarCidadePeloId(int id) {
        Session sessao = factory.openSession();
        Cidade cid = null;
        try {
            transaction = sessao.beginTransaction();
            cid = (Cidade) sessao.get(Cidade.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return cid;
    }

    public static boolean atualizarCidade(Cidade novaCidade, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Cidade antigaCidade = (Cidade) sessao.load(Cidade.class, id);
            for (int i = 0; i < 10; i++) {
                if (novaCidade.getNome() != null) {
                    antigaCidade.setNome(novaCidade.getNome());
                }
                if (novaCidade.getEstado() != null) {
                    antigaCidade.setEstado(novaCidade.getEstado());
                }
                sessao.update(antigaCidade);
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
