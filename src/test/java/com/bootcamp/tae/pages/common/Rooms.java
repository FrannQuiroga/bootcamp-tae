package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rooms extends WebComponent {

    @FindBy (css = ".steppers-icon-right.sbox-3-icon-plus")
    private WebElement addAdultsButton;


    public Rooms(WebElement container) {
        super(container);
    }

    public void addAdults(){
        click(addAdultsButton);
    }

}
