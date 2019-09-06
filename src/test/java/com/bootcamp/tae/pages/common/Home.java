package com.bootcamp.tae.pages.common;


import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {

    @FindBy(id = "navbar")
    private WebElement navBar;

    public TopBar topBar() {
        return new TopBar(navBar);
    }

}
