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
    private Reader.FilePath filePath;
    private Reader reader;
    @BeforeTest
    public void setUp(){
        filePath = mock(Reader.FilePath.class);
        reader = new Reader();
    }
    @Test
    public void testPathIsSpecify(){
        when(filePath.path()).thenReturn("src/main/resources/data.txt");
        Assert.assertEquals(reader.jsonArray().getClass(),JsonArray.class);
    }
}
