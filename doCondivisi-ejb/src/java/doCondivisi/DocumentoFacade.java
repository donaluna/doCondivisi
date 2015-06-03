/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doCondivisi;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Luna
 */
@Stateless
public class DocumentoFacade extends AbstractFacade<Documento> implements DocumentoFacadeLocal {
    @PersistenceContext(unitName = "doCondivisi-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocumentoFacade() {
        super(Documento.class);
    }
    
}
