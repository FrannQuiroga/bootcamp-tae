package com.bootcamp.tae.pages.books;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookSearch extends WebPage {

    @FindBy(css = ".s-include-content-margin.s-border-bottom")
    private List<WebElement> books;

    @FindBy(css = ".s-include-content-margin.s-border-bottom .a-section h2 a span")
    private List<WebElement> booksTitle;

    @FindBy(css = ".s-include-content-margin.s-border-bottom .a-section .sg-row:nth-child(2) .sg-row:nth-child(2) div  .a-section:first-child div:nth-child(2) .a-price:first-child .a-offscreen")
    private List<WebElement> prices;

    @FindBy(css = ".s-include-content-margin.s-border-bottom img")
    private List<WebElement> images;


    public boolean searchResultsAreDisplayed() {
        return areVisible(books);
    }

    public String getTitle() {
        return booksTitle.get(0).getText();
    }

    public double getPrice() {
        //Price format is $17.27 for example
        String priceText = prices.get(0).getText().substring(1);
        return Double.parseDouble(priceText);
    }

    public boolean imageIsVisible() {
        return isVisible(images.get(0));
    }

}
