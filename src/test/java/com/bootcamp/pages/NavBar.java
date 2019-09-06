package com.bootcamp.pages;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBar extends WebComponent {

    @FindBy(id = "nav-tools")
    private WebElement navToolsContainer;

    @FindBy(id = "nav-search")
    private WebElement navSearchContainer;

    protected NavBar(WebElement container) {
        super(container);
    }

    public NavSearchBar navSearchBar(){
        return new NavSearchBar(navSearchContainer);
    }

    public NavToolsBar navToolsBar(){
        return new NavToolsBar(navToolsContainer);
    }
}

