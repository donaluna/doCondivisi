package doCondivisi;

import doCondivisi.Recapito;
import doCondivisi.Sede;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-03T15:15:15")
@StaticMetamodel(Utente.class)
public class Utente_ { 

    public static volatile SingularAttribute<Utente, Long> id;
    public static volatile SingularAttribute<Utente, Recapito> domicilio;
    public static volatile SingularAttribute<Utente, Sede> sede;
    public static volatile SingularAttribute<Utente, String> nome;
    public static volatile SingularAttribute<Utente, String> cognome;

}