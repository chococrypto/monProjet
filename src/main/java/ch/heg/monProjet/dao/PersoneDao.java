package ch.heg.monProjet.dao;

import com.google.gson.*;
import ch.heg.monProjet.domaine.Customer;
import ch.heg.monProjet.domaine.Persone;

import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;

import java.util.List;

import static ch.heg.monProjet.domaine.Persone.FORMAT_DATE;

/**
 * Created by diegoruiz on 02.05.18.
 */
public class PersoneDao {

    private final Reader reader;
    public PersoneDao(Reader reader){
        this.reader = reader;
    }
    public List<Persone> datas() {
            List<Persone> lst = new ArrayList<>();
            JsonArray userArray = reader.jsonArray();
            for (JsonElement one : userArray){
                JsonObject ob = one.getAsJsonObject();
                String br = ob.get("birthday").getAsString().split(" ")[0];
                Date birthday = null;
                try {
                    birthday = FORMAT_DATE.parse(br);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                lst.add(new Customer(
                        ob.get("num").getAsInt(),
                        ob.get("email").getAsString(),
                        ob.get("phone").getAsString(),
                        ob.get("firstName").getAsString(),
                        ob.get("lastName").getAsString(),
                        birthday
                        ));
            }
        return lst;
    }
}


