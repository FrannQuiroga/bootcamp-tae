package com.bootcamp.tae.pages.hotel;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelSearch extends WebPage {

    @FindBy(css = "#hotels .results-cluster-container")
    private List<WebElement> hotels;

    @FindBy(css = "#hotels .results-cluster-container .cluster-description .hf-cluster-info span[class=-eva-3-tc-gray-2]")
    private List<WebElement> hotelDescriptions;

    @FindBy(id = "hf-hotelNameTxt")
    private WebElement hotelNameTxt;

    @FindBy(id = "hf-hotelNameApplyButton")
    private WebElement hotelNameApplyButton;

    @FindBy(css = "#hf-hotelNameResultsContainer .hf-autocomplete-list-container .hf-autocomplete-item")
    private List<WebElement> hotelsNameSearch;

    @FindBy(css = "#hotels .results-cluster-container .cluster-description .hf-cluster-title a")
    private WebElement hotelTitle;

    @FindBy(css = "#hotels .results-cluster-container .hf-cluster-photos .hf-main-carousel-imgs .hf-slider-active img")
    private WebElement hotelImg;

    @FindBy(css = ".-lg.hf-pricebox-price")
    private WebElement priceContainer;

    public Accommodations accommodations() {
        return new Accommodations();
    }

    public int getNumberHotelsDisplayed() {
        return hotels.size();
    }

    public boolean cardsAreRelatedTo(String destination) {
        return hotelDescriptions.size() == hotelDescriptions.stream()
                .filter((description) -> description.getText().contains(destination))
                .count();
    }

    public HotelSearch searchAccommodation(String accommodation) {
        isVisible(hotelNameTxt);
        type(hotelNameTxt, accommodation);
        areVisible(hotelsNameSearch);
        Javascript.click(hotelsNameSearch.get(0));
        isVisible(hotelNameApplyButton);
        Javascript.click(hotelNameApplyButton);
        return this;
    }

    public boolean onlyOneCardIsDisplayed() {
        areVisible(hotels);
        return hotels.size() == 1;
    }

    public boolean imageIsVisible() {
        return isVisible(hotelImg);
    }

    public boolean hotelNameIsEnabledAndEqualsTo(String hotelName) {
        return isClickable(hotelTitle) && hotelTitle.getText().contentEquals(hotelName);
    }

    public boolean cityAreaIsVisible() {
        //If is not visible then the first condition invalidates the whole condition
        return isVisible(hotelDescriptions.get(0)) && hotelDescriptions.get(0).getText() != "";
    }

    public boolean nightlyPriceIsVisibleOrSoldOut() {
        String text;
        boolean cond = false;
        if(isVisible(priceContainer)) {
            text = priceContainer.getText();
            cond = text != "" && ( text.contains("USD") || text.contains("Sold out") );
        }
        return cond;
    }

}
