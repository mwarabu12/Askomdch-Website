package contactus;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ContactUsTests extends BaseTests {

    @Test
    public void testContactUs() {
        var contactUsPage = homePage.clickContactUsLink();
    }
}


