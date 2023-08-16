import org.testng.annotations.Test;
import pageobject.SearchPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SearchTest extends BaseTest {

    SearchPage search = new SearchPage();


    @Test(groups = {"Regression"})
    void shouldBeVisibleResultSearch() {

        search.fillText("Ubisoft");
        search.clickEnter();

        assertThat(search.getTitle()).isEqualTo("Ubisoft");

    }

}
