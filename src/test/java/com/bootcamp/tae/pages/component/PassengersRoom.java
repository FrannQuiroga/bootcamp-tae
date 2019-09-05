package com.bootcamp.tae.pages.component;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengersRoom extends WebComponent {

    @FindBy(css="._pnlpk-stepper-adults  a.steppers-icon-right")
    private WebElement adult;

    private WebElement minor;

    @FindBy(className = "_pnlpk-apply-button sbox-3-btn-ghost _pnlpk-panel__button--link-right -md")
    private WebElement buttonApply;

    public PassengersRoom(WebElement container) {
        super(container);
    }

    @FindBy (css = ".steppers-icon-right.sbox-3-icon-plus")
    private WebElement addAdultsButton;


    public PassengersRoom selectAdultsPlus(){
        return this;
    }

    public PassengersRoom selectAdultsMinus(){
        click(adult);
        return this;
    }

    public PassengersRoom selectChildren(int number){

        return this;
    }

    public PassengersRoom apply(){
        click(buttonApply);
        return this;
    }

}
