package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HeaderPage;
import pages.SearchResultPage;

public class AddToCartSteps {

    HeaderPage headerPage = new HeaderPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @When("User searches and adds {string} to cart")
    public void userSearchesAndAddsToCart(String productName) {

        headerPage.searchProduct(productName);
        searchResultPage.addProductToCart(productName);

    }

    @Then("User should see product add successfully")
    public void userShouldSeeProductAddSuccessfully() {

        Assert.assertTrue(searchResultPage.getSuccessAlertText().contains("Success: You have added"));
    }
}
