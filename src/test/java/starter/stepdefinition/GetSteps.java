package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Get;

public class GetSteps {

    @Steps
    Get user;
    @Given("user has set Get endpoint")
    public void userHasSetGetEndpoint() {
        user.setApiEndpoint();
    }

    @When("user send Get user endpoint")
    public void userSendGetUserEndpoint() {
        user.sendGetHttpRequest();
    }

    @Then("user see status code {int}")
    public void userSeeStatusCode(int arg0) {
        user.validateHttpResponseCode200();

    }
}
