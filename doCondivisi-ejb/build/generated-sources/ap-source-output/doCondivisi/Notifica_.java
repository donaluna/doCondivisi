package doCondivisi;

import doCondivisi.GruppoUtenti;
import doCondivisi.Pubblicazione;
import doCondivisi.Utente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-03T15:15:15")
@StaticMetamodel(Notifica.class)
public class Notifica_ { 

    public static volatile SingularAttribute<Notifica, Long> id;
    public static volatile SingularAttribute<Notifica, String> corpo;
    public static volatile SingularAttribute<Notifica, String> dataInvio;
    public static volatile SingularAttribute<Notifica, GruppoUtenti> gruppoDestinatario;
    public static volatile SingularAttribute<Notifica, Utente> mittente;
    public static volatile SingularAttribute<Notifica, String> titolo;
    public static volatile SingularAttribute<Notifica, Pubblicazione> pubblicazione;
    public static volatile SingularAttribute<Notifica, Utente> utenteDestinatario;

}