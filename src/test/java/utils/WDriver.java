package utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.example.utils.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class WDriver {
    private static WDriver instanceOfSingletonBrowserClass=null;

    private static DesiredCapabilities capabilities;
    private static AppiumDriver driver;

    private WDriver() throws MalformedURLException {
    }

    public static AppiumDriver getDriverInstance() {
        if(instanceOfSingletonBrowserClass==null){
                capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", Configuration.getConfigData().getCapabilities().getPlatformName());
                capabilities.setCapability("deviceName", Configuration.getConfigData().getCapabilities().getDeviceName());
                capabilities.setCapability("platformVersion", Configuration.getConfigData().getCapabilities().getPlatformVersion());
                capabilities.setCapability("automationName", Configuration.getConfigData().getCapabilities().getAutomationName());
                capabilities.setCapability("app", Configuration.getConfigData().getCapabilities().getApp());
            try {
                driver = new AndroidDriver(new URL(Configuration.getConfigData().getCapabilities().getDriverUrl()), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            }
        return driver;
        }



}
