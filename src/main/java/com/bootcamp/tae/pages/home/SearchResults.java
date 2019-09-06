package com.bootcamp.tae.pages.home;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResults extends WebPage {

    @FindBy(css = ".a-size-medium a-color-base a-text-normal")
    private List<WebElement> productTitle; //2nd.getText and click

    @FindBy(css = ".a-price-whole")
    private List<WebElement> priceTag; //first

    @FindBy(css = ".rush-component")
    private List<WebElement> productImage;


    public SearchResults resultTitle() {
        if (
                        productTitle == searchQuery && //Compare productTitle to match the search query.
                        Integer.parseInt(String.valueOf(priceTag.get(0))) && //Parse the String value of priceTag to an int and compare.
                        isVisible(productImage.get(0)) //Verify that the product image is visible.
        ) ;

        return this;
    }

    public SearchResults productResults() {
        click(productTitle.get(2));

        return new ProductPage;
    }
}
