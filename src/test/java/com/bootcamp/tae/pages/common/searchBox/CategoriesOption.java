package com.bootcamp.tae.pages.common.searchBox;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoriesOption extends WebComponent {

    @FindBy (css = ".nav-search-scope .nav-search-facade")
    private WebElement categoryButton;

    @FindBy(css = "[value]")
    List<WebElement> categories;

    protected CategoriesOption(WebElement container) {
        super(container);
    }

    public CategoriesOption getCategories(){
        return this;
    }

    public void openCategories(){
        Javascript.click(categoryButton);
    }

    public void clickCategory(int index){
        openCategories();
        click(categories.get(index));
    }
}
