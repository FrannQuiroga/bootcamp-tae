package com.bootcamp.tae.common;

import com.bootcamp.tae.book.BookSearch;
import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends WebComponent {

    @FindBy(css = "nav-search-scope nav-sprite")
    private WebElement dropDownCategories;

    protected TopBar(WebElement container) {
        super(container);
    }

    public BookSearch selectCategories(WebElement dropDownCategories){
        click(dropDownCategories);
        return new BookSearch();
    }

}
