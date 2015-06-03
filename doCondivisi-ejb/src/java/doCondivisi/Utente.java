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
import javax.persistence.ManyToOne;

/**
 *
 * @author Luna
 */
@Entity
public class Utente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String cognome;
    
    @ManyToOne
    private Recapito domicilio;

    @ManyToOne
    private Sede sede;


    /** 
     * Create a new empty element
     */
    public Utente() {
    }

    
    /** 
     * Create a new  element and set the passed values
     * @param nome A string that will set the property 'nome'
     * @param cognome A string that will set the property 'cognome'
     * @param domicilio An object of type 'Recapito' that will set the property 'domicilio'
     * @param sede An objet of type 'Sede' that will set the property 'sede'
     */
    public Utente(String nome, String cognome, Recapito domicilio, Sede sede) {
        this.nome = nome;
        this.cognome = cognome;
        this.domicilio = domicilio;
        this.sede = sede;
    }

    /**
     * Get the value of sede
     *
     * @return the value of sede
     */
    public Sede getSede() {
        return sede;
    }

    /**
     * Set the value of sede
     *
     * @param sede new value of sede
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }

    /**
     * Get the value of domicilio
     *
     * @return the value of domicilio
     */
    public Recapito getDomicilio() {
        return domicilio;
    }

    /**
     * Set the value of domicilio
     *
     * @param domicilio new value of domicilio
     */
    public void setDomicilio(Recapito domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Get the value of cognome
     *
     * @return the value of cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Set the value of cognome
     *
     * @param cognome new value of cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
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
        if (!(object instanceof Utente)) {
            return false;
        }
        Utente other = (Utente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.Utente[ id=" + id + " ]";
    }
    
}
