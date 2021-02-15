package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By staticAlert = By.id("flash");
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlerttext() {
        return driver.findElement(staticAlert).getText();
    }
}
