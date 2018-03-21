import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import domaine.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


/**
 * Created by diegoruiz on 21.03.18.
 */
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1,"tot@hotmail.com","09876534567","toto","tata", new Date());
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(customer));

         Logger logger = LoggerFactory.getLogger(Customer.class);
        logger.info("Ecrire quelque chose d'utile");

    }
}
