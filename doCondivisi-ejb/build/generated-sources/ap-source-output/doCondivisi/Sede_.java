package doCondivisi;

import doCondivisi.Recapito;
import doCondivisi.Utente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-03T15:15:15")
@StaticMetamodel(Sede.class)
public class Sede_ { 

    public static volatile SingularAttribute<Sede, Long> id;
    public static volatile ListAttribute<Sede, Utente> elencoUtenti;
    public static volatile SingularAttribute<Sede, Recapito> indirizzo;
    public static volatile SingularAttribute<Sede, String> nome;

}