package pages;

import elements.Button;
import org.openqa.selenium.By;

public class BasicMenuScreen extends BaseScreen {
    private Button currencyRateBtn = new Button(By.id("com.softteco.bsbank:id/main_screen_Exchange"), "Currency rates");

    public void clickCurrencyRates() {
        currencyRateBtn.WaitForElementIsClickable();
        currencyRateBtn.click();
    }
}
