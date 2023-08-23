import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.LoginPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginNotValidPasswordTest extends BaseTest {

    @Test(dataProvider = "notValidPassword")
    void wikipediaNotValidPassword(String result) {
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/");
        new LoginPage()
                .clickSingIn()
                .inputLogin("Potorzhynskyi")
                .inputPassword(result)
                .clickEntrance();


        assertThat(new LoginPage().getNotValidPass())
                .as("Doesn't result")
                .isEqualTo("Введены неверные имя участника или пароль. Попробуйте ещё раз.");
    }

    @DataProvider(name = "notValidPassword")
    public Object[][] getNotValidPassword() {
        return new Object[][]{
                {"Potorzhynskyi51090!"},
                {"P   2"}
        };
    }

}
