package com.bootcamp.tae.pages.pageObject;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.component.Calendar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox extends WebPage {
    @FindBy(id="searchbox-sbox-box-hotels")
    private WebElement searchBox;
    private Calendar calendar;

    public SearchBox() {
        this.calendar = new Calendar(searchBox);
    }

    @FindBy(css = ".sbox-place-container .-icon-left .input-tag")
    private WebElement inputCity;
    public SearchBox searchCity(){
        inputCity.clear();
        type(inputCity,"Miami, Florida, United States of America");
        return this;
    }

    public Calendar checkIn(){
        return calendar.checkIn();
    }


}
