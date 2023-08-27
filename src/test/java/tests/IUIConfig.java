package tests;

import io.appium.java_client.android.AndroidDriver;
import org.example.utils.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.WDriver;

import java.net.URL;

public abstract class IUIConfig {
    DesiredCapabilities capabilities;
    WebDriver driver;
    @BeforeSuite
    public void setUp() throws Exception
    {
        driver = WDriver.getDriverInstance();
    }

    @AfterSuite
    public void tearDown()
    {
        if(driver!=null) {
            driver.quit();
        }
    }
}
