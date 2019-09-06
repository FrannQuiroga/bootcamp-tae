package common;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WebPage{

    @FindBy(id = "#nav-search")
    private WebElement topBarContainer;

    public TopBar topBar()
    {
        return new TopBar(topBarContainer);
    }

}
