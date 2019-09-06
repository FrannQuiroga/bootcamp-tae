package com.bootcamp.tae.pages.pageObject;

import com.bootcamp.tae.page.web.WebPage;
import com.bootcamp.tae.pages.component.CardBook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends WebPage {

    @FindBy(css = ".sg-col-20-of-24.sg-col-28-of-32.sg-col-24-of-28 > div > span:nth-child(5) > div > div:nth-child(2) > div > div > div")
    private WebElement cardContainer;

    @FindBy()
    private WebElement bookpageButton;

    public BookPage myCard(){
        CardBook cardBook = new CardBook(cardContainer);
        return this;
    }

    public BookPageCart goTo(){
        click(bookpageButton);
        return new BookPageCart();
    }

}
