package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{

    @FindBy(linkText = "My Account")
    private WebElement myAccount;

    @FindBy(linkText = "Register")
    private WebElement registerButton;

    public void goToRegisterPage(){
        click(myAccount);
        click(registerButton);
    }
}
