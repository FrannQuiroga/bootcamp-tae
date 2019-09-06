package com.bootcamp.tae.pageobjects.common;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pageobjects.emarket.emarketSearch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends WebComponent {

    @FindBy(css = ".nav-search-scope.nav-sprite")
    private WebElement allButton;



    protected TopBar(WebElement container) {
        super(container);
    }

    public emarketSearch firstButton(){
        click(allButton);
        return new emarketSearch();
    }



}
