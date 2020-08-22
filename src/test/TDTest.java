package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import amazon.TDHomepage;

public class TDTest extends TDHomepage {

    @Test
    public void testPersonalBankingTag(){
        personalBankingTag();
        String actual = driver.findElement(By.xpath(personalBankingElement)).getText();
        Assert.assertEquals(actual, personalExpectedText);
    }

    @Test
    public void testSmallBusinessTag(){
        smallBusinessTag();
        String actual = driver.findElement(By.xpath(smallBusinessBankingElement)).getText();
        Assert.assertEquals(actual, smallBusinessExpectedText);
    }
    @Test
    public void testCommercialTag(){
        commercialTag();
        String actual = driver.findElement(By.xpath(commercialBankingElement)).getText();
        Assert.assertEquals(actual, commercialExpectedText);
    }

    @Test
    public void testInvestingTag(){
        investingTag();
        String actual = driver.findElement(By.xpath(inverstingAndWealthElement)).getText();
        Assert.assertEquals(actual, investingExpectedText);
    }



    @Test
    public void testProductsMenuTag(){
        productsMenuTag();
        String actualText =  driver.findElement(By.xpath(checkingAccountsElement)).getText();
        Assert.assertEquals(actualText, chAccountsExpectedText);
    }
    @Test
    public void testFindUsLabel(){
        findUsLabel();
       String actualText =  driver.findElement(By.xpath(findAStoreElement)).getText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void testFindUsSearchBox() throws InterruptedException {
        findUsSearchBox();
        String actualText = driver.findElement(By.xpath(branchLocationElement)).getText();
        Assert.assertEquals(actualText, expectedBranchText);
    }

    @Test
    public void testQuickHelpTag() throws InterruptedException {
        quickHelpTag();
        String actualText = driver.findElement(By.xpath(quickHelpElement)).getText();
        Assert.assertEquals(actualText, quickHelpExpectedText);
    }

















}// ends TDTest

