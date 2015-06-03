package doCondivisi;

import doCondivisi.Utente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-03T15:15:15")
@StaticMetamodel(Documento.class)
public class Documento_ { 

    public static volatile SingularAttribute<Documento, Long> id;
    public static volatile SingularAttribute<Documento, Utente> proprietario;
    public static volatile SingularAttribute<Documento, String> titolo;
    public static volatile SingularAttribute<Documento, String> dataDocumento;
    public static volatile SingularAttribute<Documento, String> note;

}