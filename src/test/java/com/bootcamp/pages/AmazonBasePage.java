package com.bootcamp.pages;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonBasePage extends WebPage {

    @FindBy(id = "navbar")
    private WebElement navBarContainer;

    @FindBy(id = "pageContent")
    private WebElement pageContentContainer;

    public NavBar navBar(){
        return new NavBar(navBarContainer);
    }


}
