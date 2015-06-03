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
public class Pubblicazione extends Documento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String dataPubblicazione;

    @ManyToOne
    private GruppoUtenti gruppoDestinatario;
    
    @ManyToOne
    private Utente utenteDestinatario;
    
    @ManyToOne
    private Sede sedeDestinataria;

    /**
     * Get the value of sedeDestinataria
     *
     * @return the value of sedeDestinataria
     */
    public Sede getSedeDestinataria() {
        return sedeDestinataria;
    }

    /**
     * Set the value of sedeDestinataria
     *
     * @param sedeDestinataria new value of sedeDestinataria
     */
    public void setSedeDestinataria(Sede sedeDestinataria) {
        this.sedeDestinataria = sedeDestinataria;
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
     * Get the value of gruppo
     *
     * @return the value of gruppo
     */
    public GruppoUtenti getGruppoDestinatario() {
        return this.gruppoDestinatario;
    }

    /**
     * Set the value of gruppo
     *
     * @param gruppo new value of gruppo
     */
    public void setGruppo(GruppoUtenti gruppo) {
        this.gruppoDestinatario = gruppo;
    }

    /**
     * Get the value of dataPubblicazione
     *
     * @return the value of dataPubblicazione
     */
    public String getDataPubblicazione() {
        return dataPubblicazione;
    }

    /**
     * Set the value of dataPubblicazione
     *
     * @param dataPubblicazione new value of dataPubblicazione
     */
    public void setDataPubblicazione(String dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }


    @Override
    public Long getId() {
        return id;
    }

    @Override
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
        if (!(object instanceof Pubblicazione)) {
            return false;
        }
        Pubblicazione other = (Pubblicazione) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.Pubblicazione[ id=" + id + " ]";
    }
    
}
