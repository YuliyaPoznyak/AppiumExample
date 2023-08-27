package pages;

import elements.Button;
import elements.Label;
import elements.TextBox;
import org.openqa.selenium.By;

public class CalculatorScreen {
    private TextBox amountTxb = new TextBox(By.id("com.softteco.bsbank:id/amount_text"), "Amount calculator textbox");
    private Label resultLbl = new Label(By.id("com.softteco.bsbank:id/sum_text"), "Currency calculator result");

    public void typeSum(double textToType) {
        amountTxb.WaitForElementIsVisible();
        amountTxb.typeText(String.valueOf(textToType));
    }
    public double getSumResult() {
        return Double.parseDouble(resultLbl.getElementText());
    }
}
