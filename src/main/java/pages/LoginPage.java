package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By loginUsername = By.id("username");
    private By loginPassword = By.id("password");
    private By loginButton = By.name("login"); // FIXED

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLoginUsername(String username) {
        driver.findElement(loginUsername).sendKeys(username);
    }

    public void setLoginPassword(String password) {
        driver.findElement(loginPassword).sendKeys(password);
    }

    public DashboardPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }
}
