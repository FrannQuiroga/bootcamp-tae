package com.bootcamp.tae.amazon.common.amazonResults;

import com.bootcamp.tae.amazon.chosenCard.ChosenCard;
import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Card extends WebComponent {

    @FindBy(css = ".a-size-mini.a-spacing-none")
    private WebElement bookCardTitle;

    @FindBy (css = ".s-image")
    private WebElement bookCardImage;

    @FindBy (css = ".a-price-whole")
    private WebElement bookCardPrice;

    public Card(WebElement container) {
        super(container);
    }

    public boolean verifyTitle(String book){
        if(bookCardTitle.getText().equalsIgnoreCase(book)){
            return true;
        }
        return false;
    }

    public boolean verifyImage(){
        if(isVisible(bookCardImage)){
            return true;
        }
        return false;
    }

    public boolean verifyPrice(){
        if(Integer.parseInt(bookCardPrice.getText()) > 0){
            return true;
        }
        return false;
    }

    public ChosenCard clickChosenCard(){
        click(bookCardTitle);
        return new ChosenCard();
    }
}
