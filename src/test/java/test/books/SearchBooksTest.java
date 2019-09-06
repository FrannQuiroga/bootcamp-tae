package test.books;

import com.bootcamp.tae.testsuite.BaseTestSuite;
import com.bootcamp.tae.books.BooksSearchResults;
import common.Home;
import org.junit.Before;
import org.junit.Test;

public class SearchBooksTest extends BaseTestSuite{


    private Home home;

    @Before
    public void init() {
        home = new Home();
    }

    @Test
    public void testSearchResults()
    {
        BooksSearchResults results = home.topBar()
                .books()
                .typeBook("embracing the power of ai: a gentle co-guide")
                .search();

    }

}




