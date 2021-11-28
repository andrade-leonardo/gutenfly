package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "via")
@Table(name = "viagem")

public class Viagem implements Serializable {
    
    @Id
    @SequenceGenerator(name = "VIAGEM_SEQ", sequenceName = "seq_viagem", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VIAGEM_SEQ", strategy = GenerationType.IDENTITY)
    
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "preco", nullable = false)
    private Double preco;
    
    @Column(name = "situacao", nullable = false)
    private Boolean situacao;
    
    @ManyToOne
    @JoinColumn(name = "aviao_id")
    private Aviao aviao;
    
    @OneToMany(mappedBy = "viagem")
    List<DestinoVoo> destinoVoo;

    public Viagem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
    
    public List<DestinoVoo> getDestinoVoo() {
        return destinoVoo;
    }

    public void setDestinoVoo(List<DestinoVoo> destinoVoo) {
        this.destinoVoo = destinoVoo;
    }
}
