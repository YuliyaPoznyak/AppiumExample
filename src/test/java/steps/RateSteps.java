package steps;

import org.testng.log4testng.Logger;
import pages.CalculatorScreen;
import pages.NationalBankRatesScreen;
import utils.RatesApi;

public class RateSteps {
    private static final String CHF = "Швейцарский франк ( CHF/BYN)";
    private static NationalBankRatesScreen nationalBankRates = new NationalBankRatesScreen();
    private static CalculatorScreen calculatorScreen = new CalculatorScreen();
    private static Logger log = Logger.getLogger(RateSteps.class);

    public static String getCHFText() {
        NavigationSteps.scrollToElementByText(CHF);
        return nationalBankRates.getCHFrate();
    }
    public static void openCurrencyCalculator() {
        nationalBankRates.openCalculator();
    }
    public static void typeMoneySum(double sum) {
        calculatorScreen.typeSum(sum);
    }
    public static double getCurrencyCalculatorResult() {
        return calculatorScreen.getSumResult();
    }
}

