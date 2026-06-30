package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{

    @FindBy(linkText = "My Account")
    private WebElement myAccount;

    @FindBy(linkText = "Register")
    private WebElement registerButton;

    @FindBy(linkText = "Login")
    private WebElement loginButton;

    @FindBy(linkText = "Logout")
    private WebElement logoutButton;

    public void goToRegisterPage(){
        click(myAccount);
        click(registerButton);
    }
    public void goToLoginPage(){
        click(myAccount);
        click(loginButton);
    }
    public void logoutButton(){
        click(logoutButton);
    }

    public String loginButtonIsPresent(){
        return getText(loginButton);
    }
}
