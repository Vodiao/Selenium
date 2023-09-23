package uldk;

import org.testng.annotations.Test;

import selenium.pageobjectsoftcr.UslugaULDKPage;

import static org.assertj.core.api.Assertions.assertThat;


public class UslugaULDKTest extends BaseTest {

    /**
     * Login i hasło będą w przyszłości ukryte
     */

    @Test
    void wyszukiwanieTylkoPrzezNumerDzialkiTest () throws InterruptedException {


        driver.manage().window().maximize();
        driver.get("https://test2pitmap.uke.gov.pl/");
        new UslugaULDKPage()
                .clickZaloguj()
                .clickZalogujSie()
                .inputLogin("softcreamtestyautomatyczne@gmail.com")
                .inputPassword("8^juHe8@P2")
                .clickEntrance()
                .clickWyszukiwanie()
                .clickWyszukiwanieObiektow()
                .expectation()
                .clickLokalizowanieObiektow()
                .expectation()
                .inputNumerDzialki("061202_4.0011.14")
                .clickSzukaj()
                .expectation();

        /**
         * nie zwraca wartości
         */
//         assertThat(new WyszukiwaniePage().getTitle())
//                 .as("The result is not same")
//                 .isEqualTo("061202_4.0011.14");

    }

    @Test
    void wyszukiwanieDzialekEwidencyjnychTest () throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://test2pitmap.uke.gov.pl/");

        new UslugaULDKPage()
                .clickZaloguj()
                .clickZalogujSie()
                .inputLogin("softcreamtestyautomatyczne@gmail.com")
                .inputPassword("8^juHe8@P2")
                .clickEntrance()
                .clickWyszukiwanie()
                .clickWyszukiwanieObiektow()
                .expectation()
                .clickLokalizowanieObiektow()
                .clickWojewodztwoList()
                .clickLubelskie()
                .clickPowiatList()
                .clickPowiatOpolski()
                .clickGminaList()
                .clickGminaJozefowNadWisla()
                .clickObrebList()
                .clickObrebJozefowNadWisla()
                .inputNumerDzialki("14")
                .clickSzukaj();

        /**
         * nie zwraca wartości
         */
//         assertThat(new UslugaULDKPage().getIdentyfikatorDzialki())
//                 .as("The result is not same")
//                 .isEqualTo("061202_4.0011.14");
    }
}
