package dao;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import domaine.Customer;
import domaine.Persone;

import java.util.ArrayList;

import java.io.*;
/**
 * Created by diegoruiz on 02.05.18.
 */
public class PersoneDao {
    private static String PATH_FILE = "src/main/resources/data.txt";
    public  ArrayList<Persone> datas(){
        ArrayList<Persone> lst = new ArrayList<>();
        JsonParser jsonParser = new JsonParser();
        JsonReader reader = jsonReader();
        if(reader != null){
            JsonArray userArray = jsonParser.parse(reader).getAsJsonArray();
            Gson myGson = new Gson();
            for (JsonElement one : userArray){
                JsonObject ob = one.getAsJsonObject();
                lst.add(new Customer(ob.get("num").getAsInt()));
                //lst.add(myGson.fromJson(one, Customer.class));
            }
           // JsonArray objets = userArray.getAsJsonArray("Objets ");
            //System.out.println(objets);
        }

        return lst;
    }
    public JsonReader jsonReader(){
        try {
            return new JsonReader(new InputStreamReader(
                    new FileInputStream(PATH_FILE)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
    }
    class ReadFile {

        private String getDataJson() throws IOException {
            StringBuffer chaine = new StringBuffer("");
            String fichier = ""; //lecture du fichier texte
                InputStream ips = new FileInputStream(fichier);
                InputStreamReader ipsr = new InputStreamReader(ips);
                BufferedReader br = new BufferedReader(ipsr);
                String ligne;
                while ((ligne = br.readLine()) != null) {
                    chaine.append(ligne).append("\n");
                }
                br.close();
            return ligne;
        }
    }
}


