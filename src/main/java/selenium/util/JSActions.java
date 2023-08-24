package selenium.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


import static selenium.config.WebDriverInit.getDriver;

public class JSActions {

    public static void jsClick(By element){
     JavascriptExecutor js = (JavascriptExecutor) getDriver();
     js.executeScript("arguments[0].click()",element);
    }
}
