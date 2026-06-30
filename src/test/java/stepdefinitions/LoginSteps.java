package stepdefinitions;

import driver.DriverManager;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AccountPage;
import pages.HeaderPage;
import pages.LoginPage;
import utilities.ConfigurationReader;

public class LoginSteps {

    HeaderPage headerPage = new HeaderPage();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {

        DriverManager.getDriver().get(ConfigurationReader.getProperty("url"));
        headerPage.goToLoginPage();
    }

    @When("User logs in with valid {string} and {string}")
    public void userLogsInWithValidAnd(String email, String password) {

        loginPage.loginInformation(email, password);
        loginPage.clickLoginButton();

    }

    @Then("User should see account page")
    public void userShouldSeeAccountPage() {

        Assert.assertEquals(accountPage.getMyAccountTitle(), "My Account");

    }

}
