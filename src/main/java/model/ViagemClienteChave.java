package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ViagemClienteChave implements Serializable {
 
    @Column(name = "viagem_id")
    private int viagemId;
            
    @Column(name = "cliente_id")
    private int clienteId;

    public ViagemClienteChave() {
    }

    public int getViagemId() {
        return viagemId;
    }

    public void setViagemId(int viagemId) {
        this.viagemId = viagemId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.viagemId;
        hash = 83 * hash + this.clienteId;
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
        final ViagemClienteChave other = (ViagemClienteChave) obj;
        if (this.viagemId != other.viagemId) {
            return false;
        }
        if (this.clienteId != other.clienteId) {
            return false;
        }
        return true;
    }

   

}
