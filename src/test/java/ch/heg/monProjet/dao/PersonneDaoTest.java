package ch.heg.monProjet.dao;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import ch.heg.monProjet.domaine.Persone;
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
    public void testGetDataOfCustomer() {
        when(reader.jsonArray()).thenReturn(new JsonParser().parse("[]").getAsJsonArray());
        List<Persone> persones = dao.datas();
        Assert.assertEquals(persones.size(), 0);
    }

    @Test
    public void testGetDataOfCustomerSingle(){
        when(reader.jsonArray()).thenReturn(new JsonParser().parse("[{'num':1}]").getAsJsonArray());
        Assert.assertThrows(NullPointerException.class,()-> dao.datas());
    }
    @Test
    public void testGetDataOfCustomerComplet(){
        when(reader.jsonArray()).thenReturn(new JsonParser().parse("[{'num':1,'email':'Aliquam.erat.volutpat@idmagnaet.co.uk','phone':'406-9659','firstName':'Quentin','lastName':'Santos','birthday':'2018-07-16 22:05:28'}]").getAsJsonArray());
        List<Persone> persones = dao.datas();
        Assert.assertEquals(persones.size(), 1);
    }
    @Test void testGetDataWithOtherJsonObject(){
        when(reader.jsonArray()).thenReturn(new JsonParser().parse("[{'num':1,'email':'Aliquam.erat.volutpat@idmagnaet.co.uk','phone':'406-9659','firstName':'Quentin','lastName':'Santos','birthday':''}]").getAsJsonArray());
        Assert.assertThrows(RuntimeException.class,()-> dao.datas());
    }
    
}
