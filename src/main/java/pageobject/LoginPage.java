package pageobject;

import base.BaseMethod;
import org.openqa.selenium.By;

public class LoginPage extends BaseMethod {

    private final By singIn = By.xpath("//a[@accesskey='o']/span");
    private final By login = By.xpath("//input[@id='wpName1']");
    private final By password = By.xpath("//input[@id='wpPassword1']");

    private final By entrance = By.xpath("//button[@id='wpLoginAttempt']");

    private final By nickname = By.xpath("//a[@accesskey='.']/span");


    public void clickSingIn(){
        click(singIn,10);
    }

    public void inputLogin(String text){
     input(login,text, 10);
    }

    public void inputPassword(String text){
        input(password,text, 10);
    }

    public void clickEntrance(){
        click(entrance,10);
    }

    public String getTitle(){
        return  getTextFromElement(nickname,10);
    }
}