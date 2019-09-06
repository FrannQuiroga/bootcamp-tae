package com.bootcamp.tae.pages.home;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends WebPage {

    @FindBy(css = "#huc-v2-order-row-mark-gift")
    private WebElement giftCheckbox;

    @FindBy(css = "#sc-buy-box-gift-checkbox")
    private  WebElement isToBeGiftWrapped; //value 1 = checked

    @FindBy(css = "#hlb-view-cart-announce")
    private WebElement cartButton;

    @FindBy(css = ".sc-product-title a-text-bold")
    private WebElement cartProductTitle;

    @FindBy(css = ".sc-action-delete")
    private WebElement deleteFromCart;

    @FindBy(css = ".sc-empty-cart-header")
    private WebElement cartHeader;

    public ShoppingCart cart(String cartProductTitle){

        if(cartProductTitle == searchQuery && isToBeGiftWrapped.getCssValue(1){

        }
        return this;
    }




}
