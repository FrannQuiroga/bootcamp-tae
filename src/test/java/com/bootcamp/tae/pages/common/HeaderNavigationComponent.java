package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.hotel.Accommodations;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderNavigationComponent extends WebComponent {

    @FindBy(css = ".HOTELS")
    private WebElement accommodationsLink;

    public HeaderNavigationComponent(WebElement container) {
        super(container);
    }

    public Accommodations accommodations() {
        click(accommodationsLink);
        return new Accommodations();
    }


}
