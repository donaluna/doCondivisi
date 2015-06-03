/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doCondivisi;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Luna
 */
@Local
public interface DocumentiFacadeLocal {

    void create(Documenti documenti);

    void edit(Documenti documenti);

    void remove(Documenti documenti);

    Documenti find(Object id);

    List<Documenti> findAll();

    List<Documenti> findRange(int[] range);

    int count();
    
}
