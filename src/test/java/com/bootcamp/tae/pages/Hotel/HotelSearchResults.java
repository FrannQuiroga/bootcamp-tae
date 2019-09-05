package com.bootcamp.tae.pages.Hotel;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.Cards.HotelCards;
import org.junit.Before;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        click(suggestionsDropdown.get(0));
        click(buttonApply);
        return this;
    }

    public int getTotalResults() {
        int total = Integer.parseInt(totalResultsLabel.getText());
        System.out.println("Total result:" + total);
        return total;
    }

    public HotelSearchResults cardStatus() throws InterruptedException {
        Thread.sleep(parseLong("2000"));//I do not know how to apply expected conditions.
        hotelCards = new HotelCards(cardsContainer.get(0));
        /*for(WebElement e : cardsContainer){
            System.out.println(e.getText());
            System.out.println("\n\n\n\n\n\n--------------");
        }*/
        hotelCards.getList();
        return this;
    }
}
