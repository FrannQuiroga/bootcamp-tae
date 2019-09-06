package com.bootcamp.tae.pages.common.pages;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultCard extends WebComponent {

    @FindBy (css = ".a-link-normal.a-text-normal")
    private WebElement title;

    @FindBy (css = ".a-row.a-size-base.a-color-secondary")
    private WebElement autor;

    @FindBy (className = "s-image")
    private WebElement image;

    @FindBy (className = "a-price")
    private WebElement price;

    protected ResultCard(WebElement container) {
        super(container);
    }

    public void clickImage(){
        click(image);
    }

    public String getTitle(){
        return title.getText();
    }

    public String getPrice(){
        return price.getText();
    }

    public boolean imageIsVisible(){
        return image.isDisplayed();
    }

}
