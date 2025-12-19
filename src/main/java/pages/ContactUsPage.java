package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    WebDriver driver;
    private By contactUsLink = By.linkText("//*[@id=\"menu-item-1233\"]/a");

    public ContactUsPage (WebDriver driver){
        this.driver = driver;
    }
}
