package selenium.pageobject;

import selenium.base.BaseMethod;
import org.openqa.selenium.By;

public class ClickButtonPage extends BaseMethod {

    private final By doubleClick = By.xpath("//button[@id='doubleClickBtn']");

    private final By rightClick = By.xpath("//button[@id='rightClickBtn']");

    private final By getDoubleClickText = By.xpath("//p[@id='doubleClickMessage']");

    private final By getRightClickText = By.xpath("//p[@id='rightClickMessage']");


    public ClickButtonPage clickDoubleClick() {
        doubleClick(doubleClick);
        return this;
    }

    public ClickButtonPage clickRightClick() {
         rightClick(rightClick);
        return this;
    }

    public String getDoubleText() {
        return getTextFromElement(getDoubleClickText, 5);
    }

    public String getRightText() {
        return getTextFromElement(getRightClickText, 5);
    }
}
