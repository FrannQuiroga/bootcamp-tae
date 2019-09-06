package com.bootcamp.tae.pages.Hotel;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.common.CalendarContainer;
import com.bootcamp.tae.pages.component.PassengersRoom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class HotelSearch extends WebPage {

    @FindBy(css = ".sbox-destination.sbox-primary")
    private WebElement destinationInput;

    @FindBy(css = ".ac-group-container .item")
    private List<WebElement> suggestionsDropdown;

    @FindBy(className = "sbox-checkin-date")
    private List<WebElement>  ClickInInput;

    @FindBy (css="._dpmg2--wrapper")
    private  WebElement calendarBox;

    @FindBy(css = ".distpicker.distpicker-hotels")
    //@FindBy  (css = "._pnlpk-panel--show")
    private WebElement roomsContainer;

    @FindBy (css=".sbox-distribution.-mr3-l.-mb3-s .input-container")
    private WebElement buttonRooms;

    @FindBy(css = "#searchbox-sbox-box-hotels .sbox-search")
    private WebElement searchButton;

    public HotelSearch typeDestination(String destination){
        type(destinationInput, destination);
        areVisible(suggestionsDropdown);
        click(suggestionsDropdown.get(0));
        return this;
    }

    public HotelSearch selectDate() {
        click(ClickInInput.get(1));
        CalendarContainer calendarContainer = new CalendarContainer(calendarBox);
        calendarContainer.CheckIn();
        calendarContainer.CheckOut();
        return this;
    }

    public HotelSearch selectChildren()  {
        click(buttonRooms);
        isVisible(roomsContainer);
        PassengersRoom passengersRoom = new PassengersRoom(roomsContainer);
        passengersRoom.amountAdults(2)
                .addMinor(7)
                .addMinor(13)
                .apply();
        return this;
    }

    public HotelSearchResults search() {
        click(searchButton);
        return new HotelSearchResults();
    }
}
