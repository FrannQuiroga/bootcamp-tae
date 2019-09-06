package com.bootcamp.tae.pages.Cards;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class HotelCards extends WebComponent {

    @FindBy(className="results-cluster-container")
    private List<WebElement> listCards;

    public HotelCards(WebElement container) {
        super(container);
    }

    public HotelCard myHotelCard(){
        return new HotelCard(listCards.get(0));
    }
}
