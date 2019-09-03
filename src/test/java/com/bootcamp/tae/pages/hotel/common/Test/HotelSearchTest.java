package com.bootcamp.tae.pages.hotel.common.Test;

import com.bootcamp.tae.pages.hotel.common.Home;
import com.bootcamp.tae.pages.hotel.common.HotelSearch;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

public class HotelSearchTest extends BaseTestSuite {

    private Home home;

    @Before
    public void init(){
        home = new Home();
    }

    // Asumimos que ya esta todo instanciado
    @Test
    public void testSearchResults(){

        HotelSearch result = home.topBar()
                .goToHotels()
                .typeDestination("Miami Beach")
                .selectCheckIn()
                .selectCheckOut()
                .selectChildren()
                .search();

    }
}
