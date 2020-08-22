package test;

import amazon.UnitedHealthHomepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitedHealthTest extends UnitedHealthHomepage {
@Test
    public void testFindADoctor(){
    findADoctor();
    String actualText = driver.findElement(By.xpath(findDoctorElement)).getText();
    Assert.assertEquals(actualText, findDoctorText);
}

    @Test
    public void testMedicateTag() {
        medicareTag();
        String actualText1 = driver.findElement(By.xpath(medicareInsuranceElement)).getText();
        Assert.assertEquals(actualText1, medicareExpectedText);
    }















}// united health test
