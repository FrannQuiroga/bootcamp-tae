package com.bootcamp.tae.tests;

import com.bootcamp.tae.pages.common.DespegarHomePage;
import com.bootcamp.tae.pages.hotel.HotelSearch;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class HotelSearchTest extends BaseTestSuite {

    private DespegarHomePage homePage;

    @Before
    public void init() {
        homePage = new DespegarHomePage();
    }

    @Test
    public void mainTest() {

        HotelSearch results = homePage.headerNavigation()
                .accommodations()
                .setDestination("Miami Beach")
                .selectCheckInDate("2019-09-14")
                .selectCheckOutDate(4)
                .selectGuests(2, 3, Arrays.asList(7, 9, 15))
                .search();

        try {
            Thread.sleep(4000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(results.getNumberHotelsDisplayed() > 0 && results.cardsAreRelatedTo("Miami Beach"));

        results = results.searchAccommodation("Faena Hotel Miami Beach");

        Assert.assertTrue(
                results.onlyOneCardIsDisplayed()
                && results.imageIsVisible()
                && results.hotelNameIsEnabledAndEqualsTo("Faena Hotel Miami Beach")
                && results.cityAreaIsVisible()
                && results.nightlyPriceIsVisibleOrSoldOut()
        );

    }
}
