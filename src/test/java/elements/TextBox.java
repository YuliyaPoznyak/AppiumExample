package elements;

import org.openqa.selenium.By;

public class TextBox extends BaseElement {
    public TextBox(By locator, String name) { super (locator, name);  }
    public void typeText(String textToType)
    {
        findElement().sendKeys(textToType);
    }
}
