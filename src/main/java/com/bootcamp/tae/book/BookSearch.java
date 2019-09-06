package com.bootcamp.tae.book;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.print.Book;

import static java.lang.String.format;

public class BookSearch extends WebPage {

    @FindBy(css = "search-alias=stripbooks-intl-ship")
    private WebElement bookSelection;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement inputSerchBar;

    @FindBy(css = "nav-search-submit nav-sprite")
    private WebElement searchButton;

    //se podria mucho mejor ,lo hice asi dadas las circunstancias
    @FindBy(css = "a-size-medium a-color-base a-text-normal")
    private WebElement searchResultString;

    @FindBy(css = "a-section aok-relative s-image-fixed-height")
    private WebElement searchResutlImg;

    @FindBy(css = "a-price")
    private WebElement searchResultPrice;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;

    @FindBy(css = "a-checkbox sc-gift-option a-align-top a-size-small")
    private WebElement asAGift;

    public BookSearch search(String bookToSearch) {
        click(bookSelection);
        isTextPresent(bookSelection, "book");
        click(inputSerchBar);
        type(inputSerchBar, bookToSearch);
        click(searchButton);
        return new BookSearch();
    }

    public String searchResult() {

        //todas las comprobaciones aca,se podria hacer mejor y modularizar
        if (String.valueOf(searchResultString).toLowerCase().contains("embracing the power")) {
            if ((searchResutlImg.isDisplayed()) && (Integer.parseInt(searchResultPrice.getText())>0)) {
                return String.valueOf(searchResultString).toLowerCase();
            }
        } else throw new RuntimeException(format("No econtrado"));


    }

    //lo correcto seria hacer una clase para delegar las operaciones de compra

    public  BookSearch selectForBuy(){
        click(searchResultString);
        return new BookSearch();
    }

    public BookSearch preBuy(){
        click(addToCart);
        return new BookSearch;
    }

    public BookSearch gift(){
        click(asAGift);
        return new BookSearch();
    }

}
