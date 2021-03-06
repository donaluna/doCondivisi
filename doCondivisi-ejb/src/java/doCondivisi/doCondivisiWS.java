/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doCondivisi;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Luna
 */
@WebService(serviceName = "doCondivisiWS")
@Stateless()
public class doCondivisiWS {
    @EJB
    private DocumentiFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "documenti") Documenti documenti) {
        ejbRef.create(documenti);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "documenti") Documenti documenti) {
        ejbRef.edit(documenti);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "documenti") Documenti documenti) {
        ejbRef.remove(documenti);
    }

    @WebMethod(operationName = "find")
    public Documenti find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Documenti> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Documenti> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
