package selenium;

import org.testng.annotations.Test;
import selenium.pageobject.WyszukiwaniePage;

public class WyszukiwanieTest extends BaseTest{

    @Test
    void wyszukiwanieTest (){
        driver.manage().window().maximize();
        driver.get("https://test2pitmap.uke.gov.pl/");
        new WyszukiwaniePage()
                .clickSingIn();

    }
}
