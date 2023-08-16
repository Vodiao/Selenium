import org.testng.annotations.Test;
import pageobject.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;




public class LoginTest extends BaseTest {

    @Test(groups = {"Smoke"})
    void wikipediaAccountLogin() {
        new LoginPage()
                .clickSingIn()
                .inputLogin("Potorzhynskyi")
                .inputPassword("Potorzhynskyi51090")
                .clickEntrance();




        assertThat(new LoginPage().getTitle())
                .as("The result is not same")
                .isEqualTo("Potorzhynskyi");
    }





}
