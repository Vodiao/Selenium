
import org.testng.annotations.Test;
import pageobject.TablePage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TableTest extends BaseTest{

    @Test
    public void getFromTableTest () {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");

        assertThat(new TablePage().getTextFromTable(2,3))
                .as("Selenium locator is not visible")
                .isEqualTo("45");
    }


}
