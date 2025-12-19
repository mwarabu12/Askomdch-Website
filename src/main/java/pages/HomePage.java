package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinks(String linkName) {
        driver.findElement(By.linkText(linkName)).click();
    }

    public RegisterPage clickAccountLink() {
        clickLinks("Account");
        return new RegisterPage(driver);
    }

    public LoginPage clickAccountLoginLink() {
        clickLinks("Account");
        return new LoginPage(driver);
    }

    public StorePage clickStoreLink() {
        clickLinks("Store");
        return new StorePage(driver);
    }

    public ContactUsPage clickContactUsLink (){
        clickLinks("Contact Us");
        return new ContactUsPage (driver);
    }

}
