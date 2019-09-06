package com.bootcamp.tae.books;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookSearch extends WebPage {

    @FindBy (css = ".nav-search-scope.nav-sprite")
    private WebElement searchBar;

    @FindBy (id = "#nav-search-submit-text")
    private  WebElement submitSearch;


    public BookSearch typeBook(String bookName)
    {
        type(searchBar, bookName);

        return this;
    }

    public BooksSearchResults search()
    {
        click(submitSearch);
        return new BooksSearchResults();
    }



}
