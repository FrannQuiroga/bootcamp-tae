package com.bootcamp.tae.pages.hotel;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.hotel.common.calendar.Calendar;
import com.bootcamp.tae.pages.hotel.common.calendar.CalendarContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotelSearchPage extends WebPage {

    @FindBy(css = ".sbox-destination.sbox-primary")
    private WebElement destinationInput;

    @FindBy(css = ".ac-group-container .item")
    private List<WebElement> suggestionsDropdown;

    @FindBy(css = ".sbox-checkin-date")
    private WebElement checkInInput;

     @FindBy(css = ".sbox-checkout-date")
    private WebElement checkOutInput;

    //TODO: @FindBy
    private WebElement roomsInput;

    //TODO: @FindBy
    private WebElement roomsContainer;

    @FindBy(css = "#searchbox-sbox-box-hotels .sbox-search")
    private WebElement searchButton;

    @FindBy(css = "._dpmg2--wrapper")
    private WebElement calContainer;

    public CalendarContainer calendarContainer(){
        return new CalendarContainer(calContainer)
    }

    public HotelSearchPage typeDestination(String destination) {
        type(destinationInput, destination);
        click(suggestionsDropdown.get(0));
        return this;
    }
    public HotelSearchPage selectCheckIn() {
        click(checkInInput);
        calendarContainer().selectCheckIn("September", 20);
        return this;
    }

   /* public HotelSearchPage selectCheckOut() {
        click(checkOutInput);
        calendarContainer().selectCheckOut("September", 24);
        return this;
    }*/

    public HotelSearchPage selectChildren() {
        // TODO Select children and age
        return this;
    }

    public HotelSearchResultsPage search() {
        click(searchButton);
        return new HotelSearchResultsPage();
    }

}
