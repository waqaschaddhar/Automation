package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TDHomepage {
    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib/browserDriver/chromedriver.exe";
    public String url = "https://www.td.com/us/en/personal-banking/";


    @BeforeMethod
    public void setUp() {
        System.out.println("Welcome to TD Bank Automation");
        System.setProperty(chromeDriver, chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    /*
    Personal Banking Element
     */
    public String personalElement = "/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[1]/a";
    public String personalBankingElement = "//*[@id=\"main\"]/section[2]/div/div/h1";
    public String personalExpectedText = "Welcome to TD Bank Personal Banking";

    public void personalBankingTag() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(personalBankingElement)).click();

    }

    /*
   Small Business Element
     */
    public String smallBusinessElement = "/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[2]/a";
    public String smallBusinessBankingElement = "//*[@id=\"main\"]/section[2]/div/div/h1";
    public String smallBusinessExpectedText = "Small Business Banking";

    public void smallBusinessTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(smallBusinessElement)).click();

    }

    /*
        Commercial Element
     */
    public String commercialElement = "/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[3]/a";
    public String commercialBankingElement = "//*[@id=\"main\"]/section[2]/div/div/h1";
    public String commercialExpectedText = "TD Commercial Banking";

    public void commercialTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(commercialElement)).click();

    }

    /*
        Commercial Element
     */
    public String investingElement = " /html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[4]/a";
    public String inverstingAndWealthElement = "//*[@id=\"main\"]/section[2]/div/div/h1";
    public String investingExpectedText = "Investing & Wealth";

    public void investingTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(investingElement)).click();

    }



    /*
    Products drop down menu
    */
    public String productsMenuElement = "/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]";
    public String checkingElement = "/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[1]/a";
    public String checkingAccountsElement = "//*[@id=\"main\"]/section[1]/div/div/h1";
    public String chAccountsExpectedText = "TD Bank Checking Accounts";

    public void productsMenuTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(productsMenuElement)).click();
        driver.findElement(By.xpath(checkingElement)).click();

    }
    /*
    Check find us label functionality
     */
    public String findUsLabelElement = "/html/body/div[2]/div[2]/header[1]/div[3]/div/div[2]/div/ul/li[1]/a/span[2]";
    public String findAStoreElement = "//*[@id=\"js-locator\"]/div[2]/h1";
    public String expectedText = "Find a Store or an ATM Near You";

    public void findUsLabel(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(findUsLabelElement)).click();
    }

    /*
    searchbox element
     */
    public String searchBox  = "//*[@id=\"q\"]";
    public String searchCity = "Lawrence, NY, USA";
    public String findUsSearchButton ="//*[@id=\"search-form\"]/div[1]/button/img";
    public String branchLocationElement = "//*[@id=\"js-yl-USBRANCH40419\"]/article/h3/span/span[2]";
    public String expectedBranchText = "Lawrence";

    public void findUsSearchBox() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        findUsLabel();
        driver.findElement(By.xpath(searchBox)).sendKeys(searchCity);
        driver.findElement(By.xpath(findUsSearchButton)).click();
        Thread.sleep(3000);
    }

    /*
    Help element
     */
    public String helpElement = "/html/body/div[2]/div[2]/header[1]/div[3]/div/div[2]/div/ul/li[2]/a/span[2]";
    public String quickHelpElement = "//*[@id=\"main\"]/help-centre/h1";
    public String quickHelpExpectedText = "Quick help with your everyday activities";

    public void quickHelpTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(helpElement)).click();

    }








}// ends TDHomepage
