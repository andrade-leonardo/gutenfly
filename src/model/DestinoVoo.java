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


@Entity(name = "destvoo")
@Table(name = "destinovoo")

public class DestinoVoo implements Serializable {
    
    @EmbeddedId
    DestinoVooChave id;
        
    @ManyToOne
    @MapsId("aeroportoId")
    @JoinColumn(name = "aeroporto_id")
    private Aeroporto aeroporto;
    
    @ManyToOne
    @MapsId("viagemId")
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
    
    @Column(name = "portao_desemb", length = 1, nullable = false)
    private String portaoDesembarque;
    
    @Column(name = "data", nullable = false)
    private Date data;
    
    @Column(name = "horario", length = 5, nullable = false)
    private String horario;
    
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public DestinoVoo() {
    }

    public String getPortaoDesembarque() {
        return portaoDesembarque;
    }

    public void setPortaoDesembarque(String portaoDesembarque) {
        this.portaoDesembarque = portaoDesembarque;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    } 

    public DestinoVooChave getId() {
        return id;
    }

    public void setId(DestinoVooChave id) {
        this.id = id;
    }
}