package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Funcionario;
import org.hibernate.Session;

public class FuncionarioDao extends DaoMestre {

    public static FuncionarioDao funcionarioDao = null;

    public static FuncionarioDao getInstance() {
        if (funcionarioDao == null) {
            funcionarioDao = new FuncionarioDao();
        }
        return funcionarioDao;
    }

    public static List<Funcionario> pegarTodosFuncionarios() {
        List<Funcionario> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from func ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Funcionario pegarFuncionarioPeloId(int id) {
        Session sessao = factory.openSession();
        Funcionario func = null;
        try {
            transaction = sessao.beginTransaction();
            func = (Funcionario) sessao.get(Funcionario.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return func;
    }

    public static boolean atualizarFuncionario(Funcionario novoFunc, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Funcionario antigoFunc = (Funcionario) sessao.load(Funcionario.class, id);
            antigoFunc.setNome(novoFunc.getNome());
            antigoFunc.setCpf(novoFunc.getCpf());
            antigoFunc.setCargo(novoFunc.getCargo());
            antigoFunc.setTelefone(novoFunc.getTelefone());
            sessao.update(antigoFunc);

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
