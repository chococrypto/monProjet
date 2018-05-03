import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.PersoneDao;
import domaine.Customer;
import java.io.IOException;
import java.util.Date;


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
        new PersoneDao().datas();

    }
}
