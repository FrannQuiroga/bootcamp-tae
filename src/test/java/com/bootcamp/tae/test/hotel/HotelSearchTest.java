package com.bootcamp.tae.test.hotel;

import com.bootcamp.tae.pages.Cards.HotelCards;
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
        HotelCards results = home.topBar()
                .hotels()
                .typeDestination("Miami Beach")
                .selectDate()
                .selectChildren()
                .search()
                .closeWindow()
                .searchResults("Faena Hotel Miami Beach")
                .cardStatus();

        Assert.assertTrue("The total hotel results should be greater than zero.", 0 < hotelSearchResults.getTotalResults());
        Assert.assertTrue("The tittle should match.", hotelSearchResults.cardStatus().myHotelCard().titleMatch("Faena Hotel Miami Beach"));
        Assert.assertTrue("Image is visible.", hotelSearchResults.cardStatus().myHotelCard().imageVisible());
        Assert.assertTrue("The area should be visible.", hotelSearchResults.cardStatus().myHotelCard().areaIsVisible());
        Assert.assertTrue("The price should be visible.", hotelSearchResults.cardStatus().myHotelCard().priceIsVisible());
        Assert.assertFalse("Sold out.", ! hotelSearchResults.cardStatus().myHotelCard().priceIsVisible());
    }
}
