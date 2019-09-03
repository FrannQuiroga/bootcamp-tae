package com.bootcamp.tae.test;

import com.bootcamp.tae.pages.pageObject.Home;
import com.bootcamp.tae.pages.pageObject.SearchBox;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Test;

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
