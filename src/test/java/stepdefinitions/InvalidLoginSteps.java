package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class InvalidLoginSteps {

    LoginPage loginPage = new LoginPage();

    @When("User logs in with invalid {string} and {string}")
    public void userLogsInWithInvalidAnd(String email, String password) {

        loginPage.loginInformation(email, password);
        loginPage.clickLoginButton();

    }

    @Then("User should see warning message")
    public void userShouldSeeWarningMessage() {

        Assert.assertTrue(loginPage.getFailLoginMessage().contains("Warning: No match for E-Mail Address and/or Password."));

    }


}
