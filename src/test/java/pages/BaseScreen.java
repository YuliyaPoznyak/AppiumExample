package pages;

import org.openqa.selenium.WebDriver;
import utils.WDriver;

public abstract class BaseScreen {
    private WebDriver driver = WDriver.getDriverInstance();
}
