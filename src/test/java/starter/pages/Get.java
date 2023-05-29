package starter.pages;

import net.thucydides.core.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    public String endpoint = "https://fakestoreapi.com/products";

    @Step("I set GET api endpoints")
    public String setApiEndpoint() {
        return endpoint;
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
