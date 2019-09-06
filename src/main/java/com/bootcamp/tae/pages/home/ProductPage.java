package com.bootcamp.tae.pages.home;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends WebPage {


    @FindBy(css = "#add-to-cart-button")
    private WebElement addToCart;

    public ProductPage(){

        click(addToCart);
    }
}
