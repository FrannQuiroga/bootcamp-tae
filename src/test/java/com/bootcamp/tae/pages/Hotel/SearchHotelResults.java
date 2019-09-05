package com.bootcamp.tae.pages.Hotel;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchHotelResults extends WebPage {


    @FindBy(css=".dreck-modal-keep .btn-text")
    private WebElement keepInUsaPageButton;

    @FindBy(id = "hf-hotelNameTxt")
    private WebElement searchByPropertyInput;

    @FindBy(id = "hf-hotelNameApplyButton")
    private WebElement searchByPropertyButton;

    @FindBy(css = ".hf-autocomplete-item.highlight-autocomplete")
    private WebElement suggestions;

    @FindBy(css = ".hf-cluster-container")
    private List<WebElement> resultsShown;


    public SearchHotelResults clickKeepInUsaButton(){
        click(keepInUsaPageButton);
        return this;
    }

    public SearchHotelResults searchWithInputSearchByProperty(String text) throws InterruptedException {
        if(getNumberOfResultsShown()>0){
            type(searchByPropertyInput,text);
            click(suggestions);
            click(searchByPropertyButton);
        }
        return this;
    }

    public int getNumberOfResultsShown(){
        return resultsShown.size();
    }


}
