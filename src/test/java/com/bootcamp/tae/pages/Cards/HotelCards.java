package com.bootcamp.tae.pages.Cards;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelCards extends WebComponent {
    /*
    Image is visible

    Hotel Name is enabled and equals to “Faena Hotel Miami Beach”

    City / Area is visible

    Nightly Price is visible - If not price then “Sold Out”

     */

    @FindBy(className="results-cluster-container")
    private List<WebElement> listCards;


    public HotelCards(WebElement container) {
        super(container);
    }

    public HotelCards getList(){
        for(int i=0;i< listCards.size();i++){
            System.out.println(listCards.get(i).getText());
            System.out.println("\n\n\n\n\n\n--------------");
            System.out.println("\n\n\n\n\n\n--------------");
        }
        System.out.println(listCards.size());
        //System.out.println(listCards.stream().filter(card -> card.));
        return this;
    }
}
