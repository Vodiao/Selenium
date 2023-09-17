package selenium.pageobject;

import selenium.base.BaseMethod;
import org.openqa.selenium.By;

public class WyszukiwaniePage extends BaseMethod {

    private final By singIn = By.xpath("//a[@class = 'nav-link']");
    private final By login = By.xpath("//input[@id='wpName1']");
    private final By password = By.xpath("//input[@id='wpName1']");

    public WyszukiwaniePage clickSingIn() {
        click(singIn, 20);
        return this;
    }
}


