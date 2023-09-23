package selenium.pageobjectsoftcr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.BaseMethod;

import java.util.List;

public class UslugaULDKPage extends BaseMethod {

    private String username;

    private String password;

    private String numerLubIdentyfikatorDzialki;

    private final By zaloguj = By.xpath("//a[@class = 'nav-link']");
    private final By zalogujSie = By.xpath("//button[@id='log']");
    private final By login = By.xpath("//input[@id='email']");

    private final By haslo = By.xpath("//input[@id='password']");

    private final By entranceZalogujSie = By.xpath("//button[@id='log']");

    private final By wyszukiwanie = By.xpath("//button[@title='Wyszukiwanie']");

    private final By wyszukiwanieObjektow =
            By.xpath("//button[@class='btn collapse-btn w-100 btn-success collapsed']");

    private final By lokalizowanieObjektow = By.xpath("//div[@id='collapse-features-form']/button");

    private final By numerDzialki = By.xpath("//input[@id='teryt-parcel-number-input']");

    private final By szukaj = By.xpath("//button[@class='btn col-md-12 btn-primary btn-sm']");

    private final By identyfikatorDzialki = By.xpath("//input[@id='parcel-code-input']");

    private final By getnumerDzialki = By.xpath("//input[@id='teryt-parcel-number-input']");

    private final By wojewodztwoList = By.xpath("//select[@id='teryt-province-select']");

    private final By wojewodztwoLubelskie = By.xpath("//select[@id='teryt-province-select']/option[4]");

    private final By powiatList = By.xpath("//select[@id='teryt-district-select']");

    private final By powiatOpolski = By.xpath("//select[@id='teryt-district-select']/option[16]");

    private final By gminaList = By.xpath("//select[@id='teryt-commune-select']");

    private final By gminaJozefowNadWisla = By.xpath("//select[@id='teryt-commune-select']/option[3]");

    private final By obrebList = By.xpath("//select[@id='teryt-perimeter-select']");

    private final By obrebJozefowNadWisla = By.xpath("//select[@id='teryt-perimeter-select']/option[36]");


    public UslugaULDKPage clickObrebList (){
        click(obrebList,10);
        return this;
    }

    public UslugaULDKPage clickObrebJozefowNadWisla(){
        click(obrebJozefowNadWisla,10);
        return this;
    }

    public UslugaULDKPage clickGminaJozefowNadWisla (){
        click(gminaJozefowNadWisla,10);
        return this;
    }
    public UslugaULDKPage clickGminaList (){
        click(gminaList,10);
        return this;
    }
    public UslugaULDKPage clickPowiatList (){
        click(powiatList,10);
        return this;
    }

    public UslugaULDKPage clickPowiatOpolski (){
        click(powiatOpolski,10);
        return this;
    }

    public UslugaULDKPage clickWojewodztwoList (){
     click(wojewodztwoList,10);
     return this;
    }
    public UslugaULDKPage clickLubelskie (){
        click(wojewodztwoLubelskie,10);
        return this;
    }


    public UslugaULDKPage clickZaloguj() {
        click(zaloguj, 20);
        return this;
    }

    public UslugaULDKPage clickZalogujSie() {
        click(zalogujSie, 20);
        return this;
    }

    public UslugaULDKPage inputLogin(String username){
        this.username = username;
        send(login,username, 10);
        return this;
    }

    public UslugaULDKPage inputPassword(String password){
        this.password = password;
        send(haslo,password, 10);
        return this;
    }

    public UslugaULDKPage clickEntrance(){
        clickEnter(entranceZalogujSie,5);
        return this;
    }

    public UslugaULDKPage clickWyszukiwanie(){
        click(wyszukiwanie,5);
        return this;
    }

    public UslugaULDKPage clickWyszukiwanieObiektow(){
        click(wyszukiwanieObjektow,10);
        return this;

    }

    public UslugaULDKPage clickLokalizowanieObiektow(){
        click(lokalizowanieObjektow,10);
        return this;
    }
    public UslugaULDKPage expectation() throws InterruptedException {
        Thread.sleep(3000);
        return this;
    }
    public UslugaULDKPage inputNumerDzialki(String numerLubIdentyfikatorDzialki){
        this.numerLubIdentyfikatorDzialki = numerLubIdentyfikatorDzialki;
        send(numerDzialki,numerLubIdentyfikatorDzialki,15);
        return this;
    }


    public UslugaULDKPage clickSzukaj(){
     click(szukaj,5);
     return this;
    }

    public String getIdentyfikatorDzialki()  {

        return getTextFromElement(identyfikatorDzialki,10);


    }




}


