package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class CalendarLeftContainer extends WebComponent {

    @FindBy(css = "._dpmg2--month-title-month")
    private WebElement title;

    @FindBy(css = "._dpmg2--date._dpmg2--available")
    private List<WebElement> activeDays;

    protected CalendarLeftContainer(WebElement container) {
        super(container);
    }

    public CalendarLeftContainer selectFirstAvailableDay() {
        click(activeDays.stream()
                .filter(day -> day.getAttribute("class").contains("_dpmg2--today"))
                .findFirst()
                .get()
        );
        return this;
    }

    protected WebElement getTitle(){
        return title;
    }

     protected Boolean isMonth(String month){
        Boolean flag=false;
        if(getTitle().getText().equalsIgnoreCase(month)){
            flag=true;
        }
        return flag;
    }

    public CalendarLeftContainer selectDay(int pickDay) {
        // TODO: Select day from the available days to pick.
        List<WebElement> list = getListAvailableDays();

        if(list.get(list.size()-1).getText().equalsIgnoreCase("30")){
            if(list.size()>pickDay){
                click(list.get(30-list.size()+pickDay-1));
            }
        }else{
            if(list.size()>pickDay){
                click(list.get(31-list.size()+pickDay-1));
            }
        }
        return this;
    }

    private List<WebElement> getListAvailableDays(){
        List<WebElement> list = activeDays.stream()
                .filter(day -> day.getAttribute("class").contains("available")).collect(Collectors.toList());
        return list;
    }
}
