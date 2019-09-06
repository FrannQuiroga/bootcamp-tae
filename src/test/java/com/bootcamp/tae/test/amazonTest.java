package com.bootcamp.tae.test;

import com.bootcamp.tae.pages.pageObject.Home;
import com.bootcamp.tae.testsuite.BaseTestSuite;
import org.junit.Before;
import org.junit.Test;

public class amazonTest extends BaseTestSuite {
    private Home home;

    @Before
    public void init() {
        home = new Home();
    }

    @Test
    public void testSearchResults() {
        home.topBar().book()
                .chooseOption();
    }
}