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
public class Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String oggetto;

    private String note;

    private String dataEvento;

    @ManyToOne
    private Utente utente;

    private String ipEvento;

    public Evento() {
    }

    /**
     * Log the event in the database
     * 
     */
    public void registraEvento(){
        
    }
    
    /**
     * Delete the event from the database
     */
    public void rimuoviEvento(){
        
    }
        
    /**
     * Get the value of ipEvento
     *
     * @return the value of ipEvento
     */
    public String getIpEvento() {
        return ipEvento;
    }

    /**
     * Set the value of ipEvento
     *
     * @param ipEvento new value of ipEvento
     */
    public void setIpEvento(String ipEvento) {
        this.ipEvento = ipEvento;
    }

    /**
     * Get the value of utente
     *
     * @return the value of utente
     */
    public Utente getUtente() {
        return utente;
    }

    /**
     * Set the value of utente
     *
     * @param utente new value of utente
     */
    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    /**
     * Get the value of dataEvento
     *
     * @return the value of dataEvento
     */
    public String getDataEvento() {
        return dataEvento;
    }

    /**
     * Set the value of dataEvento
     *
     * @param dataEvento new value of dataEvento
     */
    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

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
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.Log[ id=" + id + " ]";
    }
    
}
