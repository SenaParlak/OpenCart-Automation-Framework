package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class RegisterPage extends BasePage{

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement confirmPasswordInput;

    @FindBy(css = "input[name='agree']")
    private WebElement agreeButton;

    @FindBy(css = "input[value='Continue']")
    private WebElement continueButton;

    public void registerInfo(Map<String, String> userInfo) {
        type(firstNameInput, userInfo.get("firstName"));
        type(lastNameInput, userInfo.get("lastName"));
        type(emailInput, userInfo.get("email"));
        type(telephoneInput, userInfo.get("telephone"));
        type(passwordInput, userInfo.get("password"));
        type(confirmPasswordInput, userInfo.get("passwordConfirm"));

    }
    public void submitRegistration(){
        click(agreeButton);
        click(continueButton);
    }

}
