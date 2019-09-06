package common;

import com.bootcamp.tae.books.BookSearch;
import com.bootcamp.tae.page.web.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopBar extends WebComponent {

    @FindBy(id = "#searchDropdownBox")
    private WebElement categoryFilter;

    @FindBy(id = "#searchDropdownBox")
    private List<WebElement> dropDown;



    protected TopBar(WebElement container) {
        super(container);
    }

    public BookSearch books(){
        click(categoryFilter);
        selectCategory("Books");
        return new BookSearch();
    }

    protected void selectCategory(String selectedCategory) {
        areVisible(dropDown);
        click(dropDown.stream()
                .filter(category -> category.getAttribute("value").contains(selectedCategory))
                .findFirst()
                .get()
        );
    }
}