package com.bootcamp.tae.pages.common.test;

import com.bootcamp.tae.pages.common.pages.CartPage;
import com.bootcamp.tae.pages.common.pages.Home;
import com.bootcamp.tae.pages.common.pages.SearchResultsPage;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAmazon extends BaseTestSuite {

    private Home homepage;

    @Before
    public void init(){homepage = new Home();}

    @Test
    public void testExercise() throws InterruptedException {

        /*
                homepage.searchInCategory("embracing the power of ai: a gentle co-guide",5)
                .openResult(0)
                .pressAddToCartButton()
                .pressCartButton()
                .clickIsGift()
                .deleteItem();
         */
        String search = "embracing the power of ai: a gentle co-guide";
        int categoryIndex = 5;
        int resultNumber = 0; //0 for first

        SearchResultsPage test = homepage.searchInCategory(search,categoryIndex);
        //Assert.assertTrue(test.getTitleOfItem(resultNumber).equals(search)); //title equals
        Assert.assertTrue(test.getImageOfItemVisibility(resultNumber)); //is visible
        //Assert.assertTrue(test.getPriceOfItem(resultNumber)>0); //price > 0

        CartPage test2 = test.openResult(0)
                .pressAddToCartButton()
                .pressCartButton();


        //Faltan algunos asserts
        test2.clickIsGift()
             .deleteItem();

        //Fin del tiempo




        Thread.sleep(10000);


    }


}
