package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(linkText = "Checkout")
    private WebElement checkoutButton;

    @FindBy(xpath = "//p[normalize-space()='Your shopping cart is empty!']")
    private WebElement emptyCartMessage;

    public String getCheckoutButtonText(){
        return checkoutButton.getText();
    }

    private WebElement getRemoveButton(String productName){
        return DriverManager.getDriver().findElement(
                By.xpath("//tr[.//a[normalize-space()='" + productName +
                        "']]//button[contains(@class,'btn-danger')]"));


    }

    public void removeProduct(String productName){

        click(getRemoveButton(productName));
    }

    public String setEmptyCartMessage(){
        return getText(emptyCartMessage);
    }
}
