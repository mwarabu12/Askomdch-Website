package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HoverPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    private By cartIcon = By.className("count");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public void hoverOverCartIcon() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartIcon));
        actions.moveToElement(driver.findElement(cartIcon)).perform();
    }
}
