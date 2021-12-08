package dao;

import static dao.DaoMestre.factory;
import static dao.DaoMestre.transaction;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.DestinoVoo;
import model.OrigemVoo;
import model.Viagem;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class ViagemDao extends DaoMestre {
    
    private static final SimpleDateFormat padraoData = new SimpleDateFormat("dd/MM/yyyy");
    public static ViagemDao viagemDao = null;

    public static ViagemDao getInstance() {
        if (viagemDao == null) {
            viagemDao = new ViagemDao();
        }
        return viagemDao;
    }

    public static List<Viagem> pegarTodasViagens() {
        List<Viagem> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from via ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Viagem pegarViagemPeloId(int id) {
        Session sessao = factory.openSession();
        Viagem avi = null;
        try {
            transaction = sessao.beginTransaction();
            avi = (Viagem) sessao.get(Viagem.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return avi;
    }

    public static void popularTabela(JTable tabela) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[7];
        cabecalho[0] = "Código";
        cabecalho[1] = "Avião";
        cabecalho[2] = "Preço";
        cabecalho[3] = "Data Embarque";
        cabecalho[4] = "Origem";
        cabecalho[5] = "Destino";
        cabecalho[6] = "Situação";

        dadosTabela = new Object[pegarTodasViagens().size()][7];

        int lin = 0;

        try {
            for (Viagem v : pegarTodasViagens()) {
                dadosTabela[lin][0] = v.getId();
                dadosTabela[lin][1] = v.getAviao().getNome();
                dadosTabela[lin][2] = v.getPreco();
                dadosTabela[lin][3] = padraoData.format(OrigemVooDao.pegarOrigemId(v.getId()).getData());
                dadosTabela[lin][4] = OrigemVooDao.pegarOrigemId(v.getId()).getAeroporto().getEndereco().getCidade().getNome();
                dadosTabela[lin][5] = DestinoVooDao.pegarDestinoId(v.getId()).getAeroporto().getEndereco().getCidade().getNome();
                dadosTabela[lin][6] = v.getSituacao() == true ? "Ativo" : "Inativo";

                lin++;
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
        }
        );

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(5);
                    break;
                case 1:
                    column.setPreferredWidth(80);
                    break;
                case 2:
                    column.setPreferredWidth(40);
                    break;
                case 3:
                    column.setPreferredWidth(50);
                    break;
                case 4:
                    column.setPreferredWidth(40);
                    break;
                case 5:
                    column.setPreferredWidth(30);
                    break;
                case 6:
                    column.setPreferredWidth(20);
                    break;
            }
        }
    }
    public static void popularTabelaPassagens(JTable tabela) {

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[10];
        cabecalho[0] = "Código";
        cabecalho[1] = "Empresa";
        cabecalho[2] = "Avião";
        cabecalho[3] = "Horário Saída";
        cabecalho[4] = "Portão Embarque";
        cabecalho[5] = "Data chegada";
        cabecalho[6] = "Portão Desembarque";
        cabecalho[7] = "Horário Chegada";
        cabecalho[8] = "Preço(R$)";
        cabecalho[9] = "Situação";

        dadosTabela = new Object[pegarTodasViagens().size()][10];

        int lin = 0;

        try {
            for (Viagem v : pegarTodasViagens()) {
                dadosTabela[lin][0] = v.getId();
                dadosTabela[lin][1] = v.getAviao().getEmpresa().getNome();
                dadosTabela[lin][2] = v.getAviao().getNome();
                dadosTabela[lin][3] = OrigemVooDao.pegarOrigemId(v.getId()).getHorario();
                dadosTabela[lin][4] = OrigemVooDao.pegarOrigemId(v.getId()).getPortaoEmbarque();
                dadosTabela[lin][5] = padraoData.format(DestinoVooDao.pegarDestinoId(v.getId()).getData());
                dadosTabela[lin][6] = DestinoVooDao.pegarDestinoId(v.getId()).getPortaoDesembarque();
                dadosTabela[lin][7] = DestinoVooDao.pegarDestinoId(v.getId()).getHorario();
                dadosTabela[lin][8] = v.getPreco();
                dadosTabela[lin][9] = v.getSituacao() == true ? "Ativo" : "Inativo";

                lin++;
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
        }
        );

        tabela.setSelectionMode(0);

        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(5);
                    break;
                case 1:
                    column.setPreferredWidth(80);
                    break;
                case 2:
                    column.setPreferredWidth(40);
                    break;
                case 3:
                    column.setPreferredWidth(30);
                    break;
                case 4:
                    column.setPreferredWidth(20);
                    break;
                case 5:
                    column.setPreferredWidth(60);
                    break;
                case 6:
                    column.setPreferredWidth(20);
                    break;
                case 7:
                    column.setPreferredWidth(40);
                    break;
                case 8:
                    column.setPreferredWidth(30);
                    break;
                case 9:
                    column.setPreferredWidth(20);
                    break;
            }
        }
    }
}
