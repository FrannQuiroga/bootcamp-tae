package com.bootcamp.tae.pages.hotel;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.hotel.common.HeaderBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebPage {

    @FindBy(className = "header-corners-container")
    private WebElement topBarContainer;

    public HeaderBar headerBar(){
        return new HeaderBar(topBarContainer);
    }


}
