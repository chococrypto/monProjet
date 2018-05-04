package ch.heg.monProjet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ch.heg.monProjet.dao.PersoneDao;
import ch.heg.monProjet.dao.Reader;
import ch.heg.monProjet.domaine.Customer;
import ch.heg.monProjet.domaine.Persone;

import java.io.IOException;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello");
        System.out.println("===========================");
        Customer customer = new Customer(1,"tot@hotmail.com","09876534567","toto","tata", new Date());
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(customer));
        System.out.println(customer);
        System.out.println("============= 2 =============");
        System.out.println(customer.toJson());
        System.out.println("============= 3 =============");
        PersoneDao dao = new PersoneDao(new Reader());

       List<Persone> lst = dao.datas();
        System.out.println(lst.size());
    }
}
