package selinede.po;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class ActionPage {

    private final SelenideElement doubleClickButton = $x("//button[@id='doubleClickBtn']");

    private final SelenideElement contextClickButton = $x("//button[@id='rightClickBtn']");


    public SelenideElement getDoubleClickText (){
        return $x("//p[@id='doubleClickMessage']");
    }

    public SelenideElement getContextClickButton (){
        return $x("//p[@id='rightClickMessage']");
    }

    public ActionPage clickDoubleClick (){
         doubleClickButton.shouldBe(visible,enabled).doubleClick();
        return page(ActionPage.class);
    }

    public ActionPage clickContextClick(){
        contextClickButton.shouldBe(visible,enabled).contextClick();
        return page(ActionPage.class);
    }
}
