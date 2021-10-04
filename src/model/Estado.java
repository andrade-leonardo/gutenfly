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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "est")
@Table(name = "estado")

public class Estado implements Serializable {
    
    @Id
    @SequenceGenerator(name = "ESTADO_SEQ", sequenceName = "seq_estado", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "ESTADO_SEQ", strategy = GenerationType.SEQUENCE)
    
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;
    
    @Column(name = "uf", length = 2, nullable = false)
    private String uf;

    public Estado() {
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}