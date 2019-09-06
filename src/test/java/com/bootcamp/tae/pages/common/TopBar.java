package com.bootcamp.tae.pages.common;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.books.BookSearch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TopBar extends WebComponent {

    @FindBy(id = "searchDropdownBox")
    private WebElement categoriesSelect;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBoxInput;

    @FindBy(css = "#nav-search .nav-right input[type=\"submit\"]")
    private WebElement searchButton;


    public TopBar(WebElement container) {
        super(container);
    }

    public TopBar selectBooksCategory() {
        Select categories = new Select(categoriesSelect);
        categories.selectByValue("search-alias=stripbooks-intl-ship");
        return this;
    }

    public TopBar typeBookName(String bookName) {
        type(searchBoxInput, bookName);
        return this;
    }

    public BookSearch search() {
        click(searchButton);
        return new BookSearch();
    }



}
