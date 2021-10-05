package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Funcionario;
import org.hibernate.Query;
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

    public static boolean inserirFuncionario() {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Query query = sessao.createQuery("select save_funcionario :email, :senha , :status, :cargo, :cpf, :nome, :telefone");
            query.setText("email", "123");
            query.setText("senha", "31231");
            query.setBoolean("status", true);
            query.setText("cargo", "312");
            query.setText("cpf", "31231");
            query.setText("nome", "31231");
            query.setText("telefone", "312321");
              
            transaction.commit();
            retorno = true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
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
            for (int i = 0; i < 10; i++) {
                if (novoFunc.getNome() != null) {
                    antigoFunc.setNome(novoFunc.getNome());
                }
                if (novoFunc.getCpf() != null) {
                    antigoFunc.setCpf(novoFunc.getCpf());
                }
                if (novoFunc.getCargo() != null) {
                    antigoFunc.setCargo(novoFunc.getCargo());
                }
                if (novoFunc.getTelefone() != null) {
                    antigoFunc.setTelefone(novoFunc.getTelefone());
                }
                sessao.update(antigoFunc);
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
