package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Usuario;
import org.hibernate.Session;

public class UsuarioDao extends DaoMestre {
    
    public static UsuarioDao usuarioDao = null;
    
    public static UsuarioDao getInstance() {
        if (usuarioDao == null) {
            usuarioDao = new UsuarioDao();
        }
        return usuarioDao;
    }
    
    public static List<Usuario> pegarTodosUsuarios() {
        List<Usuario> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from us ORDER BY id").list();
            System.out.println();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }
    
    public static Usuario pegarUsuarioPeloId(int id) {
        Session sessao = factory.openSession();
        Usuario us = null;
        try {
            transaction = sessao.beginTransaction();
            us = (Usuario) sessao.get(Usuario.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return us;
    }
   
    public static boolean autenticar(String email, String senha) {
        boolean retorno = false;
        try {
            for (Usuario u : pegarTodosUsuarios()) {
                if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                    retorno = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
