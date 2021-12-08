package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;


@Entity(name = "viagemcli")
@Table(name = "viagemcliente")

public class ViagemCliente implements Serializable {
    
    @Id
    @SequenceGenerator(name = "VIAGEMCLIENTE_SEQ", sequenceName = "seq_viagemcliente", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VIAGEMCLIENTE_SEQ", strategy = GenerationType.IDENTITY)
    
    @Column(name = "id", nullable = false)
    private Integer id;
        
    @ManyToOne
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
    
    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bagagem_id")
    private Bagagem bagagem;

    public ViagemCliente() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public Bagagem getBagagem() {
        return bagagem;
    }

    public void setBagagem(Bagagem bagagem) {
        this.bagagem = bagagem;
    }   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
