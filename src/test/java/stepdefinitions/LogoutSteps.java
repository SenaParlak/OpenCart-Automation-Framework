package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HeaderPage;
import pages.LoginPage;
import utilities.ConfigurationReader;

public class LogoutSteps {

    LoginPage loginPage = new LoginPage();
    HeaderPage headerPage = new HeaderPage();

    @When("User logs in with valid credentials")
    public void userLogsInWithValidCredentials() {

        loginPage.loginInformation(
                ConfigurationReader.getProperty("email"),
                ConfigurationReader.getProperty("password"));

        loginPage.clickLoginButton();
    }

    @And("User clicks logout button")
    public void userClicksLogoutButton() {

        headerPage.logoutButton();

    }

    @Then("User should see logout page")
    public void userShouldSeeLogoutPage() {

        Assert.assertEquals(headerPage.loginButtonIsPresent(), "Login");
    }

}
