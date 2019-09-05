package com.bootcamp.tae.pages.Hotel;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelCard extends WebComponent {

    @FindBy (css = ".hf-slider-active")
    private WebElement image;

    @FindBy (css = ".-eva-3-tc-gray-0")
    private WebElement title;

    @FindBy (css = ".-eva-3-tc-gray-2")
    private WebElement cityArea;

    @FindBy (css = ".-lg.hf-pricebox-price.hf-robot-price.-eva-3-mb-xsm")
    private WebElement price;


    protected HotelCard(WebElement container) {
        super(container);
    }

    public String getTitle() {
        return getText(title);
    }

    public String getCityArea() {
        return getText(title);
    }
    public String getText() {
        return getText(title);
    }

    public boolean imageIsVisible() {
        return image.isDisplayed();
    }
    @Override
    public String toString(){
        return "-"+getTitle()+"-"+getCityArea()+"-"+getText()+"- Image is visible: "+imageIsVisible();
    }

}
