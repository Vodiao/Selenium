package selinede.po;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    private final SelenideElement signInOnWikipedia = $x("//a[@accesskey='o']/span");

    private final SelenideElement loginFieldWikipedia = $x("//input[@id='wpName1']");

    private final SelenideElement passwordFieldWikipedia = $x("//input[@id='wpPassword1']");

    private final SelenideElement entrance = $x("//button[@id='wpLoginAttempt']");


    public SelenideElement getTextNickname (){
        return $x("//a[@accesskey='.']/span");
    }

    public LoginPage clickSignInOnWikipedia (){
        signInOnWikipedia.shouldBe(visible,enabled).click();
        return page(LoginPage.class);
    }

    public LoginPage inputLoginFieldWikipedia (String text){
        loginFieldWikipedia.shouldBe(visible).sendKeys(text);
        return page(LoginPage.class);
    }

    public LoginPage inputPasswordFieldWikipedia (String text){
        passwordFieldWikipedia.shouldBe(visible).sendKeys(text);
        return page(LoginPage.class);
    }

    public LoginPage clickEntrance (){
        entrance.shouldBe(visible).click();
        return page(LoginPage.class);
    }





}
