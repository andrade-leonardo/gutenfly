/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "destvoo")
@Table(name = "destinovoo")

public class DestinoVoo implements Serializable {
    
    @Column(name = "portao_desemb", length = 1, nullable = false)
    private String portaoDesembarque;
    
    @Column(name = "data", nullable = false)
    private Date data;
    
    @Column(name = "horario", length = 5, nullable = false)
    private String horario;
    
    @ManyToMany
    @JoinColumn(name = "aeroporto_id")
    private Aeroporto aeroporto;
    
    @ManyToMany
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
    
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
}