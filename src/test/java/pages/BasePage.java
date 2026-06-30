package pages;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigurationReader;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriverWait wait;

    public BasePage() {

        PageFactory.initElements(DriverManager.getDriver(), this);

        wait = new WebDriverWait(DriverManager.getDriver(),
            Duration.ofSeconds(Integer.parseInt(ConfigurationReader.getProperty("timeout"))));
    }

    protected void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected void type(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    protected boolean isDisplayed(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }
}
