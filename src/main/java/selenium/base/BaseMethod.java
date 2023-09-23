package selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.config.WebDriverInit;

import static java.time.Duration.ofSeconds;


public class BaseMethod {

    protected WebDriverWait getWait(int time) {
        return new WebDriverWait(WebDriverInit.getDriver(), ofSeconds(10));
    }

    protected void send(By locator, String text, int time) {
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

    protected void doubleClick(By locator){
        WebElement doubleElement = getWait(5).until((d -> d.findElement(locator)));
        getAction().doubleClick(doubleElement).build().perform();
    }

    protected void rightClick(By locator){
        WebElement rightElement = getWait(5).until((d -> d.findElement(locator)));
        getAction().contextClick(rightElement).build().perform();
    }

    protected Actions getAction(){
        return new Actions(WebDriverInit.getDriver());

    }

    protected void dragAndDrop(By drag, By drop){
        WebElement dragElement = getWait(5).until(d->d.findElement(drag));
        WebElement dropElement = getWait(5).until(d->d.findElement(drop));
        getAction().dragAndDrop(dragElement,dropElement).build().perform();
    }




}
