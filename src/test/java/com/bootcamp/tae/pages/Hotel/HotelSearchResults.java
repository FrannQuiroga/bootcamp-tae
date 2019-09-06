package com.bootcamp.tae.pages.Hotel;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.Cards.HotelCards;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static java.lang.Long.*;

public class HotelSearchResults extends WebPage {

    @FindBy(className = "dreck-modal-keep")
    private WebElement buttonX;

    @FindBy(id="hf-poiTxt")
    private WebElement search;

    @FindBy(css = ".hf-pois-filter-autocomplete-wrapper .hf-autocomplete-list-container")
    private List<WebElement> suggestionsDropdown;

    @FindBy(id ="hf-poiApplyButton")
    private WebElement buttonApply;

    @FindBy (id = "total-hotels-count")
    private WebElement totalResultsLabel;

    @FindBy(css = "#list")
    private List<WebElement> cardsContainer;

    private HotelCards hotelCards;

    public HotelSearchResults closeWindow(){
        click(buttonX);
        return this;
    }

    public HotelSearchResults searchResults(String mySearch){
        type(search,mySearch);
        areVisible(suggestionsDropdown);
        click(suggestionsDropdown.get(0));
        click(buttonApply);
        return this;
    }

    public int getTotalResults() {
        isVisible(totalResultsLabel);
        int total = Integer.parseInt(totalResultsLabel.getText());
        return total;
    }

    public HotelCards cardStatus() throws InterruptedException {
        Thread.sleep(parseLong("2000"));//I do not know how to apply expected conditions.
        //TODO Catch the spinner !
        return new HotelCards(cardsContainer.get(0));
    }
}
