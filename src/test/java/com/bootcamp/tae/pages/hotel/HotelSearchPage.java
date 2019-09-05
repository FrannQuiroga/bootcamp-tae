package com.bootcamp.tae.pages.hotel;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.hotel.common.calendar.CalendarContainer;
import com.bootcamp.tae.pages.hotel.searchResults.HotelSearchResultsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelSearchPage extends WebPage {

    @FindBy(css = ".sbox-destination.sbox-primary")
    private WebElement destinationInput;

    @FindBy(css = ".ac-group-container .item")
    private /*List<WebElement>*/WebElement suggestionsDropdown;

    @FindBy(css = "#searchbox-sbox-box-hotels .sbox-checkin-date")
    private WebElement checkInInput;

     @FindBy(css = "#searchbox-sbox-box-hotels .sbox-checkout-date")
    private WebElement checkOutInput;

    @FindBy(css = "#searchbox-sbox-box-hotels .sbox-distribution .sbox-distribution-picker-wrapper")
    private WebElement roomsInput;

    //TODO: @FindBy
    private WebElement roomsContainer;

    @FindBy(css = "#searchbox-sbox-box-hotels .sbox-search")
    private WebElement searchButton;

    @FindBy(css = "._dpmg2--wrapper")
    private WebElement calContainer;

    public CalendarContainer calendarContainer(){
        return new CalendarContainer(calContainer);
    }

    public HotelSearchPage typeDestination(String destination) {
        type(destinationInput, destination);
        click(suggestionsDropdown/*.get(0)*/);
        return this;
    }
    public HotelSearchPage selectCheckIn(String month, String day) {
        click(checkInInput);
        calendarContainer().selectDates(month, day);
        return this;
    }

    public HotelSearchPage selectCheckOut(String month, String day) {
        calendarContainer().selectDates(month, day);
        return this;
    }

    public HotelSearchPage selectChildren() {
        click(roomsInput);
        return this;
    }

    public HotelSearchResultsPage search() {
        click(searchButton);
        return new HotelSearchResultsPage();
    }

}
