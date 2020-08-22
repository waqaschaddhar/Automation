package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class UnitedHealthHomepage {
    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib/browserDriver/chromedriver.exe";
    public String url = "https://www.uhc.com/";


    @BeforeMethod
    public void setUp() {
        System.out.println("Welcome to United Health Care Automation");
        System.setProperty(chromeDriver, chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    /*
    Find a Doctor label
     */
    public String findDoctorButton = "/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[2]/div[2]/a";
    public String findDoctorElement = "//*[@id=\"main-content\"]/div[1]/div/div[1]/h1";
    public String findDoctorText = "Find a doctor";

    public void findADoctor(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(findDoctorButton)).click();
    }

    /*
        Medicare label
     */
    public String medicareElement = "/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[2]/div[2]/a";
    public String medicareInsuranceElement = "//*[@id=\"main-content\"]/div[1]/div/div[1]/h1";
    public String medicareExpectedText = "Medicare insurance plans";

    public void medicareTag(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(medicareElement)).click();
    }











}
