import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import pageobject.ClickButtonPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ActionsTest extends BaseTest {

    @Test
    public void checkDoubleAndRightClick (){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        new ClickButtonPage()
                .clickDoubleClick()
                .clickRightClick();

        assertThat(new ClickButtonPage().getDoubleText())
                .as("The text is not visible")
                .isEqualTo("You have done a double click");


        assertThat(new ClickButtonPage().getRightText())
                .as("The text is not visible")
                .isEqualTo("You have done a right click");

    }
}
