package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "ite")
@Table(name = "item")

public class Item implements Serializable {
    
    @Id
    @SequenceGenerator(name = "ITEM_SEQ", sequenceName = "seq_item", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "ITEM_SEQ", strategy = GenerationType.SEQUENCE)
    
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "tamanho", length = 40, nullable = false)
    private String tamanho;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "tipo", length = 50, nullable = false)
    private String tipo;
   
    @Column(name = "peso", nullable = false)
    private Double peso;
    
    @ManyToOne
    @JoinColumn(name = "bagagem_id")
    private Bagagem bagagem;

    public Item() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Bagagem getBagagem() {
        return bagagem;
    }

    public void setBagagem(Bagagem bagagem) {
        this.bagagem = bagagem;
    }   
}
