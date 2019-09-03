package com.bootcamp.tae.pages.pageObject;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {
    @FindBy(className = "shifu-3-icon-hotels")
    private WebElement clickAccommodations;

    public Home clickOnAccommodations(){
        click(clickAccommodations);
        return this;
    }




}
