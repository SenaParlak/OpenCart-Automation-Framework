package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CheckoutPage;

public class RemoveProductSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @When("User clicks {string} remote button")
    public void userClicksRemoteButton(String productName) {

        checkoutPage.removeProduct(productName);

    }

    @Then("User should see cart is empty")
    public void userShouldSeeCartIsEmpty() {

        Assert.assertTrue(checkoutPage.setEmptyCartMessage().contains("cart is empty"));

    }

}
