package com.bootcamp.tae.pages.pageObject;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyPage extends WebPage {

    @FindBy(css=".a-icon a-icon-checkbox")
    private WebElement checkBox;

    @FindBy(name = "submit.delete.C23993d26-c709-4782-b1b3-8403803c9232")
    private WebElement quitCart;

    public BuyPage delete(){
        click(quitCart);
        return this;
    }

    public boolean isCheck(){
        return checkBox.getCssValue("checked").matches("checked");
    }
}
