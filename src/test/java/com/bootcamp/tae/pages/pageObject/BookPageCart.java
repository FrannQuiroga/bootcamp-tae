package com.bootcamp.tae.pages.pageObject;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.pageObject.CartPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPageCart extends WebPage {

    @FindBy()
    private WebElement buttonCart;

    public CartPage addCart(){
        isVisible(buttonCart);
        click(buttonCart);
        return new CartPage();
    }
}
