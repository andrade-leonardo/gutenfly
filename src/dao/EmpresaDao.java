package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Empresa;
import org.hibernate.Session;

public class EmpresaDao extends DaoMestre {

    public static EmpresaDao empresaDao = null;

    public static EmpresaDao getInstance() {
        if (empresaDao == null) {
            empresaDao = new EmpresaDao();
        }
        return empresaDao;
    }

    public static List<Empresa> pegarTodasEmpresas() {
        List<Empresa> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from em ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Empresa pegarEmpresaPeloId(int id) {
        Session sessao = factory.openSession();
        Empresa emp = null;
        try {
            transaction = sessao.beginTransaction();
            emp = (Empresa) sessao.get(Empresa.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return emp;
    }

    public static boolean atualizarEmpresa(Empresa novaEmpresa, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Empresa antigaEmpresa = (Empresa) sessao.load(Empresa.class, id);
            for (int i = 0; i < 10; i++) {
                if (novaEmpresa.getNome() != null) {
                    antigaEmpresa.setNome(novaEmpresa.getNome());
                }
                if (novaEmpresa.getCnpj() != null) {
                    antigaEmpresa.setCnpj(novaEmpresa.getCnpj());
                }
                if (novaEmpresa.getTelefone() != null) {
                    antigaEmpresa.setTelefone(novaEmpresa.getTelefone());
                }
                if (novaEmpresa.getEmail() != null) {
                    antigaEmpresa.setEmail(novaEmpresa.getEmail());
                }
                sessao.update(antigaEmpresa);
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

    public static void popularTabela(JTable tabela, String cnpj, String nome) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Código";
        cabecalho[1] = "Cnpj";
        cabecalho[2] = "E-mail";
        cabecalho[3] = "Nome";
        cabecalho[4] = "Telefone";

        dadosTabela = new Object[pegarTodasEmpresas().size()][6];

        int lin = 0;
        
        System.out.println(cnpj);
           System.out.println(nome);

        try {
            for (Empresa e : pegarTodasEmpresas()) {
                if (!cnpj.equals("") && !nome.equals("")) {
                    if (cnpj.equals(e.getCnpj().substring(0, cnpj.length()))
                            && nome.equals(e.getNome().substring(0, nome.length()))) {
                        dadosTabela[lin][0] = e.getId();
                        dadosTabela[lin][1] = e.getCnpj();
                        dadosTabela[lin][2] = e.getEmail();
                        dadosTabela[lin][3] = e.getNome();
                        dadosTabela[lin][4] = e.getTelefone();

                        lin++;
                    }

                } else if (!cnpj.equals("")) {
                    if (cnpj.equals(e.getCnpj().substring(0, cnpj.length()))) {
                        dadosTabela[lin][0] = e.getId();
                        dadosTabela[lin][1] = e.getCnpj();
                        dadosTabela[lin][2] = e.getEmail();
                        dadosTabela[lin][3] = e.getNome();
                        dadosTabela[lin][4] = e.getTelefone();

                        lin++;
                    }

                } else if (!nome.equals("")) {
                    if (nome.equals(e.getNome().substring(0, nome.length()))) {
                        dadosTabela[lin][0] = e.getId();
                        dadosTabela[lin][1] = e.getCnpj();
                        dadosTabela[lin][2] = e.getEmail();
                        dadosTabela[lin][3] = e.getNome();
                        dadosTabela[lin][4] = e.getTelefone();

                        lin++;
                    }

                } else {
                    dadosTabela[lin][0] = e.getId();
                    dadosTabela[lin][1] = e.getCnpj();
                    dadosTabela[lin][2] = e.getEmail();
                    dadosTabela[lin][3] = e.getNome();
                    dadosTabela[lin][4] = e.getTelefone();

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
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(100);
                    break;
                case 4:
                    column.setPreferredWidth(100);
                    break;
            }
        }
    }
}
