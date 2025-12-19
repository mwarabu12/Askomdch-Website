package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StorePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    private By searchField = By.id("woocommerce-product-search-field-0");
    private By searchButton = By.cssSelector("button[type='submit']");
    private By firstProduct = By.cssSelector(".product");
    private By addToCartButton = By.cssSelector(".product .add_to_cart_button");
    private By successMessage = By.linkText("View cart");

    public StorePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public void enterSearchKeyword(String keyword) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField))
                .sendKeys(keyword);
    }

    public void clickSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }

    public void searchForProduct(String keyword) {
        enterSearchKeyword(keyword);
        clickSearchButton();
    }

    public void hoverOverFirstProduct() {
        actions.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(firstProduct))).perform();
    }

    public void clickAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }

    public boolean isAddToCartMessageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
    }

    public boolean isAnyProductDisplayed() {
        return !driver.findElements(firstProduct).isEmpty();
    }
}
