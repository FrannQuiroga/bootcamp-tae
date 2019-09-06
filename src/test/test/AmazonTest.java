import com.bootcamp.tae.amazon.AmazonHome;
import com.bootcamp.tae.amazon.common.amazonResults.AmazonResults;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Long.parseLong;

public class AmazonTest extends BaseTestSuite {

    private AmazonHome home;

    @Before
    public void init(){
        home = new AmazonHome();
    }

    @Test
    public void testSearch(){
        AmazonHome results = home.typeInSearch("embracing the power of ai: a gentle co-guide");
        AmazonResults aRes = home.clickSearch();
        Assert.assertFalse(aRes.verifyTitle("embracing the power of ai: a gentle co-guide")); // el titulo del ejercicio no concuerda con el buscado, si el Assert fuese assertTrue, se rompe aca.
        Assert.assertTrue(aRes.verifyPrice());
        Assert.assertTrue(aRes.verifyImage());
        aRes.clickChosenCard();


    }
}
