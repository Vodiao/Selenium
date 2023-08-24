package selenide;

import org.testng.annotations.Test;
import selinede.po.SearchPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchTest {

    @Test
    public void shouldBeVisibleArticleOdessa(){
        open("https://uk.wikipedia.org/");
        getWebDriver().manage().window().maximize();

        new SearchPage()
                .fillSearch("Odessa")
                .clickEnter()
                .clickFirstArticle();

        assertThat(new SearchPage().getHeaderArticle().shouldBe(visible).getText())
                .as("The header of Odessa article was not found")
                .isEqualTo("ODESSA");
    }
}
