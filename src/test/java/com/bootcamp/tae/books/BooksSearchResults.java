package com.bootcamp.tae.books;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BooksSearchResults extends WebPage {


    @FindBy (css = "[data-index='0']")
    private List<WebElement> bookList;


}
