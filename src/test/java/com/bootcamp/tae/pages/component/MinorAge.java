package com.bootcamp.tae.pages.component;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.util.resources.cldr.gd.CalendarData_gd_GB;

import java.util.List;

import static java.lang.Long.parseLong;

public class MinorAge extends WebComponent {

    @FindBy(className = "select-option")
    private List<WebElement> ages;

    public MinorAge(WebElement container) {
        super(container);
    }

    public MinorAge selecAge(int age){
        areVisible(ages);
        click(ages.get(age+1));
        return this;
    }
}
