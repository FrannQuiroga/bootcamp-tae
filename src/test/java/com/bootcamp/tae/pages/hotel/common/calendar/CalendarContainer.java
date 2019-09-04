package com.bootcamp.tae.pages.hotel.common.calendar;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CalendarContainer extends WebComponent {

    @FindBy(css = "._dpmg2--month-active")
    private WebElement calendarLeftContainer;

    @FindBy
    private WebElement calendarRightContainer;

    @FindBy(css = "._dpmg2--controls-next")
    private WebElement nextMonth;

    public CalendarContainer(WebElement container) {
        super(container);
    }

    public CalendarContainer selectCheckIn(String month, String day){
        Calendar calendar = new Calendar(calendarLeftContainer);
        while(calendar.getTitle().getText().equalsIgnoreCase(month)==false){
            click(nextMonth);
        }
        calendar.selectDate(month, day);
        return this;
    }

}
