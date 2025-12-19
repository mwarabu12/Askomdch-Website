package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.StorePage;

import static org.testng.Assert.assertTrue;

public class SearchTestss extends BaseTests {

    @Test
    public void testSearch() {

        // Navigate to store page
        driver.get("https://askomdch.com/store");

        StorePage storePage = new StorePage(driver);

        SearchPage searchPage = storePage.searchForProduct("Blue");

        assertTrue(searchPage.isProductDisplayed(),"Search results are not displayed");
    }
}
