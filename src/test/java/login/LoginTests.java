package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        var dashboardPage = new DashboardPage(driver);

        LoginPage loginPage = homePage.clickAccountLoginLink();
        loginPage.setLoginUsername("johnmussa");
        loginPage.setLoginPassword("12345");
        loginPage.clickLoginButton();

        assertTrue(dashboardPage.isLogoutLinkDisplayed(),"Logout link is not visible — user may not be logged in");
    }
}
