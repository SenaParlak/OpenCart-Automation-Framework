package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(xpath = "//p[contains(text(),'Congratulations!')]")
    private WebElement successMessage;

    public String getSuccessMessage(){
       return getText(successMessage);
    }
}
