package selenium.pageobject;

import selenium.base.BaseMethod;
import org.openqa.selenium.By;

public class InnerFramePage extends BaseMethod {


    private final By textFromInnerFrame = By.xpath("/html/body/p");





    public String getTextFromInnerFrame(){
        return getTextFromElement(textFromInnerFrame,10);
    }





}
