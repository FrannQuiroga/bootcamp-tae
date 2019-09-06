package com.bootcamp.tae.amazon.common.amazonResults;

import com.bootcamp.tae.amazon.chosenCard.ChosenCard;
import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonResults extends WebPage {


    @FindBy (css = ".sg-col-20-of-24.sg-col-28-of-32")
    private WebElement cardsContainer;

    public Card card(){
        return new Card(cardsContainer);
    }

    public boolean verifyTitle(String book){
       return card().verifyTitle(book);
    }

    public boolean verifyImage(){
        return card().verifyImage();
    }

    public boolean verifyPrice(){
        return card().verifyPrice();
    }

    public ChosenCard clickChosenCard(){
        return card().clickChosenCard();
    }
}
