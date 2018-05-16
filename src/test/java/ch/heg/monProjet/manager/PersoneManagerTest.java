package ch.heg.monProjet.manager;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersoneManagerTest {
    private PersoneManager manager;
    @BeforeTest
    public void setUp(){
        manager = new PersoneManager();
    }
    @Test
    public void testGetListNull(){
        Assert.assertNull(manager.getPersones());
    }

}
