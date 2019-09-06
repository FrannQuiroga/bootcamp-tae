package com.bootcamp.tae.pageobjects.emarket;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class emarketSearchResult extends WebPage {

    @FindBy(css = ".a-size-medium.a-color-base.a-text-normal")
    private List<WebElement> bookTitle;

    @FindBy(css = ".a-price-whole")
    private List<WebElement> bookPrice;

    @FindBy(css = ".s-image")
    private List<WebElement> bookImage;

    public boolean checkTitle(){

        return ((bookTitle.get(1)).equals("embracing the power of ai: a gentle co-guide"));
    }

    public int checkPrice(){
        return Integer.parseInt((bookPrice.get(0).getText()));
    }

    public boolean checkImage(){
        return isVisible(bookImage.get(0));
    }
}
