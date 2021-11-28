package dao;

import static dao.DaoMestre.factory;
import static dao.DaoMestre.transaction;
import java.util.List;
import model.Usuario;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UsuarioDao extends DaoMestre {
    
    public static UsuarioDao usuarioDao = null;
    
    public static UsuarioDao getInstance() {
        if (usuarioDao == null) {
            usuarioDao = new UsuarioDao();
        }
        return usuarioDao;
    }
    
    public static List<Usuario> pegarTodosUsuarios(String email, String senha) {
        List<Usuario> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (!email.equals("") && !senha.equals("")) {
                lista = sessao.createCriteria(Usuario.class)
                        .add(Restrictions.eq("email", email))
                        .add(Restrictions.eq("senha", senha)).list();
            } else {
            lista = sessao.createQuery("from us ORDER BY id").list();
            }
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
   
    public static int autenticar(String email, String senha) {
        int tipoUsuario = 0;
        try {
            for (Usuario u : pegarTodosUsuarios(email, senha)) {
                if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                    tipoUsuario = u.getTipoUsuario();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoUsuario;
    }
}
