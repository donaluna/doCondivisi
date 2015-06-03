package doCondivisi;

import java.util.List;

/**
 *
 * @author Luna
 */
public class ListaDocumenti {

    private List<Documenti> documenti;

    private Utente proprietario;
    
    /**
     * Create an empty object
     */
    public ListaDocumenti() {
    }

    /**
     * Get the value of proprietario
     *
     * @return the value of proprietario
     */
    public Utente getProprietario() {
        return proprietario;
    }

    /**
     * Set the value of proprietario
     *
     * @param proprietario new value of proprietario
     */
    public void setProprietario(Utente proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * Get the value of documenti
     *
     * @return the value of documenti
     */
    public List<Documenti> getDocumenti() {
        return documenti;
    }

    /**
     * Set the value of documenti
     *
     * @param documenti new value of documenti
     */
    public void setDocumenti(List<Documenti> documenti) {
        this.documenti = documenti;
    }
    
}
