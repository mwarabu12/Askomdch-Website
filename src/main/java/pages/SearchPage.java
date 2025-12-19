package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By productTitles = By.cssSelector(".woocommerce-loop-product__title");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isProductDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitles)).isDisplayed();
    }

    public String getFirstProductTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitles)).getText();
    }
}
