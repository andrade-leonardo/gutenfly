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


@Entity(name = "av")
@Table(name = "aviao")

public class Aviao implements Serializable {
    
    @Id
    @SequenceGenerator(name = "AVIAO_SEQ", sequenceName = "seq_aviao", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "AVIAO_SEQ", strategy = GenerationType.SEQUENCE)
    
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;
    
    @Column(name = "capacidade", nullable = false)
    private Integer capacidade;
   
    @Column(name = "situacao", nullable = false)
    private Boolean situacao;
    
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    public Aviao() {
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

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}