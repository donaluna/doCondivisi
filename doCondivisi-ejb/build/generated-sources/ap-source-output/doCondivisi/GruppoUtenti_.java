package doCondivisi;

import doCondivisi.Utente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-03T15:15:15")
@StaticMetamodel(GruppoUtenti.class)
public class GruppoUtenti_ { 

    public static volatile SingularAttribute<GruppoUtenti, Long> id;
    public static volatile SingularAttribute<GruppoUtenti, String> nomeGruppo;
    public static volatile ListAttribute<GruppoUtenti, Utente> utenti;

}