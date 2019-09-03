package com.bootcamp.tae.pages;


import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.support.FindBy;

public class AcommodationsPage extends WebPage {


    @FindBy (css = "input.input-tag.sbox-checkin-date")
    private WebComponent destination;

    @FindBy (css = "input.input-tag.sbox-checkin-date")
    private WebComponent dateCheckIn;

    @FindBy (css = "input.input-tag.sbox-checkout-date")
    private WebComponent dateCheckOut;

    public AcommodationsPage typeDestination (String text){

        return this;
    }

}
