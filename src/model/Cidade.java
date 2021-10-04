/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


@Entity(name = "cid")
@Table(name = "cidade")

public class Cidade implements Serializable {
    
    @Id
    @SequenceGenerator(name = "CIDADE_SEQ", sequenceName = "seq_cidade", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "CIDADE_SEQ", strategy = GenerationType.SEQUENCE)
    
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    public Cidade() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}