package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.BaseTest;
import selenium.pageobject.InnerFramePage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TextFromInnerFrameTest extends BaseTest {


    @Test
    public void getTextFromInnerFrameTest() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");

        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame);

        WebElement innerFrame = driver.findElement(By.xpath("/html/body/iframe"));
        driver.switchTo().frame(innerFrame);

        assertThat(new InnerFramePage().getTextFromInnerFrame())
                .as("Selenium located not into frame")
                .isEqualTo("Child Iframe");
    }
}
