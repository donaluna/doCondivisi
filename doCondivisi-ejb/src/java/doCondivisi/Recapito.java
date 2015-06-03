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

/**
 *
 * @author Luna
 */
@Entity
public class Recapito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String indirizzo;

    private String comune;

    private String provincia;

    private String cap;

    public Recapito() {
    }
    
    /**
     * Get the value of cap
     *
     * @return the value of cap
     */
    public String getCap() {
        return cap;
    }

    /**
     * Set the value of cap
     *
     * @param cap new value of cap
     */
    public void setCap(String cap) {
        this.cap = cap;
    }

    public Recapito(String indirizzo, String comune, String provincia, String cap) {
        this.indirizzo = indirizzo;
        this.comune = comune;
        this.provincia = provincia;
        this.cap = cap;
    }
    
    
    /**
     * Delete the persistent object from the database
     */
    public void delete(){
        
    }
    
    /**
     * Get the value of provincia
     *
     * @return the value of provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Set the value of provincia
     *
     * @param provincia new value of provincia
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Get the value of comune
     *
     * @return the value of comune
     */
    public String getComune() {
        return comune;
    }

    /**
     * Set the value of comune
     *
     * @param comune new value of comune
     */
    public void setComune(String comune) {
        this.comune = comune;
    }
    /**
     * Get the value of indirizzo
     *
     * @return the value of indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Set the value of indirizzo
     *
     * @param indirizzo new value of indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Recapito)) {
            return false;
        }
        Recapito other = (Recapito) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.Recapitto[ id=" + id + " ]";
    }
    
}
