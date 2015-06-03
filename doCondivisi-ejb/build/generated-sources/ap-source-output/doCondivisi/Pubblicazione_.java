package doCondivisi;

import doCondivisi.GruppoUtenti;
import doCondivisi.Sede;
import doCondivisi.Utente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-03T15:15:15")
@StaticMetamodel(Pubblicazione.class)
public class Pubblicazione_ extends Documento_ {

    public static volatile SingularAttribute<Pubblicazione, String> dataPubblicazione;
    public static volatile SingularAttribute<Pubblicazione, GruppoUtenti> gruppoDestinatario;
    public static volatile SingularAttribute<Pubblicazione, Sede> sedeDestinataria;
    public static volatile SingularAttribute<Pubblicazione, Utente> utenteDestinatario;

}