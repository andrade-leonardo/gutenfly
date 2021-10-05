package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Usuario;
import org.hibernate.Query;
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
    
    public static Query pegarUltimoUsuario() {
        Session sessao = factory.openSession();
        int id = 0;
        Query query = null;
        try {
            transaction = sessao.beginTransaction();
            query = sessao.createQuery("select max(id) from us GROUP BY id ");
            id = query.getMaxResults();
            System.out.println(id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return query;
    }    
    
    public static boolean atualizarUsuario(Usuario novoUs, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Usuario antigoUs = (Usuario) sessao.load(Usuario.class, id);
            for (int i = 0; i < 10; i++) {
                if (novoUs.getEmail() != null) {
                    antigoUs.setEmail(novoUs.getEmail());
                }
                if (novoUs.getSenha() != null) {
                    antigoUs.setSenha(novoUs.getSenha());
                }
                if (novoUs.getStatus() != null) {
                    antigoUs.setStatus(novoUs.getStatus());
                }
                sessao.update(antigoUs);
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
    
    public static void popularTabela(JTable tabela, String email, String senha) {
        
        Object[][] dadosTabela = null;
        
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "E-mail";
        cabecalho[2] = "Senha";
        cabecalho[3] = "Status";
        
        dadosTabela = new Object[pegarTodosUsuarios().size()][5];
        
        int lin = 0;
        
        try {
            for (Usuario u : pegarTodosUsuarios()) {
                if (!senha.equals("") && !email.equals("")) {
                    if (senha.equals(u.getSenha().substring(0, senha.length()))
                            && email.equals(u.getEmail().substring(0, email.length()))) {
                        dadosTabela[lin][0] = u.getId();
                        dadosTabela[lin][1] = u.getEmail();
                        dadosTabela[lin][2] = u.getSenha();
                        dadosTabela[lin][3] = u.getStatus();
                        
                        lin++;
                    }
                    
                } else if (!email.equals("")) {
                    if (email.equals(u.getEmail().substring(0, email.length()))) {
                        dadosTabela[lin][0] = u.getId();
                        dadosTabela[lin][1] = u.getEmail();
                        dadosTabela[lin][2] = u.getSenha();
                        dadosTabela[lin][3] = u.getStatus();
                        
                        lin++;
                    }
                    
                } else if (!senha.equals("")) {
                    if (senha.equals(u.getSenha().substring(0, senha.length()))) {
                        dadosTabela[lin][0] = u.getId();
                        dadosTabela[lin][1] = u.getEmail();
                        dadosTabela[lin][2] = u.getSenha();
                        dadosTabela[lin][3] = u.getStatus();
                        
                        lin++;
                    }
                    
                } else {
                    dadosTabela[lin][0] = u.getId();
                    dadosTabela[lin][1] = u.getEmail();
                    dadosTabela[lin][2] = u.getSenha();
                    dadosTabela[lin][3] = u.getStatus();
                    
                    lin++;
                }
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }
        
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
            public Class getColumnClass(int column) {
                return Object.class;
            }
        });
        
        tabela.setSelectionMode(0);
        
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(15);
                    break;
                case 1:
                    column.setPreferredWidth(100);
                    break;
                case 2:
                    column.setPreferredWidth(20);
                    break;
                case 3:
                    column.setPreferredWidth(20);
                    break;
            }
        }
    }
}
