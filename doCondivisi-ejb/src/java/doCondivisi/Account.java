/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doCondivisi;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Luna
 */
@Entity
public class Account extends Utente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;

    private String password;

    private String dataUltimoLogin;

    private String dataRegistrazione;

    private String dataDisattivazione;

    @OneToOne
    private TipoAccount tipo;
    /** 
     * Create a new empty element
     */
    public Account() {
    }

    
    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public TipoAccount getTipo() {
        return tipo;
    }

    /**
     * Set the value of tipo
     *
     * @param tipo new value of tipo
     */
    public void setTipo(TipoAccount tipo) {
        this.tipo = tipo;
    }

    /**
     * Get the value of dataDisattivazione
     *
     * @return the value of dataDisattivazione
     */
    public String getDataDisattivazione() {
        return dataDisattivazione;
    }

    /**
     * Set the value of dataDisattivazione
     *
     * @param dataDisattivazione new value of dataDisattivazione
     */
    public void setDataDisattivazione(String dataDisattivazione) {
        this.dataDisattivazione = dataDisattivazione;
    }

    /**
     * Get the value of dataRegistrazione
     *
     * @return the value of dataRegistrazione
     */
    public String getDataRegistrazione() {
        return dataRegistrazione;
    }

    /**
     * Set the value of dataRegistrazione
     *
     * @param dataRegistrazione new value of dataRegistrazione
     */
    public void setDataRegistrazione(String dataRegistrazione) {
        this.dataRegistrazione = dataRegistrazione;
    }

    /**
     * Get the value of dataUltimoLogin
     *
     * @return the value of dataUltimoLogin
     */
    public String getDataUltimoLogin() {
        return dataUltimoLogin;
    }

    /**
     * Set the value of dataUltimoLogin
     *
     * @param dataUltimoLogin new value of dataUltimoLogin
     */
    public void setDataUltimoLogin(String dataUltimoLogin) {
        this.dataUltimoLogin = dataUltimoLogin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.Account[ id=" + id + " ]";
    }
    
}
