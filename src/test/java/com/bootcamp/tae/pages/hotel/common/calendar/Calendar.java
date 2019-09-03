package com.bootcamp.tae.pages.hotel.common.calendar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Calendar {
    @FindBy
    private WebElement title;
    @FindBy
    private WebElement daysHeader;
    @FindBy
    private List<WebElement> activeDays;

    public Calendar selecFirstAvailableDay(){
        return this;
    }
}
