package com.bootcamp.pages;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavToolsBar extends WebComponent {

    @FindBy(id = "nav-cart")
    private WebElement cart;

    protected NavToolsBar(WebElement container) {
        super(container);
    }

    public NavToolsBar openCart(){
        click(cart);
        return this;
    }
}
