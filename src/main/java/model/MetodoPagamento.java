/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "metpag")
@Table(name = "metodoPagamento")
public class MetodoPagamento implements Serializable{
    
    @Id
    @SequenceGenerator(name = "METODOPAGAMENTO_SEQ", sequenceName = "seq_metodopagamento", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "METODOPAGAMENTO_SEQ", strategy = GenerationType.IDENTITY)
    
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "numero_parcelas", nullable = false)
    private String nmeroParcelas;
    
    @Column(name = "numero_cartao", nullable = false)
    private String numeroCartao;
    
    @Column(name = "nome_cartao")
    private String nomeCartao;
    
    @Column(name = "tipo_pagamento", nullable = false)
    private String tipoPagamento;
    
    @Column(name = "data_validade", nullable = false)
    @Basic
    @Temporal(TemporalType.DATE)
    private java.util.Date  dataValidade;
    
    @Column(name = "codigo_seguranca", nullable = false)
    private String codigoSeguranca;
         
    @OneToOne
    @JoinColumn(name = "viagem_cliente_id")
    private ViagemCliente viagemCliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNmeroParcelas() {
        return nmeroParcelas;
    }

    public void setNmeroParcelas(String nmeroParcelas) {
        this.nmeroParcelas = nmeroParcelas;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public ViagemCliente getViagemCliente() {
        return viagemCliente;
    }

    public void setViagemCliente(ViagemCliente viagemCliente) {
        this.viagemCliente = viagemCliente;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public MetodoPagamento() {
    }
}
