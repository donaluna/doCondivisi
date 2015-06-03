package doCondivisi;

import java.util.List;

/**
 *
 * @author Luna
 */
public class Log {
    private List<Evento> eventi;

    /**
     * Create an empty object
     */
    public Log() {
    }
    /**
     * Get the value of eventi
     *
     * @return the value of eventi
     */
    public List<Evento> getEventi() {
        return eventi;
    }

    /**
     * Set the value of eventi
     *
     * @param eventi new value of eventi
     */
    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }

    /**
     * Add a  new object Evento in the database
     * @param e The object of type Evento that will be added to the database
     */
    public void aggiungiEvento(Evento e){
        
    }
    
    
    /**
     * Remove an object of type Evento in the database
     * @param e The object of type Evento that will be removed from the database
     */
    public void rimuoviEvento(Evento e){
        
    }
}
