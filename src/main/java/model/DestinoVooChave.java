package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DestinoVooChave implements Serializable {
    
    @Column(name = "viagem_id")
    private int viagemId;
            
    @Column(name = "aeroporto_id")
    private int aeroportoId;

    public DestinoVooChave() {
    }

    public int getViagemId() {
        return viagemId;
    }

    public void setViagemId(int viagemId) {
        this.viagemId = viagemId;
    }

    public int getAeroportoId() {
        return aeroportoId;
    }

    public void setAeroportoId(int aeroportoId) {
        this.aeroportoId = aeroportoId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.viagemId;
        hash = 53 * hash + this.aeroportoId;
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
        final DestinoVooChave other = (DestinoVooChave) obj;
        if (this.viagemId != other.viagemId) {
            return false;
        }
        if (this.aeroportoId != other.aeroportoId) {
            return false;
        }
        return true;
    }

             
}
