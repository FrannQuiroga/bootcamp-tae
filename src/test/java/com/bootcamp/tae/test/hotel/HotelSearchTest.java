package com.bootcamp.tae.test.hotel;


import com.bootcamp.tae.pages.Hotel.HotelSearchResults;
import com.bootcamp.tae.pages.pageObject.Home;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelSearchTest extends BaseTestSuite {
    private Home home;
    private HotelSearchResults hotelSearchResults;

    @Before
    public void init() {
        home = new Home();
        hotelSearchResults = new HotelSearchResults();
    }

    @Test
    public void testSearchResults() throws InterruptedException {
        HotelSearchResults results = home.topBar()
                .hotels()
                .typeDestination("Miami Beach")
                .selectDate()
                .selectChildren()
                .search()
                .closeWindow()
                .searchResults("Faena Hotel Miami Beach")
                .cardStatus();

        //Assert.assertTrue("The total hotel results should be greater than zero.", hotelSearchResults.getTotalResults()>0);
    }
}
