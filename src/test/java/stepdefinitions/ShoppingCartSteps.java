package stepdefinitions;

import driver.DriverManager;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;
import pages.CheckoutPage;
import pages.HeaderPage;

public class ShoppingCartSteps {

    CheckoutPage checkoutPage =  new CheckoutPage();
    HeaderPage headerPage =  new HeaderPage();

    @When("User clicks shopping cart button")
    public void userClicksShoppingCartButton() {

        headerPage.clickShoppingCartButton();

    }

    @Then("User should see checkout button")
    public void userShouldSeeCheckoutButton() {

        Assert.assertEquals(checkoutPage.getCheckoutButtonText(), "Checkout");
    }
}
