package com.bootcamp.tae.common;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {

    @FindBy(css = "nav-unrec")
    private TopBar topBar;



}
