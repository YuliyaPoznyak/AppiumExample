package pages;

import elements.Button;
import org.openqa.selenium.By;

public class CurrencyRatesMenuScreen extends BaseScreen {
    private Button nationalBankRatesBtn = new Button(By.id("com.softteco.bsbank:id/currencies_screen_NBRB"), "National bank rates");

    public void clickNationalBankRates() {
        nationalBankRatesBtn.WaitForElementIsClickable();
        nationalBankRatesBtn.click();
    }
}
