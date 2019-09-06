package com.bootcamp.tae.amazontest;

import com.bootcamp.tae.pages.home.Search;
import com.bootcamp.tae.pages.home.SearchResults;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

public class AmazonTest extends BaseTestSuite {

    private Search search;

        @Before
        public void init(){search = new Search();}

        @Test
            public void amazonSearch(){
            Search search = new Search()
                    .searchProduct()
                    .productResults();

        }
    }
}
