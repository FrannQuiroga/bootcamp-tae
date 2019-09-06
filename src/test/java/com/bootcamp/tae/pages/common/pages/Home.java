package com.bootcamp.tae.pages.common.pages;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.common.searchBox.SearchBox;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage {

    @FindBy (css = ".nav-fill")
    private WebElement searchBoxContainer;

    private SearchBox searchbox = new SearchBox(searchBoxContainer);

    public SearchResultsPage searchInCategory(String text,int categoryIndex){
        searchbox.inputText(text);
        searchbox.selectCategory(categoryIndex);
        searchbox.clickSearch();
        return new SearchResultsPage();
    }

}
