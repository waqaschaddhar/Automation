package test;

import amazon.Homepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends Homepage {

    // BeforeMethod
    // Test Method
    // AfterMethod

    // Test case method
    @Test
    public void testSearchBoxCheck() throws InterruptedException {
        searchBoxCheck();
        //Thread.sleep(8000);
        // Verify Hand sanitizer is displayed properly
        String actualText = driver.findElement(By.xpath(handSanitizerActualText)).getText();
        Assert.assertEquals(actualText, expectedText);
//        driver.findElement(By.id("kjdkfjdlkfdds"));
//        driver.findElement(By.name("kjdkfjdlkfdds"));
//        driver.findElement(By.className("kjdkfjdlkfdds"));
//        driver.findElement(By.tagName("kjdkfjdlkfdds"));
//        driver.findElement(By.xpath("kjdkfjdlkfdds"));
//        driver.findElement(By.cssSelector("kjdkfjdlkfdds"));
//        driver.findElement(By.linkText("kjdkfjdlkfdds"));
//        driver.findElement(By.partialLinkText("kjdkfjdlkfdds"));

    }

    @Test
    public void testBestSellers() throws InterruptedException {
        bestSellersTagCheck();
        String actualText = driver.findElement(By.xpath(bestSellersElement)).getText();
        Assert.assertEquals(actualText, bestSellersExpectedText);
    }


    @Test
    public void testLanguageSelector(){
        languageSelector();
        boolean actual = driver.findElement(By.xpath(languageSelectorElement)).isSelected();
        Assert.assertEquals(actual, expectedLangaugeSelector);
    }

    @Test
    public void testSpanishLanguageSelector(){
        spanishLanguageSelector();
        driver.findElement(By.xpath(spanishSelectorElement)).click();
        driver.findElement(By.xpath(spanishSelectorElement)).isSelected();
        boolean actual = driver.findElement(By.xpath(spanishSelectorElement)).isSelected();
        Assert.assertEquals(actual,expectedSpanishSelector);
    }

    @Test
    public void testTryPrime(){
        tryPrime();
        String actualText = driver.findElement(By.xpath(freeDeliverElement)).getText();
        Assert.assertEquals(actualText, expectedFreeDeliveryText);

    }

    @Test
    public void testSelectYourAddress() throws InterruptedException {
        selectYourAddress();

        boolean actualSelectAddress = driver.findElement(By.xpath(selectAddressElement)).isSelected();
        Assert.assertEquals(actualSelectAddress, addressIsClicked);
    }

    @Test
    public void testZipSearch(){
         boolean actualResult = driver.findElement(By.xpath(applyButtonElement)).isSelected();
         Assert.assertEquals(actualResult,applyIsClicked);
    }

    @Test
    public void testSelectCountry(){

        selectCountry();
        Boolean countrySelect = driver.findElement(By.cssSelector(country)).isSelected();
        Assert.assertEquals(countrySelect,countrySelected);

    }

    @Test
    public void testCustomerServiceTag(){
        customerServiceTag();
        String actualText = driver.findElement(By.xpath(yourOrdersElement)).getText();
        Assert.assertEquals(actualText,expectedYourOrdersText);
    }

    @Test
    public void testTodaysDealTag(){
        todaysDealTag();
        String actualText = driver.findElement(By.xpath(exploreDealElement)).getText();
        Assert.assertEquals(actualText,expectedExploreDealText);
    }

    @Test
    public void testNewRealeasesTag(){
        newRealeasesTag();
        String actualText = driver.findElement(By.xpath(videoGamesElement)).getText();
        Assert.assertEquals(actualText,expectedVideoGamesText);
    }

    @Test
    public void testfindAGiftTag(){
        findAGiftTag();
        String actualText = driver.findElement(By.xpath(giftsForEveryoneElement)).getText();
        Assert.assertEquals(actualText,giftsExpectedText);
    }


    @Test
    public void testwholeFoodsTag(){
        wholeFoodsTag();
        String actualText = driver.findElement(By.xpath(wholeFoodsMarketElement)).getText();
        Assert.assertEquals(actualText,wholeFoodsExpectedText);
    }

    @Test
    public void testGiftCardsTag(){
        giftCardsTag();
        String actualText = driver.findElement(By.xpath(showResultsElement)).getText();
        Assert.assertEquals(actualText,showResultExpectedText);
    }

    @Test
    public void testReturnsTag(){
        returnsTag();
        String actualText = driver.findElement(By.xpath(signInElement)).getText();
        Assert.assertEquals(actualText,signInExpectedText);
    }

}
