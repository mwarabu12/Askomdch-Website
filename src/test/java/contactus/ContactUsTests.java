package contactus;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTests extends BaseTests {

    @Test
    public void testContactUs() {
        var contactUsPage = homePage.clickContactUsLink();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://askomdch.com/contact-us/";
        Assert.assertEquals(actualUrl, expectedUrl, "User is not on the Contact Us page!");
    }

}


