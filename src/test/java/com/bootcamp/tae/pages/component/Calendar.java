package com.bootcamp.tae.pages.component;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calendar extends WebComponent {

    public Calendar(WebElement container) {
        super(container);
    }

    @FindBy(className = "input-tag sbox-checkin-date")
    private WebElement checkIn;
    public Calendar checkIn(){

        return this;
    }

    @FindBy(className ="input-tag sbox-checkout-date")
    private WebElement checkOut;
    public Calendar checkOut(){

        return this;
    }

}
