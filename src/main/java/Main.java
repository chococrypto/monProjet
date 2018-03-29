import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import domaine.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import outils.Validation;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;


/**
 * Created by diegoruiz on 21.03.18.
 */
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1,"tot@hotmail.com","09876534567","toto","tata", new Date());
        /*GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(customer));*/
        //System.out.println(Validation.isDoubleValid("1"));
       /*Logger logger = LoggerFactory.getLogger(Main.class);
       logger.info("Ecrire quelque chose d'utile");*/

        //faire : géneration un fichier manif qui point vers le fichier Main.java
        // creer des jar à partir des point class puis l'intsaller en local
        //configuer le builder --> pom.xml -> Manifest.MF
        //Creer un uberJar dans un Profil (Pom)


        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src/main/resources/application.properties"));
            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                System.out.println("Key: " + key + "  Value: " + value);
            }

        } catch (IOException e) {
            System.out.println("Exception Occurred " + e.getMessage());
        }

        //filtrage
        //mvn [compile|package]-Dapplication.version=1
    }
}