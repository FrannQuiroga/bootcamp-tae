package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.Hotel.SearchHotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BarTop extends WebComponent {


    @FindBy(css = "a.HOTELS")
    private WebElement accomodationButton;

    public BarTop(WebElement container) {
        super(container);
    }

    public SearchHotel goToSearchHotel(){
        click(accomodationButton);
        return new SearchHotel();
    }
}
