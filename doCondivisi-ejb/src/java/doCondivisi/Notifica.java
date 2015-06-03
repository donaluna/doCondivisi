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
public class Notifica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titolo;

    private String corpo;

    private String dataInvio;

    @ManyToOne
    private Utente mittente;

    @ManyToOne
    private GruppoUtenti gruppoDestinatario;

    @ManyToOne
    private Utente utenteDestinatario;

    @ManyToOne
    private Pubblicazione pubblicazione;

    /**
     * Get the value of pubblicazione
     *
     * @return the value of pubblicazione
     */
    public Pubblicazione getPubblicazione() {
        return pubblicazione;
    }

    /**
     * Set the value of pubblicazione
     *
     * @param pubblicazione new value of pubblicazione
     */
    public void setPubblicazione(Pubblicazione pubblicazione) {
        this.pubblicazione = pubblicazione;
    }

    /**
     * Create an empty object
     */
    public Notifica() {
    }

    /**
     * Send the notification to the destination 
     */
    public void invia(){
        
    }
    
    /**
     * Set the notification as 'read' for the current user
     */
    public void leggi(){
        
    }
    
    /**
     * Set the notification as 'archivied' for the current user
     */
    public void archivia(){
        
    }
    /**
     * Get the value of utenteDestinatario
     *
     * @return the value of utenteDestinatario
     */
    public Utente getUtenteDestinatario() {
        return utenteDestinatario;
    }

    /**
     * Set the value of utenteDestinatario
     *
     * @param utenteDestinatario new value of utenteDestinatario
     */
    public void setUtenteDestinatario(Utente utenteDestinatario) {
        this.utenteDestinatario = utenteDestinatario;
    }

    /**
     * Get the value of gruppoDestinatario
     *
     * @return the value of gruppoDestinatario
     */
    public GruppoUtenti getGruppoDestinatario() {
        return gruppoDestinatario;
    }

    /**
     * Set the value of gruppoDestinatario
     *
     * @param gruppoDestinatario new value of gruppoDestinatario
     */
    public void setGruppoDestinatario(GruppoUtenti gruppoDestinatario) {
        this.gruppoDestinatario = gruppoDestinatario;
    }

    /**
     * Get the value of mittente
     *
     * @return the value of mittente
     */
    public Utente getMittente() {
        return mittente;
    }

    /**
     * Set the value of mittente
     *
     * @param mittente new value of mittente
     */
    public void setMittente(Utente mittente) {
        this.mittente = mittente;
    }

    /**
     * Get the value of dataInvio
     *
     * @return the value of dataInvio
     */
    public String getDataInvio() {
        return dataInvio;
    }

    /**
     * Set the value of dataInvio
     *
     * @param dataInvio new value of dataInvio
     */
    public void setDataInvio(String dataInvio) {
        this.dataInvio = dataInvio;
    }

    /**
     * Get the value of corpo
     *
     * @return the value of corpo
     */
    public String getCorpo() {
        return corpo;
    }

    /**
     * Set the value of corpo
     *
     * @param corpo new value of corpo
     */
    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    /**
     * Get the value of titolo
     *
     * @return the value of titolo
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Set the value of titolo
     *
     * @param titolo new value of titolo
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
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
        if (!(object instanceof Notifica)) {
            return false;
        }
        Notifica other = (Notifica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.Notifica[ id=" + id + " ]";
    }
    
}
