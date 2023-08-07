package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static config.WebDriverInit.getDriver;


public class BaseMethod {

    protected WebDriverWait getWait(int time) {
        return new WebDriverWait(getDriver(), time);
    }

    protected void input(By locator, String text, int time) {
        getWait(time).until(d -> d.findElement(locator)).sendKeys(text);
    }

    protected void clickEnter(By locator, int time) {
        getWait(time).until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(Keys.ENTER);
    }

    protected String getTextFromElement(By locator, int time) {
        return getWait(time).until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
    }

    protected void click(By locator, int time){
        getWait(time).until(s->s.findElement(locator)).click();
    }
}
