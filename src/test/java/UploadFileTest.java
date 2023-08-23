import org.testng.annotations.Test;
import pageobject.UploadFilePage;

public class UploadFileTest extends BaseTest{


    @Test
    public void uploadFileTest () {

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");

        new UploadFilePage()
                .uploadFile("C:\\Users\\Vadim\\OneDrive\\Рабочий стол\\AutomationJava 29.05.2023\\HomeWorkQA16\\AutomatedTesting.jpg");

    }
}
