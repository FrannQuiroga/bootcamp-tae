package com.bootcamp.tae.pages.component;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.Hotel.HotelSearch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends WebComponent {

    @FindBy(css = "[product='HOTELS']")
    private WebElement accommodationLink;

    public TopBar(WebElement container) {
        super(container);
    }

    public HotelSearch hotels(){
        click(accommodationLink);
        return new HotelSearch();
    }

}
