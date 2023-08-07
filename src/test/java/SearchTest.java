import org.testng.annotations.Test;
import pageobject.SearchPage;

import static org.testng.AssertJUnit.assertEquals;

public class SearchTest extends BaseTest {

    SearchPage search = new SearchPage();

    @Test
    void shouldBeVisibleResultSearch() {

        search.fillText("Ubisoft");
        search.clickEnter();

        assertEquals("Ubisoft", search.getTitle());

    }

}
