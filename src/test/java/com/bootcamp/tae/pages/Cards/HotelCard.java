package com.bootcamp.tae.pages.Cards;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelCard extends WebComponent {

    @FindBy(css = ".upatracker")
    private WebElement title;

    @FindBy(css = ".-eva-3-hide-small.analytics .-eva-3-tc-gray-2")
    private WebElement city;

    @FindBy(css = ".hf-slider-element.hf-slider-active img")
    private WebElement image;

    @FindBy(className = "hf-pricebox-price-currency")
    private WebElement price;


    public HotelCard(WebElement container) {
        super(container);
    }

    public boolean imageVisible(){
        return isVisible(image);
    }

    public boolean titleMatch(String t){
        return  title.getAttribute("title").equalsIgnoreCase(t);
    }

    public boolean areaIsVisible(){
        return isVisible(city);
    }

    public boolean priceIsVisible(){
        return price.getText().equalsIgnoreCase("usd");
    }
}
