package com.bootcamp.tae.test.Hotel;

import com.bootcamp.tae.pages.HomePage;
import com.bootcamp.tae.pages.Hotel.HotelCard;
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
        int results = 0;
        String toStringCard = null;
        HotelCard result;
        SearchHotelResults hotelResults = home.getBarTop()
                .goToSearchHotel()
                .typeDestination("Miami Beach")
                .openCalendar()
                .selectReserve(7,9,2019,10) //No se pueden hacer reservas entre dias de distintos meses
                .openRooms()
                .getRoomsComponent()
                .setAdults(2)
                .getRoomsComponent().pressApplyButton()
                .pressSearchButton();
                Thread.sleep(5000);
                //.clickKeepInUsaButton();

        results = hotelResults.getNumberOfResultsShown();
        Assert.assertTrue("Results are greaten than 0",results>0);

                hotelResults.searchWithInputSearchByProperty("Faena Hotel Miami Beach");
                if(hotelResults.getNumberOfResultsShown()>0){
                    result = hotelResults.getFirstCardHotelResult();
                    toStringCard = result.toString();
                }
        if(toStringCard!=null)
        {
            System.out.println(toStringCard);
            Assert.assertNotNull("The cards isn't null",toStringCard);
        }




    }




}
