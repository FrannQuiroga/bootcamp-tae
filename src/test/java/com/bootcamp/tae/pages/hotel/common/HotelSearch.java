package com.bootcamp.tae.pages.hotel.common;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelSearch extends WebPage {

    @FindBy (css = ".sbox-destination.sbox-primary")
    private WebElement destinationInput;

    //@FindBy (css = ".ac-group-container")
    private List<WebElement> suggestionsDropdown;

    private WebElement checkInInput;

    private WebElement checkOutInput;

    private WebElement roomsInput;

    private WebElement roomsContainer;

    private WebElement searchButton;

    public HotelSearch typeDestination(String destination){
        type(destinationInput,destination);
        click(suggestionsDropdown.get(0));
        return this;
    }

    public HotelSearch selectCheckIn(){
        // TODO Delegate check in selection to Calendar
        return this;
    }

    public HotelSearch selectCheckOut(){
        // TODO Delegate check in selection to Calendar
        return this;
    }

    public HotelSearch selectChildren(){
        // TODO
        return this;
    }

    public HotelSearch search(){
        click(searchButton);
        return new HotelSearch();
    }
}
