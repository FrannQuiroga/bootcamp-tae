package com.bootcamp.tae.tests;

import com.bootcamp.tae.pages.books.BookSearch;
import com.bootcamp.tae.pages.common.Home;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookSearchTest extends BaseTestSuite {

    private Home home;

    @Before
    public void init() {
        home = new Home();
    }

    @Test
    public void mainTest() {
        BookSearch results = home.topBar()
                .selectBooksCategory()
                .typeBookName("embracing the power of ai: a gentle co-guide")
                .search();

        Assert.assertTrue(
                results.searchResultsAreDisplayed()
                && results.getTitle().equals("Embracing the Power of AI: A Gentle CXO Guide")
                && results.getPrice() > 0
                && results.imageIsVisible()
        );

    }

}
