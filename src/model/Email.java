package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "emai")
@Table(name = "email")
public class Email implements Serializable {
    
    @Id
    @SequenceGenerator(name = "EMAIL_SEQ", sequenceName = "seq_email", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "EMAIL_SEQ", strategy = GenerationType.IDENTITY)
    
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "mensagem", length = 100, nullable = false)
    private String mensagem;
    
    @Column(name = "destinatario", length = 100, nullable = false)
    private String destinatario;
    
    @Column(name = "data", nullable = false)
    private Date data;
    
    @Column(name = "assunto", length = 70)
    private String assunto;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Email() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}