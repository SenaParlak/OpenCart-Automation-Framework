package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(xpath = "//p[contains(text(),'Congratulations!')]")
    private WebElement successMessage;

    @FindBy(xpath = "//h2[text()='My Account']")
    private WebElement myAccountTitle;

    public String getSuccessMessage(){
       return getText(successMessage);
    }

    public String getMyAccountTitle(){
        return getText(myAccountTitle);
    }
}
