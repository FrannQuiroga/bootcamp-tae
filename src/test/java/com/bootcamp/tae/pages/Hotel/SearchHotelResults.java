package com.bootcamp.tae.pages.Hotel;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchHotelResults extends WebPage {


    @FindBy(css=".dreck-modal-keep .btn-text")
    private WebElement keepInUsaPageButton;

    //@FindBy(id = "hf-hotelNameTxt")
    @FindBy(css = ".sbox-primary")
    private WebElement searchByPropertyInput;

    //@FindBy(id = "hf-hotelNameApplyButton")
    @FindBy (css = ".sbox-search")
    private WebElement searchByPropertyButton;

    //@FindBy(css = ".hf-autocomplete-item.highlight-autocomplete")
    @FindBy (css = ".ac-group-items .item")
    private WebElement suggestions;

    @FindBy(css = ".hf-cluster-container")
    private List<WebElement> resultsShown;

    @FindBy(css = ".hf-cluster.-featured-hotel")
    private WebElement hotelCardContainer;

    private HotelCard firstResult;

    public SearchHotelResults clickKeepInUsaButton() throws InterruptedException {
        Thread.sleep(5000);
        if(keepInUsaPageButton.isDisplayed()){ //Si aparece, cerrarlo
            click(keepInUsaPageButton);
        }
        return this;
    }

    public SearchHotelResults searchWithInputSearchByProperty(String text) throws InterruptedException {
        if(getNumberOfResultsShown()>0){
            searchByPropertyInput.clear();
            type(searchByPropertyInput,text);
            click(suggestions);
            click(searchByPropertyButton);
        }
        return this;
    }

    public int getNumberOfResultsShown(){
        return resultsShown.size();
    }

    public HotelCard getFirstCardHotelResult(){
        if(hotelCardContainer.isDisplayed()){
            firstResult = new HotelCard(hotelCardContainer);
            return firstResult;
        }
        return null;
    }


}
