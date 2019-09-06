package com.bootcamp.tae.pages.common.pages;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends WebPage {
    @FindBy(css =".sc-gift-option [type='checkbox']")
    private WebElement checkGiftButton;  //Deberia estar toda la tarjeta dentro de un component que sea similar a la ResultCard (Por cuestion de tiempo no se hizo)

    @FindBy(css = ".sc-action-delete [type='submit']")
    private WebElement deleteButton; //Idem al anterior, el delete debe ir por cuenta de la clase contenedora

    public CartPage clickIsGift(){
        click(checkGiftButton);
        return this;
    }

    public CartPage deleteItem(){
        click(deleteButton);
        return this;

    }

}
