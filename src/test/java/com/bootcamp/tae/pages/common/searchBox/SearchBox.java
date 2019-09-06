package com.bootcamp.tae.pages.common.searchBox;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox extends WebComponent {

    @FindBy (css = ".nav-searchbar")
    private WebElement categoriesContainer;

    private CategoriesOption categories = new CategoriesOption(categoriesContainer);

    @FindBy (id = "twotabsearchtextbox")
    private WebElement inputText;

    @FindBy (css = ".nav-search-submit .nav-input")
    private WebElement searchButton;

    public SearchBox(WebElement container) {
        super(container);
    }

    public void inputText(String text){
        type(inputText,text);
    }

    public void clickSearch(){
        click(searchButton);
    }

    public void selectCategory(int index){
        categories.clickCategory(index);
    }

}
