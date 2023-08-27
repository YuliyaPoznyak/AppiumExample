package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WDriver;

import java.time.Duration;

public abstract class BaseElement {
    private WebDriver driver = WDriver.getDriverInstance();

    private By locator;
    private String name;

    public BaseElement(By locator, String name)
    {
        //driver = WDriver.getDriverInstance();
        this.locator = locator;
        this.name = name;
    }

    public boolean IsDisplayed(){
        return findElement().isDisplayed();
    }

    public void click()
    {
        findElement().click();
    }

    public String getAttribute(String name)
    {
        return findElement().getAttribute(name);
    }
    public String getElementText()
    {
        return findElement().getText();
    }

    public void WaitForOpen()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public void WaitForElementIsVisible()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void WaitForElementIsClickable()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void WaitForElementIsSelected()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public WebElement findElement()
    {
        return driver.findElement(locator);
    }
}
