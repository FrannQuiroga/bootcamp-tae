package com.bootcamp.tae.pages.pageObject;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends WebPage {

    @FindBy(id="hlb-view-cart-announce")
    private WebElement myButtonCart;

    public BuyPage goToBuy(){
        click(myButtonCart);
        return new BuyPage();
    }

}
