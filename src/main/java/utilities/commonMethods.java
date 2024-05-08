package utilities;

import base.driverContext;
import org.testng.Assert;

public class commonMethods {

    public static void verifyPageTitle(String expectedTitle) {
        String actualTitle = driverContext.Driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match expected title");
    }
}
