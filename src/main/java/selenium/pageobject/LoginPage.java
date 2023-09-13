package selenium.pageobject;

import selenium.base.BaseMethod;
import org.openqa.selenium.By;

public class LoginPage extends BaseMethod {

    private String username;

    private String password;

    private final By singIn = By.xpath("//a[@accesskey='o']/span");
    private final By loginField = By.xpath("//input[@id='wpName1']");
    private final By passwordField = By.xpath("//input[@id='wpPassword1']");



    private final By entrance = By.xpath("//button[@id='wpLoginAttempt']");

    private final By nickname = By.xpath("//a[@accesskey='.']/span");

    private final By messageError = By.xpath("//div[@class='cdx-message__content']");




    public LoginPage clickSingIn(){
        click(singIn,5);
        return this;
    }

    public LoginPage inputLogin(String username){
        this.username = username;
        send(loginField,username, 10);
        return this;
    }

    public LoginPage inputPassword(String password){
        this.password = password;
        send(passwordField,password, 10);
        return this;
    }

    public LoginPage clickEntrance(){
        click(entrance,10);
        return this;
    }

    public String getTitle(){
        return  getTextFromElement(nickname,10);
    }

    public String getNotValidPass (){
        return getTextFromElement(messageError,10);
    }

    public String getNotValidUser (){
        return getTextFromElement(messageError,10);
    }




}