package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectMinorAge extends WebComponent {

    @FindBy(css = "._pnlpk-itemRow .select-tag")
    private WebElement selectAgeButton;

    @FindBy(css = "._pnlpk-itemRow .select-tag .select-option")
    private List<WebElement> selectAgeList;

    protected SelectMinorAge(WebElement container) {
        super(container);
    }

    public void selectAge(int age){
        click(selectAgeButton);
        click(selectAgeList.get(age+1));
    }
}
