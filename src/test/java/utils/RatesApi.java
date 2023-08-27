package utils;
import com.google.gson.Gson;
import org.example.models.HttpEndpoint;
import org.example.models.RateModel;
import org.example.utils.ApiUtils;
import org.testng.log4testng.Logger;


public class RatesApi {
    static Logger log = Logger.getLogger(RatesApi.class);
    public static RateModel getCurrentRates() throws Exception {
        String requestBody = String.format("{\"type\": \"NATIONAL_BANK_BELARUS\", \"period\": %d}", System.currentTimeMillis());
        log.info(String.format("The request body to get current rates is: %s", requestBody));
        var response = ApiUtils.postRequest(HttpEndpoint.NATIONAL_BANK_RATES.getEndpoint(), requestBody);
        log.info(String.format("The response after getting current rates is: %s", response));
        return new Gson().fromJson(response, RateModel.class);
    }

}
