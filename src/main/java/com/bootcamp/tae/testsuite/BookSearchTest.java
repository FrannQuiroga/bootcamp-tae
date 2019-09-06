package com.bootcamp.tae.testsuite;

import com.bootcamp.tae.book.BookSearch;
import com.bootcamp.tae.browser.Browsers;
import com.bootcamp.tae.driver.Driver;
import com.bootcamp.tae.platform.Platform;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BookSearchTest extends BaseTestSuite {

    private WebDriver webDriver;
    private Driver driver;

    @Before
    public void initDriver(Driver driver){
        driver=new Driver(Platform.WEB, Browsers.CHROME,webDriver);
    }

    @Test
    public void BookSearchTest(){
        BookSearch results=new BookSearch();
        results.search("embracing the power of ai: a gentle co-guide");
        Assert.assertEquals("embracing the power of ai: a gentle co-guide",results.searchResult());
        results.selectForBuy();
    }



}
