package com.bootcamp.tae.pages.common.pages;

import com.bootcamp.tae.page.web.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends WebPage {

    @FindBy (css = ".s-border-bottom")
    private List<WebElement> results;

    ResultCard result;

    public ItemPage openResult(int index){
        result=new ResultCard(results.get(index));
        result.clickImage();
        return new ItemPage();
    }

    public String getTitleOfItem(int index){
        ResultCard resultTitle=new ResultCard(results.get(index));
        return resultTitle.getTitle();
    }

    public Float getPriceOfItem(int index){
        ResultCard resultTitle=new ResultCard(results.get(index));
        return Float.valueOf(resultTitle.getTitle());
    }

    public boolean getImageOfItemVisibility(int index){
        ResultCard resultTitle=new ResultCard(results.get(index));
        return resultTitle.imageIsVisible();
    }

}
