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

    @FindBy(css = "#search input")
    private WebElement searchBox;

    @FindBy(css = "button[class='btn btn-default btn-lg']")
    private WebElement searchButton;

    @FindBy(linkText = "Shopping Cart")
    private WebElement shoppingCartButton;

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

    public void searchProduct(String searchText){
        type(searchBox, searchText);
        click(searchButton);
    }

    public void clickShoppingCartButton(){
        click(shoppingCartButton);
    }
}
