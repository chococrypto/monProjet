import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import dao.PersoneDao;
import domaine.Persone;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by diegoruiz on 03.05.18.
 */
public class PersonneDaoTest {


    private JsonArray jsonArray;
    @BeforeTest
    protected void setUp(){
        jsonArray = mock(JsonArray.class);
    }
    @Test
    public void getDataOfCustomerTest(){
        when(jsonArray.getAsJsonArray()).thenReturn(new JsonParser().parse("[{}]").getAsJsonArray());
        ArrayList<Persone> persones = new PersoneDao().datas();
        Assert.assertTrue(persones.size() == 0);
    }

    @Test
    public void getDataOfCustomerSingleTest(){
        when(jsonArray.getAsJsonArray()).thenReturn(new JsonParser().parse("[{'num':1}]").getAsJsonArray());
        ArrayList<Persone> persones = new PersoneDao().datas();
        Assert.assertTrue(persones.size() == 1);
    }
}
