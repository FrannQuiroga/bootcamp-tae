package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.String.format;

public class CalendarContainer extends WebComponent {

    @FindBy(css = "._dpmg2--month-active")
    private WebElement calendarLeftContainer;

    @FindBy(css = "._dpmg2--controls-next")
    private WebElement nextMonth;

    private CalendarLeftContainer leftContainer;

    public CalendarContainer(WebElement container) {
        super(container);
        leftContainer = new CalendarLeftContainer(calendarLeftContainer);
    }

    public CalendarContainer CheckIn(){
        selectMonth("november");
        leftContainer.selectDay(10);
        return this;
    }

    public CalendarContainer CheckOut(){
        selectMonth("november");
        leftContainer.selectDay(25);
        return this;
    }

    public CalendarContainer selectMonth(String month){
        while (!leftContainer.isMonth(month)){
            changeMonth();
        }
        return this;
    }

    protected void changeMonth(){
        click(nextMonth);
    }

}
