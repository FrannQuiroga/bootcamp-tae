package com.bootcamp.test;

import com.bootcamp.pages.AmazonBasePage;
import com.bootcamp.pages.SearchResults;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchResultsTest extends BaseTestSuite {

    private AmazonBasePage amazonBasePage;

    @Before
    public void init(){amazonBasePage= new AmazonBasePage();}

    @Test
    public void testSearchResults(){
        SearchResults searchResults = amazonBasePage.navBar().navSearchBar()
                .selectCategory()
                .typeSearch("embracing the power of ai: a gentle cxo guide")
                .searchField();
        Assert.assertTrue("The search result image is displayed", searchResults.imageIsVisible());
        Assert.assertTrue("The search result tittle is displayed", searchResults.tittleIsVisible());
        Assert.assertTrue("Only one result is displayed",searchResults.onlyOneResult());
    }

}
