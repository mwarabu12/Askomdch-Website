package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;
    private By RegisterUserName = By.id("reg_username");
    private By RegisterEmail = By.id("reg_email");
    private By RegisterPassword = By.id("reg_password");
    private By RegisterButton = By.cssSelector("button.woocommerce-form-register__submit[name=\"register\"]");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setRegisterUserName(String username) {
        driver.findElement(RegisterUserName).sendKeys(username);
    }

    public void setRegisterEmail(String email) {
        driver.findElement(RegisterEmail).sendKeys(email);
    }

    public void setRegisterPassword(String password) {
        driver.findElement(RegisterPassword).sendKeys(password);
    }

    public DashboardPage clickRegisterButton() {
        driver.findElement(RegisterButton).click();
        return new DashboardPage(driver);
    }

}
