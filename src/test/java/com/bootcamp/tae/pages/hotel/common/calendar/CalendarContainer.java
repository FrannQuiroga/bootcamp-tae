package com.bootcamp.tae.pages.hotel.common.calendar;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarContainer extends WebComponent {

    @FindBy
    private WebElement calendarLeftContainer;

    @FindBy
    private WebElement calendarRightContainer;

    protected CalendarContainer(WebElement container) {
        super(container);
    }

    public CalendarContainer selectCheckIn(int months){
        new Calendar(calendarLeftContainer).selectMonths(months).selectFirstAvailableDay();
        return this;
    }

    public CalendarContainer selectCheckOut(int day){
        new Calendar(calendarRightContainer).selectDay(day);
        return this;
    }
}
