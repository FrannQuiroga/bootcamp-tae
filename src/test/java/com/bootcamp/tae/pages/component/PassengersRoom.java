package com.bootcamp.tae.pages.component;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengersRoom extends WebComponent {

    @FindBy(css="._pnlpk-dynamicContent > div:nth-child(1) > div._pnlpk-itemBlock__itemRows > div:nth-child(1) > div .steppers-icon-right.sbox-3-icon-plus")
    private WebElement adultPlus;

    @FindBy(css="._pnlpk-itemBlock__itemRows > div:nth-child(1) > div.-medium-down-to-lg > div > a.steppers-icon-left.sbox-3-icon-minus")
    private WebElement adultMinus;

    @FindBy(css = "._pnlpk-apply-button")
    private WebElement buttonApply;

    @FindBy(css = "._pnlpk-dynamicContent > div:nth-child(1) > div._pnlpk-itemBlock__itemRows > div:nth-child(2) > div .steppers-icon-right.sbox-3-icon-plus")
    private WebElement minorPlus;

    @FindBy(className = "_pnlpk-minors-age-select-wrapper")
    private WebElement minorsList;

    private MinorSettings minorSettings;

    public PassengersRoom(WebElement container) {
        super(container);
         minorSettings = new MinorSettings(minorsList);
    }

    private PassengersRoom selectClick(WebElement element){
        click(element);
        return this;
    }

    public PassengersRoom amountAdults(int amount){
        int count=2;
        if(amount<count){
            selectClick(adultMinus);
        }else{
            while(amount>count){
                selectClick(adultPlus);
                count++;
            }
        }
        return this;
    }

    public PassengersRoom addMinor(int age) {
        selectClick(minorPlus);
        minorSettings.addMinor(age);
        return this;
    }

    public PassengersRoom apply(){
        selectClick(buttonApply);
        return this;
    }
}
