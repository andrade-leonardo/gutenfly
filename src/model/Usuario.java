package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "us")
@Table(name = "usuario")

public class Usuario implements Serializable {
    
   @Id
   @SequenceGenerator(name = "USUARIO_SEQ", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
   @GeneratedValue(generator = "USUARIO_SEQ", strategy = GenerationType.IDENTITY)
    
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "email", length = 100, nullable = false)
    private String email;
    
    @Column(name = "senha", length = 100, nullable = false)
    private String senha;
    
    @Column(name = "status", nullable = false)
    private Boolean status;

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
