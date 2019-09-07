package com.bootcamp.tae.pages.hotel;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.common.calendar.CalendarsContainerComponent;
import com.bootcamp.tae.pages.common.RoomsComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Accommodations extends WebPage {

    @FindBy(css = ".sbox-hotels-container .sbox-destination")
    private WebElement destinationInput;

    @FindBy(css = ".sbox-hotels-container .sbox-checkin-date")
    private WebElement checkInInput;

    @FindBy(css = ".sbox-hotels-container .sbox-checkout-date")
    private WebElement checkOutInput;

    @FindBy(css = ".sbox-hotels-container .-rooms")
    private WebElement roomsInput;

    @FindBy(css = ".sbox-hotels-container .sbox-search")
    private WebElement searchBtn;

    @FindBy(css = ".ac-group-items:not(:empty) li")
    private List<WebElement> destinationPlace;

    @FindBy(css = ".sbox-ui-datepicker-container ._dpmg2--wrapper")
    private WebElement calendarsContainer;

    @FindBy(css = "._pnlpk-itemBlock:not(._pnlpk-itemBlock--hidden)")
    private WebElement roomsContainer;

    private CalendarsContainerComponent calendars;


    private void setTextInDestinationBox(String text) {
        type(destinationInput, text);
    }


    /**
     * Selects the element-th from the destination list after typing
     *
     * @param element
     */
    private void selectNthDestinationFromList(int element) {
        click(destinationPlace.get(element - 1));
    }


    /**
     * Sets destination as the first destination from the search result
     *
     * @param destination
     */
    public Accommodations setDestination(String destination) {
        setTextInDestinationBox(destination);
        if (areVisible(destinationPlace))
            selectNthDestinationFromList(1);
        return this;
    }

    /**
     * Sets destination as the element-th destination from the search result
     *
     * @param destination
     * @param element
     */
    public Accommodations setDestination(String destination, int element) {
        setTextInDestinationBox(destination);
        if (areVisible(destinationPlace))
            selectNthDestinationFromList(element);
        return this;
    }

    public Accommodations selectCheckInDate(String date) {
        click(checkInInput);
        this.calendars = new CalendarsContainerComponent(calendarsContainer);
        calendars.selectCheckInDate(date);
        return this;
    }

    public Accommodations selectCheckOutDate(int nights) {
        calendars.selectCheckOutDate(nights);
        return this;
    }

    public Accommodations selectGuests(int adults, int minors, List<Integer> ages) {
        Javascript.click(roomsInput);
        RoomsComponent rooms = new RoomsComponent(roomsContainer);
        rooms.selectAdults(adults)
                .selectMinors(minors, ages);
        return this;
    }

    public HotelSearch search() {
        click(searchBtn);
        return new HotelSearch();
    }

}
