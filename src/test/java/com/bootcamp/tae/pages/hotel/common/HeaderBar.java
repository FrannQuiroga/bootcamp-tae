package com.bootcamp.tae.pages.hotel.common;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.hotel.HotelSearchPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderBar extends WebComponent {

    @FindBy(css = "product='HOTELS")
    private WebElement accommodationButton;

    public HeaderBar(WebElement container) {
        super(container);
    }

    public HotelSearchPage goToHotels(){
        click(accommodationButton);
        return new HotelSearchPage();
    }
}
