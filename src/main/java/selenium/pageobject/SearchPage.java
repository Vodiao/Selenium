package selenium.pageobject;

import selenium.base.BaseMethod;
import org.openqa.selenium.By;

public class SearchPage extends BaseMethod {
    private final By search = By.xpath("//input[@class='vector-search-box-input']");

    private final By header = By.xpath("//span[@class='mw-page-title-main']");

    private final By clickSearch = By.xpath("//input[@id='searchButton']");


    public void fillText(String text) {
        send(search, text, 15);
    }

    public void clickEnter(){
       clickEnter(clickSearch,10);
    }

    public String getTitle(){
        return getTextFromElement(header,10);
    }

}
