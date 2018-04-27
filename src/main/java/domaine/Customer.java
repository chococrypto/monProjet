package domaine;

import java.util.Date;

/**
 * Created by diegoruiz on 04.03.18.
 */
public class Customer extends Persone {

    public Customer(int num, String email, String phone, String firstName, String lastName, Date dateNaissance) {
        super(num, email, phone, firstName, lastName, dateNaissance);
    }
    public Customer(int num){
        super(num);
    }
}
