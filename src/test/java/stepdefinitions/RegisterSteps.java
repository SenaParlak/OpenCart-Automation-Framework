package stepdefinitions;

import driver.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AccountPage;
import pages.HeaderPage;
import pages.RegisterPage;
import utilities.ConfigurationReader;

import java.util.Map;

public class RegisterSteps {

    HeaderPage headerPage = new HeaderPage();
    RegisterPage registerPage = new RegisterPage();
    AccountPage accountPage = new AccountPage();

    @Given("user is on Register page")
    public void userIsOnRegisterPage() {

        DriverManager.getDriver().get(ConfigurationReader.getProperty("url"));
        headerPage.goToRegisterPage();

    }

    @When("user enters registration information")
    public void userEntersRegistrationInformation(DataTable dataTable) {

        Map<String, String> userInfo = dataTable.asMap(String.class, String.class);
        registerPage.registerInfo(userInfo);

    }

    @And("user accepts the privacy policy and clicks countinue button")
    public void userAcceptsThePrivacyPolicyAndClicksCountinueButton() {

        registerPage.submitRegistration();

    }

    @Then("account should be created successfully")
    public void accountShouldBeCreatedSuccessfully() throws InterruptedException {

        Assert.assertEquals(accountPage.getSuccessMessage(), "Congratulations! Your new account has been successfully created!");
        Thread.sleep(2000);
    }
}
