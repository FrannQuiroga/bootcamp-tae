package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DespegarHomePage extends WebPage {

    @FindBy(css = ".header-navigation")
    private WebElement headerNavigationContainer;

    public HeaderNavigationComponent headerNavigation() {
        return new HeaderNavigationComponent(headerNavigationContainer);
    }

}
