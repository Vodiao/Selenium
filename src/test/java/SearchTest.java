import org.testng.annotations.Test;
import pageobject.SearchPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SearchTest extends BaseTest {

    SearchPage search = new SearchPage();


    @Test(groups = {"Regression"})
    void shouldBeVisibleResultSearch() {
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/");

        search.fillText("Ubisoft");
        search.clickEnter();

        assertThat(search.getTitle()).isEqualTo("Ubisoft");

    }

}
