package pages;

import elements.Button;
import elements.Label;
import elements.TextBox;
import org.openqa.selenium.By;

public class NationalBankRatesScreen extends BaseScreen {
    private Label chfNBRateLbl = new Label(By.xpath("(//*[@resource-id='com.softteco.bsbank:id/buy_text'])[14]"), "CHF NB RB rate");
    private Button calculatorBtn = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Calculator\"]"), "CHF NB RB rate");


    public String getCHFrate() {
        return chfNBRateLbl.getElementText();
    }
    public void openCalculator() {
        calculatorBtn.WaitForElementIsClickable();
        calculatorBtn.click();
    }

}
