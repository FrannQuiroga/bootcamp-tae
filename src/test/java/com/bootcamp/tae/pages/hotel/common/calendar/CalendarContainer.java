package com.bootcamp.tae.pages.hotel.common.calendar;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CalendarContainer extends WebComponent {

    @FindBy(css = "._dpmg2--month-active")
    private WebElement daysContainer;

    @FindBy(css = "._dpmg2--controls-next")
    private WebElement nextMonth;

    public CalendarContainer(WebElement container) {
        super(container);
    }

    public CalendarContainer selectDates(String month, String day){
        Calendar calendar = new Calendar(daysContainer);
        while(calendar.getTitle().getText().equalsIgnoreCase(month)==false){
            click(nextMonth);
        }
        if(calendar.getTitle().getText().equalsIgnoreCase(month)) {
            calendar.selectDate(day);
        }
        return this;
    }

}
