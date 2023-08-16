import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static config.WebDriverInit.closeDriver;
import static config.WebDriverInit.getDriver;

public class BaseTest {

    WebDriver driver = null;

    @BeforeMethod(groups = {"All","Smoke","Regression"})
    public void setUp() {
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/");
    }

    @AfterMethod(groups = {"All","Smoke","Regression"})
    public void tearDown(){
        closeDriver();
    }


}