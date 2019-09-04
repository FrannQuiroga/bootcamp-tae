package com.bootcamp.tae.pages.hotel;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.hotel.common.calendar.CalendarContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelSearchPage extends WebComponent {

    @FindBy(css = ".sbox-destination")
    private WebElement destinationInput;

    @FindBy(css = ".ac-group-container .item")
    private /*List<WebElement>*/ WebElement suggestionsDropdown;

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

    public HotelSearchPage(WebElement container) {
        super(container);
    }

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
        calendarContainer().selectCheckIn(month, day);
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
