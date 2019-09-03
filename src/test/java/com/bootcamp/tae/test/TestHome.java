package com.bootcamp.tae.test;

import com.bootcamp.tae.pages.component.Calendar;
import com.bootcamp.tae.pages.pageObject.Home;
import com.bootcamp.tae.pages.pageObject.SearchBox;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import com.google.common.html.HtmlEscapers;
import jdk.internal.util.xml.impl.Input;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class TestHome extends BaseTestSuite {

    @Test
    public void homeTest(){
        Home home = new Home();
        home.clickOnAccommodations();
    }
    @Test
    public void SearchTest(){
        SearchBox searchBox = new SearchBox();
        searchBox.searchCity();
        searchBox.checkIn();
    }
    @Test
    public void checkIn(){
        SearchBox searchBox = new SearchBox();
        searchBox.checkIn();
    }
}
