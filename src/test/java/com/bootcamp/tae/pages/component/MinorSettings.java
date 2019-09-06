package com.bootcamp.tae.pages.component;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MinorSettings extends WebComponent {

    @FindBy(css="body > div.distpicker.distpicker-hotels > div > div._pnlpk-panel-scroll > div._pnlpk-panel__blocks._pnlpk-dynamicContent > div:nth-child(1) > div._pnlpk-itemBlock__itemRows > div._pnlpk-minors-age-select-wrapper > div:nth-child(1) > div._pnlpk-itemRow__item._pnlpk-select-minor-age > div > div > select")
    private WebElement child1;

    @FindBy(css = "body > div.distpicker.distpicker-hotels > div > div._pnlpk-panel-scroll > div._pnlpk-panel__blocks._pnlpk-dynamicContent > div:nth-child(1) > div._pnlpk-itemBlock__itemRows > div._pnlpk-minors-age-select-wrapper > div:nth-child(2) > div._pnlpk-itemRow__item._pnlpk-select-minor-age > div > div > select")
    private WebElement child2;

    @FindBy(css = "body > div.distpicker.distpicker-hotels > div > div._pnlpk-panel-scroll > div._pnlpk-panel__blocks._pnlpk-dynamicContent > div:nth-child(1) > div._pnlpk-itemBlock__itemRows > div._pnlpk-minors-age-select-wrapper > div:nth-child(3) > div._pnlpk-itemRow__item._pnlpk-select-minor-age > div > div > select")
    private WebElement child3;

    @FindBy(css = "body > div.distpicker.distpicker-hotels > div > div._pnlpk-panel-scroll > div._pnlpk-panel__blocks._pnlpk-dynamicContent > div:nth-child(1) > div._pnlpk-itemBlock__itemRows > div._pnlpk-minors-age-select-wrapper > div:nth-child(4) > div._pnlpk-itemRow__item._pnlpk-select-minor-age > div > div > select")
    private WebElement child4;

    @FindBy(css = "body > div.distpicker.distpicker-hotels > div > div._pnlpk-panel-scroll > div._pnlpk-panel__blocks._pnlpk-dynamicContent > div:nth-child(1) > div._pnlpk-itemBlock__itemRows > div._pnlpk-minors-age-select-wrapper > div:nth-child(5) > div._pnlpk-itemRow__item._pnlpk-select-minor-age > div > div > select")
    private WebElement child5;

    @FindBy(css = "body > div.distpicker.distpicker-hotels > div > div._pnlpk-panel-scroll > div._pnlpk-panel__blocks._pnlpk-dynamicContent > div:nth-child(1) > div._pnlpk-itemBlock__itemRows > div._pnlpk-minors-age-select-wrapper > div:nth-child(6) > div._pnlpk-itemRow__item._pnlpk-select-minor-age > div > div > select")
    private WebElement child6;

    @FindBy(css = "body > div.distpicker.distpicker-hotels > div > div._pnlpk-panel-scroll > div._pnlpk-panel__blocks._pnlpk-dynamicContent > div:nth-child(1) > div._pnlpk-itemBlock__itemRows > div._pnlpk-minors-age-select-wrapper > div:nth-child(7) > div._pnlpk-itemRow__item._pnlpk-select-minor-age > div > div > select")
    private WebElement child7;

    private int amountMinor=0;

    public MinorSettings(WebElement container) {
        super(container);
    }

    private MinorSettings clickMinor(int age){
        switch (getAmountMinor()){
            case 1:
                click(child1);
                new MinorAge(child1).selecAge(age);
                break;
            case 2:
                click(child2);
                new MinorAge(child2).selecAge(age);
                break;
            case 3:
                click(child3);
                new MinorAge(child3).selecAge(age);
                break;
            case 4:
                click(child4);
                new MinorAge(child4).selecAge(age);
                break;
            case 5:
                click(child5);
                new MinorAge(child5).selecAge(age);
                break;
            case 6:
                click(child6);
                new MinorAge(child6).selecAge(age);
                break;
            case 7:
                click(child7);
                new MinorAge(child7).selecAge(age);
                break;
            default:break;
        }
        return this;
    }

    public MinorSettings addMinor(int age) {
        setAmountMinor();
        clickMinor(age);
        return this;
    }

    public void setAmountMinor() {
        this.amountMinor++;
    }

    public int getAmountMinor() {
        return amountMinor;
    }
}
