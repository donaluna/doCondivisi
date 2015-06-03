package doCondivisi;

import doCondivisi.Utente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-03T15:15:14")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, Long> id;
    public static volatile SingularAttribute<Evento, Utente> utente;
    public static volatile SingularAttribute<Evento, String> oggetto;
    public static volatile SingularAttribute<Evento, String> ipEvento;
    public static volatile SingularAttribute<Evento, String> dataEvento;
    public static volatile SingularAttribute<Evento, String> note;

}