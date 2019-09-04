package com.bootcamp.tae.pages.hotel.common.calendar;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Calendar extends WebComponent {

    @FindBy(css = "._dpmg2--month-title-month")
    private WebElement title;

    @FindBy(css = "._dpmg2--month-daysName")
    private WebElement daysHeader;

    @FindBy(css ="._dpmg2--dates ._dpmg2--available")
    private List<WebElement> activeDays;


    protected Calendar(WebElement container) {
        super(container);
    }

    public Calendar selectDate(String month, String day){
        if(title.getText().equalsIgnoreCase(month)){
            click(activeDays.stream()
                    .filter(x -> x.getText().equalsIgnoreCase(day))
                    .findFirst()
                    .get()
            );
        }
        return this;
    }

    public Calendar selectFirstAvailableDay(){
        click(activeDays.stream()
                .filter(day -> day.getAttribute("class").contains("_dpmg2--available"))
                .findFirst()
                .get()
        );
        return this;
    }

    public WebElement getTitle(){
        return title;
    }



}
