package com.bootcamp.tae.pageobjects.test;

import com.bootcamp.tae.pageobjects.common.Home;
import com.bootcamp.tae.pageobjects.emarket.emarketSearchResult;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class emarketSearchTest extends BaseTestSuite {

    private Home home;

    @Before
    public void init(){

        home= new Home();
    }

    @Test
    public void testSearchResult(){

        emarketSearchResult results=home.topBar()
                .firstButton()
                .selectCategory()
                .typeArticle("embracing the power of ai: a gentle co-guide")
                .search();

        Assert.assertTrue("The name of the title entered is different from the result ",results.checkTitle());

        Assert.assertTrue("The price of the book cannot be cero",results.checkPrice()>=0);

        Assert.assertTrue("The image is not visible",results.checkImage());
    }
}
