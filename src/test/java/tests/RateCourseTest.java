package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.NavigationSteps;
import steps.RateAPISteps;
import steps.RateSteps;


public class RateCourseTest extends IUIConfig{

    @Parameters({"currencyCode"})
    @Test
    public void validNationalBankTest(String currencyCode) throws Exception {
        NavigationSteps.clickCurrencyRates();
        NavigationSteps.clickNationalBankRates();
        var actualUIrate = RateSteps.getCHFText();
        var expectedRate = RateAPISteps.getNationalBankRate(currencyCode);
        Assert.assertEquals(actualUIrate, expectedRate);
    }

}
