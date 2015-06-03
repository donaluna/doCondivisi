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
public class Documenti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String oggetto;
    private String autore;
    private String note;

    /**
     * Get the value of note
     *
     * @return the value of note
     */
    public String getNote() {
        return note;
    }

    /**
     * Set the value of note
     *
     * @param note new value of note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Get the value of autore
     *
     * @return the value of autore
     */
    public String getAutore() {
        return autore;
    }

    /**
     * Set the value of autore
     *
     * @param autore new value of autore
     */
    public void setAutore(String autore) {
        this.autore = autore;
    }

    /**
     * Get the value of oggetto
     *
     * @return the value of oggetto
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Set the value of oggetto
     *
     * @param oggetto new value of oggetto
     */
    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
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
        if (!(object instanceof Documenti)) {
            return false;
        }
        Documenti other = (Documenti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.Documenti[ id=" + id + " ]";
    }
    
}
