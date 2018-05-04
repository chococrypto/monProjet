package ch.heg.monProjet.dao;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * Created by diegoruiz on 04.05.18.
 */
public class Reader {

    private static String PATH_FILE = "src/main/resources/data.txt";
    public JsonArray jsonArray(){
        FilePath f = new FilePath();
        try{
            JsonParser jsonParser = new JsonParser();
            JsonReader reader = new JsonReader(new InputStreamReader( new FileInputStream(f.path())));
            return  jsonParser.parse(reader).getAsJsonArray();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public class FilePath{
        public String path(){
            return PATH_FILE;
        }
    }
}
