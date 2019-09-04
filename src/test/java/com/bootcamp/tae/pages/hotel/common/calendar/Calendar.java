package com.bootcamp.tae.pages.hotel.common.calendar;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Calendar extends WebComponent {

    @FindBy(css = "._dpmg2--month-active ._dpmg2--month-title-month")
    private WebElement title;

    @FindBy(css = "._dpmg2--month-active ._dpmg2--month-daysName")
    private WebElement daysHeader;

    @FindBy(css ="_.dpmg2--month-active ._dpmg2--dates")
    private List<WebElement> activeDays;


    protected Calendar(WebElement container) {
        super(container);
    }

    public Calendar selectMonth(String month){
        return null;
    }

    public Calendar selectDay(int day){
        return null;
    }

    public Calendar selectFirstDay(){
        return null;
    }

}
