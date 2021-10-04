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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "aero")
@Table(name = "aeroporto")

public class Aeroporto implements Serializable {
    
    @Id
    @SequenceGenerator(name = "AEROPORTO_SEQ", sequenceName = "seq_aerporto", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "AEROPORTO_SEQ", strategy = GenerationType.SEQUENCE)
    
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;
    
    @Column(name = "cnpj", length = 18, nullable = false)
    private String cnpj;
    
    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;
    
    @Column(name = "email", length = 45, nullable = false)
    private String email;
    
    @Column(name = "situacao", nullable = false)
    private Boolean situacao;
    
    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Aeroporto() {
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
