package com.bootcamp.tae.amazon;

import com.bootcamp.tae.amazon.common.HeaderBar;
import com.bootcamp.tae.amazon.common.amazonResults.AmazonResults;
import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHome extends WebPage {

    @FindBy(css = ".nav-opt-sprite")
    private WebElement headerContainer;

    public HeaderBar header(){
        return new HeaderBar(headerContainer);
    }

    public AmazonHome chooseCategory(String category){
        return this.header().chooseCategory(category);
    }

    public AmazonHome typeInSearch(String element){
        return this.header().typeInSearch(element);
    }

    public AmazonResults clickSearch(){
        return this.header().clickSearch();
    }
}
