package com.bootcamp.tae.pages.common.pages;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends WebPage {

    @FindBy (id = "add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy (id = "nav-cart")
    private WebElement cartButton;

    public ItemPage pressAddToCartButton(){  //Esta sección se deberia hacer en un component aparte, pero por cuestión de tiempo lo use unicamente como un boton parte de la ItemPage
        click(addToCartButton);
        return this;
    }

    public CartPage pressCartButton(){ //Idem al de arriba
        click(cartButton);
        return new CartPage();
    }



}
