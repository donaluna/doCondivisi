/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doCondivisi;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Luna
 */
@Entity
public class Sede implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private Recapito indirizzo;

    private List<Utente> elencoUtenti;

    /**
     * Create an empty object
     */
    public Sede() {
    }

    /**
     * Create an empty object and set the params as values to the properties
     */
    public Sede(String nome, Recapito indirizzo, List<Utente> elencoUtenti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.elencoUtenti = elencoUtenti;
    }

    /**
     * Assign the param utente to the selected Sede
     * @param utente the user to be added to the selected object
     * @return the result of the action
     * 
     */
    public boolean aggiungiUtente(Utente utente){
        return true;
    }
    
    /**
     * Removed the param utente to the selected Sede
     * @param utente the user to be added to the selected object
     * @return the result of the action
     * 
     */
    public boolean rimuoviUtente(Utente utente){
        return true;
    }
    
    
    /**
     * Get the value of elencoUtenti
     *
     * @return the value of elencoUtenti
     */
    public List<Utente> getElencoUtenti() {
        return elencoUtenti;
    }

    /**
     * Set the value of elencoUtenti
     *
     * @param elencoUtenti new value of elencoUtenti
     */
    public void setElencoUtenti(List<Utente> elencoUtenti) {
        this.elencoUtenti = elencoUtenti;
    }

    /**
     * Get the value of indirizzo
     *
     * @return the value of indirizzo
     */
    public Recapito getIndirizzo() {
        return indirizzo;
    }

    /**
     * Set the value of indirizzo
     *
     * @param indirizzo new value of indirizzo
     */
    public void setIndirizzo(Recapito indirizzo) {
        this.indirizzo = indirizzo;
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
        if (!(object instanceof Sede)) {
            return false;
        }
        Sede other = (Sede) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.Sede[ id=" + id + " ]";
    }
    
}
