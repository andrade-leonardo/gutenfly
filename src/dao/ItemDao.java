package dao;

import static dao.DaoMestre.factory;
import java.util.List;
import model.Item;
import org.hibernate.Session;

public class ItemDao extends DaoMestre {

    public static ItemDao itemDao = null;

    public static ItemDao getInstance() {
        if (itemDao == null) {
            itemDao = new ItemDao();
        }
        return itemDao;
    }

    public List<Item> pegarTodosItens() {
        List<Item> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from ite ORDER BY id").list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    public static Item pegarItemPeloId(int id) {
        Session sessao = factory.openSession();
        Item item = null;
        try {
            transaction = sessao.beginTransaction();
            item = (Item) sessao.get(Item.class, id);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return item;
    }

    public static boolean atualizarItem(Item novoItem, int id) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Item antigoItem = (Item) sessao.load(Item.class, id);
            for (int i = 0; i < 10; i++) {
                if (novoItem.getNome() != null) {
                    antigoItem.setNome(novoItem.getNome());
                }
                if (novoItem.getTipo() != null) {
                    antigoItem.setTipo(novoItem.getTipo());
                }
                if (novoItem.getTamanho() != null) {
                    antigoItem.setTamanho(novoItem.getTamanho());
                }
                if (novoItem.getPeso() != null) {
                    antigoItem.setPeso(novoItem.getPeso());
                }
                if (novoItem.getBagagem() != null) {
                    antigoItem.setBagagem(novoItem.getBagagem());
                }
                sessao.update(antigoItem);
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
