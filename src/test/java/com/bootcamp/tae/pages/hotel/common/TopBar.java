package com.bootcamp.tae.pages.hotel.common;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends WebComponent {

    //Entre corchetes@FindBy(css = "product='HOTELS")
    private WebElement accomodationButton;

    protected TopBar(WebElement container) {
        super(container);
    }

    public HotelSearch goToHotels(){
        click(accomodationButton);
        return new HotelSearch();
    }
}
