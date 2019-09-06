package com.bootcamp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResults extends AmazonBasePage {

    @FindBy(className = "sg-col-inner")
    private WebElement resultsLabel;

    @FindBy(className = "a-size-medium a-color-base a-text-normal")
    private WebElement bookTitle;

    @FindBy(className = "a-section aok-relative s-image-fixed-height")
    private WebElement image;

    public boolean imageIsVisible(){
        return image.isDisplayed();
    }

    public boolean tittleIsVisible(){
        return bookTitle.isDisplayed();
    }



    public boolean onlyOneResult(){
        return resultsLabel.getText().equalsIgnoreCase("1 result for");
    }
}
