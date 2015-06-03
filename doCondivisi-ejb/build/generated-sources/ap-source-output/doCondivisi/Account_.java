package doCondivisi;

import doCondivisi.TipoAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-03T15:15:15")
@StaticMetamodel(Account.class)
public class Account_ extends Utente_ {

    public static volatile SingularAttribute<Account, String> email;
    public static volatile SingularAttribute<Account, String> dataRegistrazione;
    public static volatile SingularAttribute<Account, TipoAccount> tipo;
    public static volatile SingularAttribute<Account, String> dataDisattivazione;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, String> dataUltimoLogin;

}