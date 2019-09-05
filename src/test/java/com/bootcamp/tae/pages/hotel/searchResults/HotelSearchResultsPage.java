package com.bootcamp.tae.pages.hotel.searchResults;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelSearchResultsPage extends WebPage {

    @FindBy(id = "results-research-container")
    private WebElement accommodationsContainer;

    @FindBy(css =".hf-cluster-content .col.-sm-12.-md-5")
    private List<WebElement> resultsList;

    protected Accommodation newAccommodation(){
        return new Accommodation(accommodationsContainer);
    }

    public HotelSearchResultsPage setAccommodation(String place){
        newAccommodation().typeAccommodation(place);
        return this;
    }
}
