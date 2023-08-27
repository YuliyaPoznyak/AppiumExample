package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.NavigationSteps;
import steps.RateAPISteps;
import steps.RateSteps;


public class CurrencyCalculatorTest extends IUIConfig{

    @Parameters({"currencyCode"})
    @Test
    public void validCalculatorDataTest(String currencyCode) throws Exception {
        NavigationSteps.clickCurrencyRates();
        NavigationSteps.clickNationalBankRates();

        RateSteps.openCurrencyCalculator();
        RateSteps.typeMoneySum(300.00);
        var actualSum = RateSteps.getCurrencyCalculatorResult();
        var expectedRate = RateAPISteps.getNationalBankRate(currencyCode);
        Assert.assertEquals(Math.round((actualSum/300)*1000),  Math.round(expectedRate*1000));
    }

}
