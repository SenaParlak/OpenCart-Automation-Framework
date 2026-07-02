package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    @FindBy(css = "label[class='control-label']")
    private WebElement searchCriteriaTitle;

    @FindBy(css = ".alert-success")
    private WebElement successAlert;

    public String getSearchCriteriaTitle(){
        return getText(searchCriteriaTitle);
    }
    private WebElement addProductButton(String productName){
        return DriverManager.getDriver().findElement(
        By.xpath("//h4/a[normalize-space()='" + productName +
                "']/ancestor::div[contains(@class,'product-thumb')]//button[contains(@onclick,'cart.add')]"));
    }
    public void addProductToCart(String productName){
        click(addProductButton(productName));
    }
    public String getSuccessAlertText(){
        return getText(successAlert);
    }
}

