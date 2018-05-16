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

    private final FilePath filePath;

    public Reader(FilePath filePath) {
        this.filePath = filePath;
    }

    public JsonArray jsonArray(){
        try{
            JsonParser jsonParser = new JsonParser();
            JsonReader reader = new JsonReader(new InputStreamReader( new FileInputStream(filePath.path())));
            return  jsonParser.parse(reader).getAsJsonArray();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
