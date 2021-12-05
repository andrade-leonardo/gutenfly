package model;

import java.io.Serializable;
import java.util.Date; 
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name = "destvoo")
@Table(name = "destinovoo")

public class DestinoVoo implements Serializable {
    
    @Id
    @SequenceGenerator(name = "DESTINOVOO_SEQ", sequenceName = "seq_destino", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "DESTINOVOO_SEQ", strategy = GenerationType.IDENTITY)
    
    @Column(name = "id", nullable = false)
    private Integer id;
        
    @ManyToOne()
    @JoinColumn(name = "aeroporto_id")
    private Aeroporto aeroporto;
    
    @ManyToOne
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
    
    @Column(name = "portao_desemb", length = 1, nullable = false)
    private String portaoDesembarque;
    
    @Column(name = "data", nullable = false)
    @Basic
    @Temporal(TemporalType.DATE)
    private java.util.Date  data;
    
    @Column(name = "horario", length = 5, nullable = false)
    private String horario;
   
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

    public void setData(java.util.Date data) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
