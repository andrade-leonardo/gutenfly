package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity(name = "origvo")
@Table(name = "origemvoo")

public class OrigemVoo implements Serializable {
    
    @EmbeddedId
    OrigemVooChave id;
    
    @ManyToOne
    @MapsId("aeroportoId")
    @JoinColumn(name = "aeroporto_id")
    private Aeroporto aeroporto;
    
    @ManyToOne
    @MapsId("viagemId")
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
    
    @Column(name = "portao_emb", length = 1, nullable = false)
    private String portaoEmbarque;
    
    @Column(name = "data", nullable = false)
    private Date data;
    
    @Column(name = "horario", length = 5, nullable = false)
    private String horario;
    

    public OrigemVoo() {
    }

    public String getPortaoEmbarque() {
        return portaoEmbarque;
    }

    public void setPortaoEmbarque(String portaoEmbarque) {
        this.portaoEmbarque = portaoEmbarque;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public OrigemVooChave getId() {
        return id;
    }

    public void setId(OrigemVooChave id) {
        this.id = id;
    }
}