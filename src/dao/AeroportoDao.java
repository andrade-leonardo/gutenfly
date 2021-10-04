package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Aeroporto;
import org.hibernate.Session;

public class AeroportoDao extends DaoMestre {
    
    public static AeroportoDao aeroportoDao = null;

    public static AeroportoDao getInstance() {
        if (aeroportoDao == null) {
            aeroportoDao = new AeroportoDao();
        }
        return aeroportoDao;
    }

    public List<Aeroporto> pegarTodosAeroportos() {
        List<Aeroporto> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from aero ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Aeroporto pegarAeroportoPeloId(int id) {
        Session sessao = factory.openSession();
        Aeroporto aero = null;
        try {
            transaction = sessao.beginTransaction();
            aero = (Aeroporto) sessao.get(Aeroporto.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return aero;
    }

    public static boolean atualizarAeroporto(Aeroporto novoAeroporto, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Aeroporto antigoAeroporto = (Aeroporto) sessao.load(Aeroporto.class, id);
            for (int i = 0; i < 10; i++) {
                if (novoAeroporto.getNome() != null) {
                    antigoAeroporto.setNome(novoAeroporto.getNome());
                }
                if (novoAeroporto.getCnpj() != null) {
                    antigoAeroporto.setCnpj(novoAeroporto.getCnpj());
                }
                if (novoAeroporto.getTelefone() != null) {
                    antigoAeroporto.setTelefone(novoAeroporto.getTelefone());
                }
                if (novoAeroporto.getEmail() != null) {
                    antigoAeroporto.setEmail(novoAeroporto.getEmail());
                }
                if (novoAeroporto.getSituacao() != null) {
                    antigoAeroporto.setSituacao(novoAeroporto.getSituacao());
                }
                if (novoAeroporto.getEndereco() != null) {
                    antigoAeroporto.setEndereco(novoAeroporto.getEndereco());
                }
                sessao.update(antigoAeroporto);
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
