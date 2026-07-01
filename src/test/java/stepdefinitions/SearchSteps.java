package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HeaderPage;
import pages.SearchResultPage;

import java.util.List;

public class SearchSteps {

    HeaderPage headerPage = new HeaderPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @When("User searches products")
    public void userSearchesProducts(DataTable dataTable) {
        List<String> products = dataTable.asList(String.class);

        for(String product : products){
            headerPage.searchProduct(product);
        }
    }

    @Then("User should see search page")
    public void userShouldSeeSearchPage() {

        Assert.assertEquals(searchResultPage.getSearchCriteriaTitle(), "Search Criteria");
    }
}
