package selenide;

import org.testng.annotations.Test;
import selinede.po.LoginPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginTest {

    @Test
    public void wikipediaLoginTest () {
        open("https://uk.wikipedia.org/");
        getWebDriver().manage().window().maximize();

        new LoginPage()
                .clickSignInOnWikipedia()
                .inputLoginFieldWikipedia("Potorzhynskyi")
                .inputPasswordFieldWikipedia("Potorzhynskyi51090")
                .clickEntrance();

        assertThat(new LoginPage().getTextNickname().shouldBe(visible).getText())
                .as("The result is not same")
                .isEqualTo("Potorzhynskyi");

    }

}
