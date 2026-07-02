package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "input-email")
    private WebElement emailField;

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(css = "input[value='Login']")
   private WebElement loginButton;

    @FindBy(css = "div[class='alert alert-danger alert-dismissible']")
    private WebElement failLoginMessage;


    public void loginInformation(String email, String password){
        type(emailField, email);
        type(passwordField, password);
    }
    public void clickLoginButton(){
        click(loginButton);
    }
    public String getFailLoginMessage(){
        return getText(failLoginMessage);
    }
}
