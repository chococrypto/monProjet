package ch.heg.monProjet.dao;

import com.google.gson.JsonArray;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by diegoruiz on 04.05.18.
 */
public class ReaderTest {

    private FilePath filePath;
    private Reader reader;

    @BeforeTest
    public void setUp(){
        filePath = mock(FilePath.class);
        reader = new Reader(filePath);
    }

    @Test
    public void testPathIsSpecify(){
        when(filePath.path()).thenReturn("src/main/resources/data.txt");
        Assert.assertEquals(reader.jsonArray().getClass(),JsonArray.class);
    }
    @Test
    public void testPathIsNotSpecify(){
        when(filePath.path()).thenReturn("");
        Assert.assertThrows(RuntimeException.class,()->reader.jsonArray());
    }
}
