/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doCondivisi;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.transaction.UserTransaction;

/**
 *
 * @author Luna
 */
@Entity
public class Documento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titolo;
    
    private String dataDocumento;
    
    @ManyToOne
    private Utente proprietario;
    
    private String note;

    /**
     * Loads a new file into the document folder 
     * 
     * @param filename The name of the file that will be added to the document
     * @return the result of the action
     * 
     */
    public boolean caricaFile(String filename){
       return true; 
    }  
     
    /**
     * Removes a file from the document folder
     * 
     * @param filename The name of the file tha will be removed from the document
     * @return the result of the action
     */
    public boolean rimuoviFile(String filename){
        return true;
    }
    
    /**
     * Deletes the object from the database
     * 
     */
    public void elimina(){
        
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
     * Get the value of dataDocumento
     *
     * @return the value of dataDocumento
     */
    public String getDataDocumento() {
        return dataDocumento;
    }

    /**
     * Set the value of dataDocumento
     *
     * @param dataDocumento new value of dataDocumento
     */
    public void setDataDocumento(String dataDocumento) {
        this.dataDocumento = dataDocumento;
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
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doCondivisi.Documento[ id=" + id + " ]";
    }

    public void persist(Object object) {
        /* Add this to the deployment descriptor of this module (e.g. web.xml, ejb-jar.xml):
         * <persistence-context-ref>
         * <persistence-context-ref-name>persistence/LogicalName</persistence-context-ref-name>
         * <persistence-unit-name>doCondivisi-ejbPU</persistence-unit-name>
         * </persistence-context-ref>
         * <resource-ref>
         * <res-ref-name>UserTransaction</res-ref-name>
         * <res-type>javax.transaction.UserTransaction</res-type>
         * <res-auth>Container</res-auth>
         * </resource-ref> */
        try {
            Context ctx = new InitialContext();
            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }
    
}
