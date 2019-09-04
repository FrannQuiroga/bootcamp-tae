package hotel;

import com.bootcamp.tae.pages.hotel.HotelSearchResultsPage;
import com.bootcamp.tae.pages.hotel.common.HomePage;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelSearchTest extends BaseTestSuite {
    private HomePage home;

    @Before
    public void init() {
        home = new HomePage();
    }

    @Test
    public void testSearchResults() {
        HotelSearchResultsPage results = home.headerBar()
                .goToHotels()
                .typeDestination("Miami Beach")
                .selectCheckIn("October", "20")
              //  .selectCheckOut()
            //    .selectChildren()
                .search();

       // Assert.assertTrue("The total hotel results should be greater than zero.", results.getTotalResults() > 0);

    }
}
