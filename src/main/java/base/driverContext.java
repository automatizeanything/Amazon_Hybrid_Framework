package base;

import org.openqa.selenium.WebDriver;

public class driverContext {
    public static WebDriver Driver;
    //setting the driver value to the static instance
    public static void setDriver(WebDriver driver) {
    Driver = driver;
    }



}
