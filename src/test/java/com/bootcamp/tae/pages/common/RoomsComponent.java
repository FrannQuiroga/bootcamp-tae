package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RoomsComponent extends WebComponent {

    @FindBy(css = "._pnlpk-itemBlock:not(._pnlpk-itemBlock--hidden) ._pnlpk-minor-age-select-last-item .select-tag option")
    private List<WebElement> minorsAge;

    @FindBy(css = "._pnlpk-itemBlock:not(._pnlpk-itemBlock--hidden) ._pnlpk-stepper-adults .sbox-3-icon-plus")
    private WebElement addAdult;

    @FindBy(css = "._pnlpk-itemBlock:not(._pnlpk-itemBlock--hidden) ._pnlpk-stepper-minors .sbox-3-icon-plus")
    private WebElement addMinor;

    @FindBy(css = "._pnlpk-itemBlock:not(._pnlpk-itemBlock--hidden) ._pnlpk-stepper-adults .sbox-3-icon-minus")
    private WebElement sustractAdult;


    public RoomsComponent(WebElement container) {
        super(container);
    }

    /**
     *
     * @param adults must be > 0
     * @return
     */
    public RoomsComponent selectAdults(int adults) {
        switch (adults) {
            case 1: click(sustractAdult);
                break;
            case 2:
                break;
            default: {
                int N = adults - 2;
                for(int i = 0; i < N; i++) {
                    click(addAdult);
                }
            }
        }
        return this;
    }

    /**
     *
     * @param minors
     * @param ages every age must be >= 0 and < 18
     * @return
     */
    public RoomsComponent selectMinors(int minors, List<Integer> ages) {
        //I don't use Selenium Select because I'd have to create one instance in every cycle, and that's not possible
        for(int i = 0; i < minors; i++) {
            click(addMinor);
            Integer age = ages.get(i);
            WebElement ageElement = minorsAge.stream()
                    .filter( (edad) -> edad.getAttribute("value").contentEquals(age.toString()) )
                    .findFirst()
                    .get();
            click(ageElement);
        }

        return this;
    }

}
