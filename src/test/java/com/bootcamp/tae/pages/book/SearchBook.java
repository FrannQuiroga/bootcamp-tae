package com.bootcamp.tae.pages.book;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.pages.pageObject.BookPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class SearchBook extends WebComponent {

    @FindBy(className = "searchDropdownDescription")
    private WebElement navButton;

    @FindBy(css="#searchDropdownBox")
    private List <WebElement> dropDown;

    @FindBy(css="#twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(className = "nav-search-submit nav-sprite")
    private WebElement searchButton;

    public SearchBook(WebElement container) {
        super(container);
    }

    public SearchBook chooseOption(){
        isVisible(navButton);
        click(navButton);
        dropDown.stream().filter(book -> book.getText().equalsIgnoreCase("Books")).findFirst().get();
        type(searchBar,"embracing the power of ai: a gentle co-guide");
        return this;
    }

    public BookPage goTo(){
        click(searchButton);
        return new BookPage();
    }


}
