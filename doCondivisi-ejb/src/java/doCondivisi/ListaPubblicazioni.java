package doCondivisi;

import java.util.List;

/**
 *
 * @author Luna
 */
public class ListaPubblicazioni {

    private String nome;

    private List<Pubblicazione> pubblicazioni;

    private Utente richiedente;

    /**
     * Create an empty object
     */
    public ListaPubblicazioni() {
    }

    /**
     * Get the value of richiedente
     *
     * @return the value of richiedente
     */
    public Utente getRichiedente() {
        return richiedente;
    }

    /**
     * Set the value of richiedente
     *
     * @param richiedente new value of richiedente
     */
    public void setRichiedente(Utente richiedente) {
        this.richiedente = richiedente;
    }

    /**
     * Get the value of pubblicazioni
     *
     * @return the value of pubblicazioni
     */
    public List<Pubblicazione> getPubblicazioni() {
        return pubblicazioni;
    }

    /**
     * Set the value of pubblicazioni
     *
     * @param pubblicazioni new value of pubblicazioni
     */
    public void setPubblicazioni(List<Pubblicazione> pubblicazioni) {
        this.pubblicazioni = pubblicazioni;
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
    
}
