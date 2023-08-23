package pageobject;

import base.BaseMethod;
import org.openqa.selenium.By;

public class DragAndDropPage extends BaseMethod {

    private final By drag = By.xpath("//div[@id='draggable']");

    private final By drop = By.xpath("//div[@id='draggable']/following-sibling::div");

    private final By resultDrop = By.xpath("//div[@id='draggable']/following-sibling::div/p");


    public DragAndDropPage dragAndDropElement(){
        dragAndDrop(drag,drop);
        return this;
    }

    public String getDropped (){
        return getTextFromElement(resultDrop,10);

    }
}
