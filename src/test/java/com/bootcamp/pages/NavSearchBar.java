package com.bootcamp.pages;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.Keys.ENTER;

public class NavSearchBar extends WebComponent {

    @FindBy(className = "nav-left")
    private WebElement categoriesContainer;

    @FindBy(css = "[value='search-alias=stripbooks-intl-ship']")
    private WebElement books;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(className = "nav-search-submit")
    private WebElement searchButton;

    protected NavSearchBar(WebElement container) {
        super(container);
    }

    public NavSearchBar selectCategory() {
        click(categoriesContainer);
        isVisible(books);
        click(books);
        //type(categoriesContainer,"bo");
        //categoriesContainer.sendKeys(bKeys,ENTER);
        //new CategoriesSelector(categoriesContainer).selectCategory(index);
        return this;
    }

    public NavSearchBar typeSearch(String text){
        type(searchInput,text);
        return this;
    }

    public SearchResults searchField(){
        click(searchButton);
        return new SearchResults();
    }
}

