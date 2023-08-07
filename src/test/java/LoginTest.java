import org.testng.annotations.Test;
import pageobject.LoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends BaseTest{
    LoginPage loginPage = new LoginPage();


    @Test
    void wikipediaAccountLogin(){
        loginPage.clickSingIn();
        loginPage.inputLogin("Potorzhynskyi");
        loginPage.inputPassword("Potorzhynskyi51090");
        loginPage.clickEntrance();

      assertEquals("The result is not same", loginPage.getTitle(), "Potorzhynskyi");



    }

}
