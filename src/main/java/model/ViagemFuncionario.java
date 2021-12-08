package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;


@Entity(name = "viagemfun")
@Table(name = "viagemfuncionario")

public class ViagemFuncionario implements Serializable {
    
    @Id
    @SequenceGenerator(name = "VIAGEMFUNCIONARIO_SEQ", sequenceName = "seq_viagemfuncionario", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "VIAGEMFUNCIONARIO_SEQ", strategy = GenerationType.IDENTITY)
    
    @Column(name = "id", nullable = false)
    private Integer id;
         
    @ManyToOne()
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "viagem_id")
    private Viagem viagem;
    
    @ManyToOne()
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
    
   