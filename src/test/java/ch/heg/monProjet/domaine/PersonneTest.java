package ch.heg.monProjet.domaine;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Date;




public class PersonneTest {

    Persone persone1,persone2;

    @Test
    public void testCompareToEquals(){
        persone1 = new Customer(1,"tot@hotmail.com","09876534567","toto","tata", new Date());
        persone2 = new Customer(1,"tot@hotmail.com","09876534567","toto","tata", new Date());
        Assert.assertEquals(persone1.compareTo(persone2),0);
    }
    @Test
    public void testCompareToPusGrandBA(){
        persone1  = new Customer(1,"qot@hotmail.com","09876534567","toto","tata", new Date());
        persone2 = new Customer(2,"zot@hotmail.com","09876534567","zoto","diego", new Date());
        Assert.assertTrue(persone1.compareTo(persone2) > 0);
    }

    @Test
    public void testCompareToPusGrandAB(){
        persone1 = new Customer(1,"qot@hotmail.com","09876534567","toto","anax", new Date());
        persone2 = new Customer(2,"zot@hotmail.com","09876534567","zoto","diego", new Date());
        Assert.assertTrue(persone1.compareTo(persone2) < 0);
    }

    @Test
    public void testCompareToOneArg(){
        persone1 = new Customer(1);
        persone2 = new Customer(2);
        Assert.assertTrue(persone1.compareTo(persone2) < 0);
    }
    @Test
    public void testCompareToOneArgEquals() {
        persone1 = new Customer(1);
        persone2 = new Customer(1);
        Assert.assertEquals(persone1.compareTo(persone2), 0);
    }

    @Test
    public void testNoEqualsMultArg(){
        persone1  = new Customer(1,"qot@hotmail.com","09876534567","toto","tata", new Date());
        persone2 = new Customer(2,"zot@hotmail.com","09876534567","zoto","diego", new Date());
        Assert.assertNotEquals(persone1,persone2);
    }
    @Test
    public void testNotEqualsMultArgWithSameID(){
        persone1  = new Customer(1,"qot@hotmail.com","09876534567","toto","tata", new Date());
        persone2 = new Customer(1,"zot@hotmail.com","09876534567","zoto","diego", new Date());
        Assert.assertNotEquals(persone1,persone2);
    }
    @Test
    public void testNotEqualsMultArgWithSameIDEmail(){
        persone1  = new Customer(1,"qot@hotmail.com","09871534567","toto","tata", new Date());
        persone2 = new Customer(1,"qot@hotmail.com","09876534567","zoto","diego", new Date());
        Assert.assertNotEquals(persone1,persone2);
    }
    @Test
    public void testNotEqualsMultArgWithSameIDPhone(){
        persone1  = new Customer(1,"qot@hotmail.com","09876534567","toto","tata", new Date());
        persone2 = new Customer(1,"zot@hotmail.com","09876534567","zoto","diego", new Date());
        Assert.assertNotEquals(persone1,persone2);
    }
    @Test
    public void testEqualsMultArg(){
        persone1  = new Customer(1,"zot@hotmail.com","09876534567","toto","tata", new Date());
        persone2 = new Customer(1,"zot@hotmail.com","09876534567","zoto","diego", new Date());
        Assert.assertEquals(persone1,persone2);
    }
    @Test
    public void testEqualsOnetArg(){
        persone1  = new Customer(1);
        persone2 = new Customer(1);
        Assert.assertEquals(persone1,persone2);
    }
    @Test
    public void testNoEqualsOnetArg(){
        persone1  = new Customer(1);
        persone2 = new Customer(2);
        Assert.assertNotEquals(persone1,persone2);
    }


}
