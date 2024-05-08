package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addMonitorItem {
    @And("selects the first item and add the item to the cart")
    public void selectsTheFirstItemAndAddTheItemToTheCart() {
    }

    @Given("user is on the Amazon home Page")
    public void userIsOnTheAmazonHomePage() {
    }

    @When("the user searches for the monitor item")
    public void theUserSearchesForTheMonitorItem() {
    }

    @Then("the user verifies that the item price is identical to the product page")
    public void theUserVerifiesThatTheItemPriceIsIdenticalToTheProductPage() {
    }

    @And("also the the sub total is identical to the item price in the product page")
    public void alsoTheTheSubTotalIsIdenticalToTheItemPriceInTheProductPage() {
    }
}
