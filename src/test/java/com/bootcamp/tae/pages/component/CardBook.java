package com.bootcamp.tae.pages.component;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CardBook extends WebComponent {

    @FindBy(className = "a-size-medium a-color-base a-text-normal")
    private WebElement title;

    @FindBy(className = "a-price-whole")
    private WebElement price;

    @FindBy()
    private WebElement image;

    public CardBook(WebElement container) {
        super(container);
    }

    public boolean isTitleVisible(){
        return title.getText().equalsIgnoreCase("embracing the power of ai: a gentle co-guide");
    }

    public boolean price (){
        int i= Integer.parseInt(price.getText());
        return i>0;
    }

    public boolean imageVisible(){
        return isVisible(image);
    }


}
