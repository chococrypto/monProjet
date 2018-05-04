
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import dao.PersoneDao;
import dao.Reader;
import domaine.Persone;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PersonneDaoTest {

    private Reader reader;
    private PersoneDao dao;
    @BeforeTest
    public void setUp(){
        reader = mock(Reader.class);
        dao = new PersoneDao(reader);
    }

    @Test
    public void getDataOfCustomerTest(){
        when(reader.jsonArray()).thenReturn(new JsonParser().parse("[]").getAsJsonArray());
        List<Persone> persones = dao.datas();
        Assert.assertEquals(persones.size(), 0);
    }

    @Test
    public void getDataOfCustomerSingleTest(){
        when(reader.jsonArray()).thenReturn(new JsonParser().parse("[{'num':1}]").getAsJsonArray());
        List<Persone> persones = dao.datas();
        Assert.assertEquals(persones.size(), 1);
    }
}
