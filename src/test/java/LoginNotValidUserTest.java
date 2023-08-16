import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.LoginPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginNotValidUserTest extends BaseTest{


    @Test(dataProvider = "notValidUser")
    void wikipediaNotValidUser(String result){
        new LoginPage()
                .clickSingIn()
                .inputLogin(result)
                .inputPassword("Potorzhynskyi51090")
                .clickEntrance();

        assertThat(new LoginPage().getNotValidUser())
                .as("Doesn't result")
                .isEqualTo("Введены неверные имя участника или пароль. Попробуйте ещё раз.");

    }

    @DataProvider(name = "notValidUser")
    public Object[][] getNotValidUser(){
        return new Object[][] {
                {"123456"}
        };
    }
}
