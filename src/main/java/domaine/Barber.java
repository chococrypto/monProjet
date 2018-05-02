package domaine;

import java.util.Date;

/**
 * Created by diegoruiz on 06.03.18.
 */
public class Barber  extends Persone{
    public Barber(int num, String email, String phone, String firstName, String lastName, Date birthday) {
        super(num, email, phone, firstName, lastName, birthday);
    }
    public Barber(int num){
        super(num);
    }

}
