package register;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegisterPage;
import pages.DashboardPage;

import static org.testng.Assert.*;

public class RegisterTests extends BaseTests {

    @Test
    public void testSuccessfulRegistration() {

        RegisterPage registerPage = homePage.clickAccountLink();

        registerPage.setRegisterUserName("jonathanmussa1121");
        registerPage.setRegisterEmail("fuxauddaloibi-2539@yopmail.com");
        registerPage.setRegisterPassword("12345");

        DashboardPage dashboardPage = registerPage.clickRegisterButton();

        assertTrue(dashboardPage.isLogoutLinkDisplayed(),"Logout link is not visible — user may not be logged in");

    }
}
