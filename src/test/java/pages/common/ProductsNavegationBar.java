package pages.common;

import com.bootcamp.tae.js.Javascript;
import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductsNavegationBar extends WebComponent {

    @FindBy(css = "#searchDropdownBox")
    private WebElement NavBarDropdown;

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement NavBarInput;

    @FindBy(css = "[value = 'Ir']")
    private WebElement NavBarSearch;

    @FindBy(css = "[value = 'search-alias=stripbooks-intl-ship']")
    private WebElement BookSection;


    public ProductsNavegationBar(WebElement container) {
        super(container);

    }


    public ProductsNavegationBar searchForBooks(String bookName)
    {
        Javascript.click(NavBarDropdown);
        click(BookSection);
        type(NavBarInput,bookName);
        click(NavBarSearch);

        return this;

    }
}
