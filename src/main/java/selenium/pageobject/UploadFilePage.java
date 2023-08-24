package selenium.pageobject;

import selenium.base.BaseMethod;
import org.openqa.selenium.By;


public class UploadFilePage extends BaseMethod {

    private final By upload = By.xpath("//input[@id='uploadFile']");

    public UploadFilePage uploadFile (String path){
        send(upload,path,10);
        return this;
    }

}
