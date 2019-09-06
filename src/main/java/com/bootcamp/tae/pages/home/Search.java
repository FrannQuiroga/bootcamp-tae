package com.bootcamp.tae.pages.home;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Search extends WebPage {

    @FindBy(css = "#searchDropdownBox")
    private List<WebElement> searchDropdown; //5th element is books

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(css = ".nav-search-submit-text")
    private WebElement searchButton;

    public Search searchProduct(){
        click(searchDropdown.get(5));
        click(searchBox);
        type(searchBox, searchQuery);
        click(searchButton);

        return new SearchResults;

        }


    }

}
