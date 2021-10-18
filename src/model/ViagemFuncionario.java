package model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity(name = "viagemfun")
@Table(name = "viagemfuncionario")

public class ViagemFuncionario implements Serializable {
    
    @EmbeddedId
    ViagemFuncionarioChave id;
    
    @ManyToOne
    @MapsId("viagemId")
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
    
    @ManyToOne
    @MapsId("funcionarioId")
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    

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

    public ViagemFuncionarioChave getId() {
        return id;
    }

    public void setId(ViagemFuncionarioChave id) {
        this.id = id;
    }
}
    
   