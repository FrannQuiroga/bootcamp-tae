package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.Hotel.SearchHotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Rooms extends WebComponent {

    /*
    @FindBy (css = ".steppers-icon-right")
    private WebElement addAdultsButton;

    @FindBy (css = ".steppers-icon-left")
    private WebElement minusAdultsButton;

    @FindBy (css = ".steppers-icon-right.sbox-3-icon-plus")
    private List<WebElement> addChildButton;

    @FindBy (css = ".steppers-icon-left.sbox-3-icon-minus")
    private List<WebElement> minusChildButton;
*/
    @FindBy (css = ".steppers-icon-right.sbox-3-icon-plus")
    private List<WebElement> addButton; //0 adults - 1 child

    @FindBy (css = ".steppers-icon-left.sbox-3-icon-minus")
    private List<WebElement> minusButton; // 0 adults - 1 child

    @FindBy (css = "._pnlpk-apply-button")
    private WebElement applyButton;

    @FindBy (css = "._pnlpk-select-minor-age")
    private List<WebElement> minorAgesContainer;

    private List<SelectMinorAge> minorAgesEdit = new ArrayList<SelectMinorAge>();

    private int adults;
    private int children;

    public Rooms(WebElement container) {
        super(container);
        adults = 2;
        children = 0;
    }

    /**
     * The sum of Adults + Childrens in the same rooms musn't be +8
     * @param cant
     * @return
     */
    public SearchHotel setAdults(int cant){
        /*if (cant==1){
            removeAdult();
        } else if(cant>2){
            if(cant>8) cant=8;
            for(int i = 0;i<cant-2;i++)
                addAdult();
        }*/
        if(cant>adults){
            for(int i = 0 ;i < cant-adults;i++)
                addAdult();
        }else if(cant<adults){
            for(int i = 0;i < adults-cant;i++)
                removeAdult();
        }
        adults = cant;
        //Arrojar excepcion si la suma de adults + children es >8
        return new SearchHotel();
    }

    /**
     * The sum of Adults + Childrens in the same rooms musn't not exceed 8
     * @param cant
     * @return
     */
    public SearchHotel setChildrens(int cant){
        if(cant>children){
            for(int i = 0 ;i < cant-children;i++)
                addChild();
        }else if(cant<children){
            for(int i = 0;i < children-cant;i++)
                removeChild();
        }
        children = cant;
        //Arrojar excepcion si la suma de adults + children es >8
        return new SearchHotel();
    }

    public void addAdult(){
        Javascript.click(addButton.get(0));
    }

    public void removeAdult(){
       Javascript.click(minusButton.get(0));
    }

    public void addChild(){
        Javascript.click(addButton.get(1));
    }

    public void removeChild(){
        Javascript.click(minusButton.get(1));
    }

    public SearchHotel pressApplyButton(){
        click(applyButton);
        return new SearchHotel(); //Está mal que retorne instancia de la página que la contiene, pero fue hecho así a fin de terminar el ejercicio (Mejorar)
    }

    public SearchHotel setMinorAge (ArrayList<Integer> ages){
        int i = 0;
        for(Integer age : ages){
            minorAgesEdit.add(new SelectMinorAge(minorAgesContainer.get(i)));
            minorAgesEdit.get(i).selectAge(age);
            i++;
        }
        return new SearchHotel();  //Está mal que retorne instancia de la página que la contiene, pero fue hecho así a fin de terminar el ejercicio (Mejorar)
    }

}
