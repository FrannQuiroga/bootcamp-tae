package pages;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookSearchResults extends WebPage {

    @FindBy(css = ".s-result-list.sg-row .sg-col-20-of-24")
    private List<WebElement> searchResultList;





}
