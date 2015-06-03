package doCondivisi;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Luna
 */
@Entity
public class GruppoUtenti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeGruppo;

    @OneToMany
    private List<Utente> utenti;
    
    /**
     * Test if the object of type Utente passed as param is part of the List utenti
     * @param u The object to be verified
     * @return true in case of succes, false otherwise
     */
    public boolean appartiene(Utente u){
        return true;
    }
    
    /**
     * Add an object of type Utente to the List utenti
     * @param u The object that will be added to the List utenti
     * 
     */
    public void aggiungi(Utente u){
        
    }
    
    /**
     * Remove an object of type Utente from the List utenti
     * @param u The object that will be removed from the List utenti
     * 
     */
    public void rimuovi(Utente u){
        
    }
    
    /**
     * Remove the whole object from the database
     * 
     */
    public void delete(){
        
    }

    /**
     * Create an empty object
     */
    public GruppoUtenti() {
    }

    /**
     * Get the value of utenti
     *
     * @return the value of utenti
     */
    public List<Utente> getUtenti() {
        return utenti;
    }

    /**
     * Set the value of utenti
     *
     * @param utenti new value of utenti
     */
    public void setUtenti(List<Utente> utenti) {
        this.utenti = utenti;
    }

    /**
     * Get the value of nomeGruppo
     *
     * @return the value of nomeGruppo
     */
    public String getNomeGruppo() {
        return nomeGruppo;
    }

    /**
     * Set the value of nomeGruppo
     *
     * @param nomeGruppo new value of nomeGruppo
     */
    public void setNomeGruppo(String nomeGruppo) {
        this.nomeGruppo = nomeGruppo;
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
        if (!(object instanceof GruppoUtenti)) {
            return false;
        }
        GruppoUtenti other = (GruppoUtenti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.GruppoUtenti[ id=" + id + " ]";
    }
    
}
