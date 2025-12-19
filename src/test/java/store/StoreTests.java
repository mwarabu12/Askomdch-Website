package store;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoverPage;
import pages.StorePage;

import static org.testng.Assert.assertTrue;

public class StoreTests extends BaseTests {

    /*===================HERE, I'M GOING TO TEST SEARCH, ADD TO CART, AND HOVER OVER CART ICON===================*/

    @Test
    public void testSearchHoverAndAddToCart() {

        driver.get("https://askomdch.com/store");

        StorePage storePage = new StorePage(driver);

        storePage.searchForProduct("Bracelet");
        assertTrue(storePage.isAnyProductDisplayed(),"No products displayed after search");

        //storePage.hoverOverFirstProduct();

        storePage.clickAddToCart();
        assertTrue(storePage.isAddToCartMessageDisplayed(),"Product was not added to cart");

        HoverPage hoverPage = new HoverPage(driver);
        hoverPage.hoverOverCartIcon();

    }
}



