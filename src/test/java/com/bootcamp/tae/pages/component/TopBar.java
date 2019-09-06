package com.bootcamp.tae.pages.component;


import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.book.SearchBook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends WebComponent {

    @FindBy(className = "nav-searchbar")
    private WebElement navBar;

    public TopBar(WebElement container) {
        super(container);
    }

    public  SearchBook book(){
        return new SearchBook(navBar);
    }


}
