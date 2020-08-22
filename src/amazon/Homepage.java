package amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Homepage {


//  #Search box functionality test: Pass
//    Open Chrome browser: Pass
//    Enter amazon url in address bar and hit enter: Pass
//    Click on search box: Pass
//    Enter Hand sanitizer: Pass
//    Click on search button: pass
//    Verify Hand sanitizer is displayed properly: Pass
//    ExpectedResult: Hand sanitizer should display properly
//    ActualResult: Hand sanitizer display properly

    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib/browserDriver/chromedriver.exe";
    public String url = "https://www.amazon.com/";


@BeforeMethod
    public void setUp() {
        System.out.println("Welcome to Amazon Automation world");
        System.setProperty(chromeDriver, chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    /*
    Search Box Element
     */
    public String searchBox = "//*[@id=\"twotabsearchtextbox\"]";
    public String productSearch = "Hand sanitizer";
    public String searchButton = "//*[@id=\"nav-search\"]/form/div[2]/div/input";
    public String handSanitizerActualText = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div/div[1]/h5/span0";
    public String expectedText = "6-pack myDerm Hand Sanitizer with Aloe - 62% Alcohol kills 99.9% of germs";
    // Search Box action method
    public void searchBoxCheck() throws InterruptedException {
        setUp();
        //Click on search box and Enter Hand sanitizer
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        Thread.sleep(3000);
        //Click on search button
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(5000);
    }


    /*
    Best Sellers Element
     */
    public  String bestSellersExpectedText = "Best Sellers";
    public String  bestSellersElement = "//*[@id=\"nav-xshop\"]/a[1]";
    public void bestSellersTagCheck() throws InterruptedException {
        setUp();
        driver.findElement(By.xpath(bestSellersElement)).click();
        Thread.sleep(5000);
    }

    /*
    language selector element
     */
    public String languageSelectorElement = "//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]";
    public boolean expectedLangaugeSelector = true;
    public void languageSelector(){
       // setUp();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(languageSelectorElement)).click();

    }

    /*
    select spanish language
     */

    public String spanishSelectorElement = "//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i";
    public boolean expectedSpanishSelector = true;
    public void spanishLanguageSelector(){
       // setUp();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        languageSelector();
        driver.findElement(By.xpath(spanishSelectorElement)).click();
        driver.findElement(By.xpath(spanishSelectorElement)).isSelected();

    }

    /*
    Try Prime Elelment
     */
    public String tryPrimeElement = "//*[@id=\"nav-link-prime\"]/span";
    public String freeDeliverElement = "//*[@id=\"primeDetailPage\"]/div[4]/div[2]/div[1]/div[1]/div/div[2]/p[1]";
    public String expectedFreeDeliveryText = "Fast, FREE Delivery";

    public void tryPrime(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(tryPrimeElement)).click();
    }

    /*
    Select your address element
     */
    public String selectAddressElement = "//*[@id=\"glow-ingress-block\"]";
    public boolean addressIsClicked = true;
    public void selectYourAddress() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(selectAddressElement)).click();
        Thread.sleep(5000);

    }

    /*
     Zip Search Element
     */
    public String zipSearchBoxElement = "//*[@id=\"GLUXZipConfirmationSection\"]/div";
    public String applyButtonElement = "//*[@id=\"GLUXZipUpdate\"]/span/input";
    public String zip = "11096";
    public boolean applyIsClicked = true;

    public void zipSearch() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        selectYourAddress();
        driver.findElement(By.xpath(zipSearchBoxElement)).click();
        driver.findElement(By.xpath(zipSearchBoxElement)).sendKeys(zip);
        driver.findElement(By.xpath(applyButtonElement)).click();
    }
    /*
    Country select in address selection element
     */
    public String dropDownElement = "//*[@id=\"GLUXCountryListDropdown\"]";
    public String country = "//*[@id=\"GLUXCountryList_170\"]";
    public String expectedCountryText = "Pakistan";
    public Boolean countrySelected = true;
    public void selectCountry(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(selectAddressElement)).click();
        driver.findElement(By.xpath(dropDownElement)).click();
        driver.findElement(By.xpath(dropDownElement)).sendKeys(country);
    }

    /*
    Customer Service element
     */
    public String customerServiceElement  = "//*[@id=\"nav-xshop\"]/a[2]";
    public String yourOrdersElement = "/html/body/div[2]/div[4]/div[1]/div/div[1]/div[1]/a/div/div/div/div[2]/h3";
    public String expectedYourOrdersText = "Your Orders";

    public void customerServiceTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(customerServiceElement)).click();
    }

    /*
    Todays Deals element
     */
    public String todaysDealsElement  = "//*[@id=\"nav-xshop\"]/a[3]";
    public String exploreDealElement = "//*[@id=\"gbox-item-0.0.0\"]/div/div/div[1]/h1/div[1]";
    public String expectedExploreDealText = "Today's Deals";

    public void todaysDealTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(todaysDealsElement)).click();
    }

    /*
    Todays Deals element
     */
    public String newReleasesElement  = "//*[@id=\"nav-xshop\"]/a[4]";
    public String videoGamesElement = "//*[@id=\"zg_left_col1\"]/div[1]/h3";
    public String expectedVideoGamesText = "Video Games";

    public void newRealeasesTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(newReleasesElement)).click();
    }

    /*
   Find a gift element
    */
    public String findAGiftElement  = "//*[@id=\"nav-xshop\"]/a[5]";
    public String giftsForEveryoneElement = "//*[@id=\"notification-provider\"]/div/div/div[3]/h2";
    public String giftsExpectedText = "Gifts for Everyone";

    public void findAGiftTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(findAGiftElement)).click();
    }

    /*
   whole foods element
    */
    public String wholeFoodsElement  = "//*[@id=\"nav-xshop\"]/a[6]";
    public String wholeFoodsMarketElement = "//*[@id=\"nav-subnav\"]/a[1]/span[1]/img";
    public String wholeFoodsExpectedText = "Whole Foods";
//    public String produceElement = "//*[@id=\"Produce\"]/div[1]/div/h2/span";
//    public  String houseHoldElement = "//*[@id=\"Household\"]/div[1]/div/h2/span";
//    public String houseHoldExpectedText = "Household";
//    public String produceExpectedText = "Produce";

    public void wholeFoodsTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(wholeFoodsElement)).click();
    }

    /*
   Gift Cards element
    */
    public String giftCardsElement  = "//*[@id=\"nav-xshop\"]/a[7]";
    public String giftBirthdaysElement = "//*[@id=\"nav-subnav\"]/a[3]/span";
    public String giftCardBirthdaysExpectedText = "Birthdays";
    public String showResultsElement = "//*[@id=\"leftNav\"]/h3[1]";
    public String showResultExpectedText = "Show results for";

    public void giftCardsTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(giftCardsElement)).click();
        driver.findElement(By.xpath(giftBirthdaysElement)).click();
    }

    /*
   returns and orders element
    */
    public String returnsElement  = "//*[@id=\"nav-orders\"]";
    public String signInElement = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1";
    public String signInExpectedText = "Sign-In";

    public void returnsTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(returnsElement)).click();
    }




}
