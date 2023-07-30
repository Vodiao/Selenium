import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;

public class HomeWorkQA15 {
    public static void main(String[] args) {
        By search = By.xpath("//input[@class='vector-search-box-input']");
        By header = By.xpath("//span[@class='mw-page-title-main']");
        By clickSearch = By.xpath("//input[@id='searchButton']");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ru.wikipedia.org/");

        sendElement(driver, search, "Ubisoft");
        clickEnter(driver, clickSearch);

        assertEquals("Ubisoft", getTextFromElement(driver,header));

        driver.quit();

    }

    static void sendElement(WebDriver driver, By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(d -> d.findElement(locator)).sendKeys(text);

    }

    static void clickEnter(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(Keys.ENTER);

    }

    static String getTextFromElement(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();

    }
}
