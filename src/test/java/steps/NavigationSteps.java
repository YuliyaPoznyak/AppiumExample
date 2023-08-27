package steps;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import pages.BasicMenuScreen;
import pages.CurrencyRatesMenuScreen;
import utils.WDriver;

public class NavigationSteps {
    private static BasicMenuScreen basicMenuScreen = new BasicMenuScreen();
    private static CurrencyRatesMenuScreen currencyRatesMenuScreen = new CurrencyRatesMenuScreen();
    private static AppiumDriver driver = WDriver.getDriverInstance();

    public static void clickCurrencyRates() {
        basicMenuScreen.clickCurrencyRates();
    }
    public static void clickNationalBankRates() {
        currencyRatesMenuScreen.clickNationalBankRates();
    }
    public static void scrollToElementByText(String text) {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(String.format("\"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"%s\"", text)));
    }

}
