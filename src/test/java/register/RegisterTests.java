package register;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegisterPage;
import pages.DashboardPage;
import static org.testng.Assert.assertEquals;

public class RegisterTests extends BaseTests {

    @Test
    public void testSuccessfulRegistration() {
        RegisterPage registerPage = homePage.clickAccountLink();
        registerPage.setRegisterUserName("jonathanmussa");
        registerPage.setRegisterEmail("fuxauddaloibi-2589@yopmail.com");
        registerPage.setRegisterPassword("12345");
        DashboardPage dashboardPage = registerPage.clickRegisterButton();
    }
}
