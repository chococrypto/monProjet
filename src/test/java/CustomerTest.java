
import com.google.gson.stream.JsonReader;
import dao.PersoneDao;
import domaine.Customer;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CustomerTest {

    private PersoneDao personeDao;
    @BeforeTest
    protected void setUp(){
        personeDao = mock(PersoneDao.class);
    }

    @Test
    public void compareToEqualsTest(){
        Customer customer1 = new Customer(1,"tot@hotmail.com","09876534567","toto","tata", new Date());
        Customer customer2 = new Customer(1,"tot@hotmail.com","09876534567","toto","tata", new Date());
        Assert.assertEquals(customer1.compareTo(customer2),0);
    }
    @Test
    public void compareToPusGrandBATest(){
        Customer a = new Customer(1,"qot@hotmail.com","09876534567","toto","tata", new Date());
        Customer b = new Customer(2,"zot@hotmail.com","09876534567","zoto","diego", new Date());
        Assert.assertTrue(a.compareTo(b) > 0);
    }

    @Test
    public void compareToPusGrandABTest(){
        Customer a = new Customer(1,"qot@hotmail.com","09876534567","toto","anax", new Date());
        Customer b = new Customer(2,"zot@hotmail.com","09876534567","zoto","diego", new Date());
        Assert.assertTrue(a.compareTo(b) < 0);
    }
    @Test
    public void getDataOfCustomerTest(){
        //when(personeDao.jsonReader()).thenReturn()
    }

}
