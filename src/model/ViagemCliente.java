package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity(name = "viagemcli")
@Table(name = "viagemcliente")

public class ViagemCliente implements Serializable {
    
    @EmbeddedId
    ViagemClienteChave id;
        
    @ManyToOne
    @MapsId("viagemId")
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
    
    @ManyToOne
    @MapsId("clienteId")
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @Column(name = "valor_pago", nullable = false)
    private Double valorPago;
    
    @Column(name = "assento", nullable = false)
    private Integer assento;
    
    @Column(name = "parcelas", nullable = false)
    private Integer parcelas;
    
    @Column(name = "checkin", nullable = false)
    private Boolean checkin;
    
    @ManyToOne
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

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Integer getAssento() {
        return assento;
    }

    public void setAssento(Integer assento) {
        this.assento = assento;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Boolean getCheckin() {
        return checkin;
    }

    public void setCheckin(Boolean checkin) {
        this.checkin = checkin;
    }

    public Bagagem getBagagem() {
        return bagagem;
    }

    public void setBagagem(Bagagem bagagem) {
        this.bagagem = bagagem;
    }   

    public ViagemClienteChave getId() {
        return id;
    }

    public void setId(ViagemClienteChave id) {
        this.id = id;
    }
}
