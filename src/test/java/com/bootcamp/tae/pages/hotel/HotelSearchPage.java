package com.bootcamp.tae.pages.hotel;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelSearchPage extends WebPage {

    @FindBy(css = ".sbox-destination.sbox-primary")
    private WebElement destinationInput;

    @FindBy (css = ".ac-group-container")
    private List<WebElement> suggestionsDropdown;

    private WebElement checkInInput;

    private WebElement checkOutInput;

    private WebElement roomsInput;

    private WebElement roomsContainer;

    private WebElement searchButton;

    public HotelSearchPage typeDestination(String destination){
        type(destinationInput,destination);
        click(suggestionsDropdown.get(0));
        return this;
    }

    public HotelSearchPage selectCheckIn(){
        // TODO Delegate check in selection to Calendar
        return this;
    }

    public HotelSearchPage selectCheckOut(){
        // TODO Delegate check in selection to Calendar
        return this;
    }

    public HotelSearchPage selectChildren(){
        // TODO
        return this;
    }

    public HotelSearchPage search(){
        click(searchButton);
        return new HotelSearchPage();
    }
}
