package selenide;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;
import selinede.po.ActionPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ActionsTest {

    @Test
    public void doubleClickAndContextClickCheck (){
        open("https://demoqa.com/buttons");
        getWebDriver().manage().window().maximize();

        new ActionPage()
                .clickDoubleClick()
                .clickContextClick();


        assertThat(new ActionPage().getDoubleClickText().shouldBe(visible).getText())
                .as("")
                .isEqualTo("You have done a double click");


        assertThat(new ActionPage().getContextClickButton().shouldBe(visible).getText())
                .as("")
                .isEqualTo("You have done a right click");
    }

    @Test
    public void getTextFromElements(){
        open("https://demoqa.com/automation-practice-form");
        getWebDriver().manage().window().maximize();

        ElementsCollection collection = $$x("//div[@class='custom-control custom-radio custom-control-inline']");

        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        System.out.println(collection.texts());

    }
}
