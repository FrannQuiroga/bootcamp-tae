package com.bootcamp.tae.test.Hotel;

import com.bootcamp.tae.pages.HomePage;
import com.bootcamp.tae.pages.Hotel.SearchHotelResults;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestActivity extends BaseTestSuite {

    private HomePage home;

    @Before
    public void init(){home = new HomePage();}

    @Test
    public void testSearch() throws InterruptedException {
        home.getBarTop()
                .goToSearchHotel()
                .typeDestination("Miami Beach")
                .openCalendar()
                .selectReserve(7,9,2019,10) //No se pueden hacer reservas entre dias de distintos meses
                .openRooms()
                .getRoomsComponent()
                .setAdults(2)
                .getRoomsComponent().pressApplyButton()
                .pressSearchButton()
                .clickKeepInUsaButton()
                .searchWithInputSearchByProperty("Faena Hotel Miami Beach");
        Assert.assertTrue(new SearchHotelResults().getNumberOfResultsShown()>0);


      //  Thread.sleep(20000);
    }




}
