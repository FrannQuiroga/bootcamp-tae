package com.bootcamp.tae.pages.hotel.searchResults;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accommodation extends WebComponent {

    @FindBy (css = ".sbox-destination")
    private WebElement accommodationInput;

    @FindBy (css = ".ac-wrapper .ac-group-container .item")
    private WebElement suggestions;

    protected Accommodation(WebElement container) {
        super(container);
    }

    public HotelSearchResultsPage typeAccommodation(String place){
        if(isVisible(accommodationInput)) {
            accommodationInput.clear();
        }
        type(accommodationInput, place);
        click(suggestions);
        return new HotelSearchResultsPage();
    }
}
