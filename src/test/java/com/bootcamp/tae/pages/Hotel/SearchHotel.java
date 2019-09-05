package com.bootcamp.tae.pages.Hotel;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.common.Calendar.CalendarComponent;
import com.bootcamp.tae.pages.common.Rooms;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Calendar;
import java.util.List;

public class SearchHotel extends WebPage {

    @FindBy(css = "input.sbox-destination.undefined")
    private WebElement destinationInput;

    @FindBy(css = ".ac-group-container .item")
    private WebElement firstSuggestion;

    @FindBy(css = ".sbox-checkin-date")
    private List<WebElement> openCalendarElement;

    //@FindBy(css = ".sbox-guests-container .input-container input")
    @FindBy(css = ".-mr3-l .sbox-guests-container .input-container input.sbox-rooms")
    private WebElement openRoomsElement;

    @FindBy(css = "._dpmg2--date._dpmg2--available")
    private List<WebElement> availableDays;

    @FindBy(css = "._dpmg2--icon-ico-arrow")
    private List<WebElement> monthButtons; //0 prev - 1 next

    @FindBy(css = "._dpmg2--month-active")
    private WebElement actualMonthContainer;

    private CalendarComponent calendar;

    private Calendar calendarJava = Calendar.getInstance();

    @FindBy(css = ".sbox-3-btn.-primary.-md.sbox-search")
    private List<WebElement> searchButton;

/*
    @FindBy(className = "_pnlpk-itemBlock__itemRows")
    private List<WebElement> roomsContainer;*/

    @FindBy(css = "._pnlpk-panel--mobile")
    private WebElement roomsContainer;


    //private Rooms roomsComponent = new Rooms(roomsContainer.get(5)); //Horrible pero es la unica forma de identificarlo
    private Rooms roomsComponent = new Rooms(roomsContainer);

    public SearchHotel typeDestination(String destination) {
        type(destinationInput, destination);
        click(firstSuggestion);
        return this;
    }

    public SearchHotel openCalendar(){
        click(openCalendarElement.get(1));
        return this;
    }

    public SearchHotel openRooms(){
        Javascript.click(openRoomsElement);
        return this;
    }

    public SearchHotelResults pressSearchButton(){
        click(searchButton.get(1));
        return new SearchHotelResults();
    }

    public SearchHotel selectReserve(int day,int month,int year,int duration){
        if(duration>0 && duration<31){ //limitación de cant de dias a reservar y falta limitacion de año y medio
            if(calendarJava.get(Calendar.YEAR) < year){
                int max = 12-(calendarJava.get(Calendar.MONTH)+1);
                for (int i = 0;i<max;i++)
                    pressNextMonthButton();
                for (int j = 0;j<month;j++)
                    pressNextMonthButton();
            }
            calendar = new CalendarComponent(actualMonthContainer);
            calendar.selectReserve(day,month,year,duration);
        }
        return this;
    }

    public Rooms getRoomsComponent(){
        return roomsComponent;
    }

/*
    public SearchHotel selectReserve(int day,int month,int year,int duration){
        Calendar calendar = Calendar.getInstance();
        int today = calendar.get(Calendar.DATE);
        int currentMonth = calendar.get(Calendar.MONTH);
        int currentYear = calendar.get(Calendar.YEAR);
        System.out.println("Today = "+today+"; day = "+day);





        if(month >= currentMonth && year >= currentYear){
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
        }else{
            System.out.println("Datos ingresados incorrecto");
        }


        return this;
    }
*/
    public SearchHotel pressNextMonthButton(){
        click(monthButtons.get(1));
        return this;
    }


}