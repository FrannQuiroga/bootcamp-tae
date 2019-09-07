package com.bootcamp.tae.pages.common.calendar;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarComponent extends WebComponent {

    @FindBy(css = "._dpmg2--dates ._dpmg2--date")
    private List<WebElement> days;

    public CalendarComponent(WebElement container) {
        super(container);
    }

    public void selectDay(int day) {
        click(days.get(day - 1));
    }


}
