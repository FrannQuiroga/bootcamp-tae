package pages;

import com.bootcamp.tae.page.web.WebComponent;
import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.common.ProductsNavegationBar;

public class Home extends WebPage {

    @FindBy(css = "#nav-search")
    private WebElement NavigationBarContainer;

    public ProductsNavegationBar navegationBar()
    {
        ProductsNavegationBar navegationBar = new ProductsNavegationBar(NavigationBarContainer);

        return navegationBar;
    }

}
