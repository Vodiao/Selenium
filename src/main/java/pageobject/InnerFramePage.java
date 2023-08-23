package pageobject;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InnerFramePage extends BaseMethod {


    private final By textFromInnerFrame = By.xpath("/html/body/p");





    public String getTextFromInnerFrame(){
        return getTextFromElement(textFromInnerFrame,10);
    }





}
