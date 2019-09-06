package com.bootcamp.tae.amazon.common;

import com.bootcamp.tae.amazon.AmazonHome;
import com.bootcamp.tae.amazon.common.amazonResults.AmazonResults;
import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderBar extends WebComponent {
    @FindBy(css = ".nav-search-scope.nav-sprite")
    private WebElement navSearchScope;

    @FindBy(css = ".nav-search-dropdown.searchSelect")
    private List<WebElement> navScopeDropdown;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(css = ".nav-search-submit .nav-input")
    private WebElement searchButton;


    public HeaderBar(WebElement container) {
        super(container);
    }

    public AmazonHome chooseCategory(String category){
        click(navSearchScope);
        areVisible(navScopeDropdown);
        click(navScopeDropdown.stream()
                .filter(x -> x.getText().equalsIgnoreCase(category))
                .findFirst()
                .get()
        );
        return new AmazonHome();
    }

    public AmazonHome typeInSearch(String element){
        type(searchInput, element);
        return new AmazonHome();
    }

    public AmazonResults clickSearch(){
        click(searchButton);
        return new AmazonResults();
    }
}
