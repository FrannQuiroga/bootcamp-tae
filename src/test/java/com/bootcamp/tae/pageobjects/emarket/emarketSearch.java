package com.bootcamp.tae.pageobjects.emarket;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pageobjects.test.emarketSearchTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class emarketSearch extends WebPage {

    @FindBy(css = ".nav-search-dropdown.searchSelect")
    private List<WebElement> categoriesDropDown;

    @FindBy(id = "#twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(css = ".nav-search-submit.nav-sprite")
    private WebElement searchButtonInput;



    public emarketSearch selectCategory(){
        click(categoriesDropDown.get(5));
        return this;
    }

    public emarketSearch typeArticle(String article){
        type(searchInput,article);
        return this;
    }

    public emarketSearchResult search(){
        click(searchButtonInput);
        return new emarketSearchResult();
    }
}
