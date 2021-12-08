package model;

/**
 *
 * @author Leonardo
 */
public class Sessao {

    private static Sessao instance = null;
    private Cliente cliente;

    private Sessao() {
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public static Sessao getInstance() {
        if (instance == null) {
            instance = new Sessao();
        }
        return instance;
    }
}