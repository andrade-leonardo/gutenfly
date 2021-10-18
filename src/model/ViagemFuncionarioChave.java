package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ViagemFuncionarioChave implements Serializable {
 
    @Column(name = "viagem_id")
    private int viagemId;
            
    @Column(name = "funcionario_id")
    private int funcionarioId;

    public ViagemFuncionarioChave() {
    }

    public int getViagemId() {
        return viagemId;
    }

    public void setViagemId(int viagemId) {
        this.viagemId = viagemId;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.viagemId;
        hash = 47 * hash + this.funcionarioId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ViagemFuncionarioChave other = (ViagemFuncionarioChave) obj;
        if (this.viagemId != other.viagemId) {
            return false;
        }
        if (this.funcionarioId != other.funcionarioId) {
            return false;
        }
        return true;
    }
}
