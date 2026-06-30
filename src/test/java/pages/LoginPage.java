package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "input-email")
    WebElement emailField;

    @FindBy(id = "input-password")
    WebElement passwordField;

    @FindBy(css = "input[value='Login']")
    WebElement loginButton;

    public void loginInformation(String email, String password){
        type(emailField, email);
        type(passwordField, password);
    }
    public void clickLoginButton(){
        click(loginButton);
    }
}
