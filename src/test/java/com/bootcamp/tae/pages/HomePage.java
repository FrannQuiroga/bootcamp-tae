package com.bootcamp.tae.pages;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.common.BarTop;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebPage {

    @FindBy(className = "header-corners-container")
    private WebElement topMenuContainer;

    public BarTop getBarTop(){
        return new BarTop(topMenuContainer);
    }


}
