package steps;

import org.testng.log4testng.Logger;
import utils.RatesApi;

public class RateAPISteps {
    private static Logger log = Logger.getLogger(RateAPISteps.class);

    public static double getNationalBankRate(String currencyCode) throws Exception {
        var currentRates = RatesApi.getCurrentRates();
        var necessaryCurrencyData = currentRates.getRates().stream().filter(rate -> rate.getBuyCurrencyName().equals(currencyCode)).findFirst().get();
        log.info(String.format("The National bank rate for %s currency is equal to %s", currencyCode, necessaryCurrencyData.getBuyAmount()));
        return necessaryCurrencyData.getBuyAmount();
    }
}
