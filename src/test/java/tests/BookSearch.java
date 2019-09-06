package tests;

import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;
import pages.Home;
import pages.common.ProductsNavegationBar;

public class BookSearch extends BaseTestSuite {


    private Home home;

    @Before

    public void initHome()
    {
        home = new Home();
    }


    @Test
    public void testBookSearch()
    {
       ProductsNavegationBar navegationBar = home.navegationBar()
                .searchForBooks("embracing the power of ai: a gentle co-guide");
    }

}
