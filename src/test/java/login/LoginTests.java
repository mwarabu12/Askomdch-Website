package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {

        LoginPage loginPage = homePage.clickAccountLoginLink();
        loginPage.setLoginUsername("johnmussa");
        loginPage.setLoginPassword("12345");
        loginPage.clickLoginButton();
    }
}
