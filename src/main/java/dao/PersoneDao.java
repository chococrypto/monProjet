package dao;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import domaine.Customer;
import domaine.Persone;

import java.util.ArrayList;

import java.io.*;
import java.util.List;

/**
 * Created by diegoruiz on 02.05.18.
 */
public class PersoneDao {

    private final Reader reader;
    public PersoneDao(Reader reader){
        this.reader = reader;
    }

    public List<Persone> datas(){
            List<Persone> lst = new ArrayList<>();
            JsonArray userArray = reader.jsonArray();
            for (JsonElement one : userArray){
                JsonObject ob = one.getAsJsonObject();
                lst.add(new Customer(ob.get("num").getAsInt()));
            }
        return lst;
    }
}


