package com.bootcamp.tae.pages.common.calendar;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static java.time.LocalDate.*;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

public class CalendarsContainerComponent extends WebComponent {

    @FindBy(css = "._dpmg2--month-active")
    private WebElement calendarLeftContainer;

    @FindBy(css = "._dpmg2--month-active + ._dpmg2--month")
    private WebElement calendarRightContainer;

    @FindBy(css = "._dpmg2--controls-next")
    private WebElement nextMonth;

    private LocalDate checkInDate;

    public CalendarsContainerComponent(WebElement container) {
        super(container);
    }

    /**
     * Selects the check in date entered by the user
     * @param date String type - must be in format YYYY-MM-DD
     */
    public void selectCheckInDate(String date) {
        checkInDate = parse(date);
        LocalDate now = now();
        int monthsDif;
        int yearsDif = checkInDate.getYear() - now.getYear();
        if(yearsDif == 0) {
            monthsDif =  checkInDate.getMonthValue() - now.getMonthValue();
        }
        else {
            monthsDif = 12 * yearsDif + checkInDate.getMonthValue() - now.getMonthValue();
        }
        selectMonth(monthsDif).selectDay(checkInDate.getDayOfMonth());
    }

    /**
     * Calculates and select the check out date based on the number of nights after check in
     * @param nights integer type - must be > 0 and <= 30
     */
    public void selectCheckOutDate(int nights) {
        LocalDate now = now();
        int lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        int daysLeft = lastDayOfMonth - checkInDate.getDayOfMonth();
        CalendarComponent calendar;

        if(nights <= daysLeft) {
            calendar = new CalendarComponent(calendarLeftContainer);
            calendar.selectDay(checkInDate.getDayOfMonth() + nights);
        }
        else {
            calendar = new CalendarComponent(calendarRightContainer);
            calendar.selectDay(nights - daysLeft);
        }
    }

    private CalendarComponent selectMonth(int monthsDif) {
        if(monthsDif == 0) {
            return new CalendarComponent(calendarLeftContainer);
        }
        else if(monthsDif == 1) {
            return new CalendarComponent(calendarRightContainer);
        }
        else {
            clickNext(monthsDif);
            return new CalendarComponent(calendarLeftContainer);
        }
    }

    private void clickNext(int N) {
        for(int i = 0; i < N; i ++)
            click(nextMonth);
    }


}
