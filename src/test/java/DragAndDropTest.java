
import org.testng.annotations.Test;
import pageobject.DragAndDropPage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class DragAndDropTest extends BaseTest {

    @Test
    public void dragAndDropsElement (){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");

        new DragAndDropPage()
                .dragAndDropElement();

        assertThat(new DragAndDropPage().getDropped())
                .as("The element not dropped")
                .isEqualTo("Dropped!");

    }
}
