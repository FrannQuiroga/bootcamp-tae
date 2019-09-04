package com.bootcamp.tae.pages.common.Calendar;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.Hotel.SearchHotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Calendar;
import java.util.List;

public class CalendarComponent extends WebComponent {

    @FindBy(css = "._dpmg2--date._dpmg2--available")
    private List<WebElement> availableDays;

    public CalendarComponent(WebElement container) {
        super(container);
    }

    public void selectReserve(int day, int month, int year, int duration){
        Calendar calendar = Calendar.getInstance();
        int today = calendar.get(Calendar.DATE);
        int currentMonth = calendar.get(Calendar.MONTH)+1; //CALENDAR RETORNA UN NUMERO DE MES ANTERIOR AL ACTUAL
        int currentYear = calendar.get(Calendar.YEAR);

        if(month == currentMonth && year == currentYear){
            if(today == day){
                click(availableDays.get(0));
                click(availableDays.get(duration));
            }
            if(today < day){
                day-=today;
                click(availableDays.get(day));
                click(availableDays.get(day+duration));
            }
            if(today > day  && month == currentMonth  && year == currentYear){
                System.out.println("Dia ingresado incorrecto");
            }
        }else if(year==currentYear && month>currentMonth){
            click(availableDays.get(day-1));
            click(availableDays.get((day-1)+duration));
        }else if(year>currentYear){
            click(availableDays.get(day-1));
            click(availableDays.get((day-1)+duration));
        }
    }
}
