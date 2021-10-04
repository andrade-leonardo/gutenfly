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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "viagemfun")
@Table(name = "viagemfuncionario")

public class ViagemFuncionario implements Serializable {
    
    @Id
    @SequenceGenerator(name = "VIAGEMFUNCIONARIO_SEQ", sequenceName = "seq_viagemfuncionario", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VIAGEMFUNCIONARIO_SEQ", strategy = GenerationType.SEQUENCE)
    
    @ManyToMany
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    
    @ManyToMany
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;

    public ViagemFuncionario() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }
}
    
   