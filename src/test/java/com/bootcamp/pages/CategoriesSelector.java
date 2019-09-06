package com.bootcamp.pages;

import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoriesSelector extends WebComponent {

    @FindBy(css = ".nav-search-scope.nav-focus")
    private List<WebElement> categoriesAvailables;

    public CategoriesSelector(WebElement container) {
        super(container);
    }

    public CategoriesSelector selectCategory(int index){
        areVisible(categoriesAvailables);
        click(categoriesAvailables.get(index)); //Books is position 5
        return this;
    }
}

