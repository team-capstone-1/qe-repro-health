package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.login.*;

public class LoginNegativeSteps {
    @Steps
    PostLoginInvalidEndpoint PostLoginInvalidEndpoint;
    @Steps
    PostLoginInvalidMethod PostLoginInvalidMethod;
    @Steps
    PostLoginInvalidPayload PostLoginInvalidPayload;


    @Given("I set POST Login invalid endpoint")
    public void setPostLoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.setPostLoginInvalidEndpoint();
    }
    @When("I send POST HTTP request Login invalid endpoint")
    public void sendPostHttpRequestLoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.sendPostHttpRequestLoginInvalidEndpoint();
    }
    @Then("I receive response code 404 for Login invalid endpoint")
    public void responseCode404LoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.responseCode404LoginInvalidEndpoint();
    }


    @Given("I set POST Login invalid method")
    public void setPostLoginInvalidMethod(){
        PostLoginInvalidMethod.setPostLoginInvalidMethod();
    }
    @When("I send POST HTTP request Login invalid method")
    public void sendPostHttpRequestLoginInvalidMethod(){
        PostLoginInvalidMethod.sendPostHttpRequestLoginInvalidMethod();
    }
    @Then("I receive response code 405 for Login invalid method")
    public void responseCode405LoginInvalidMethod(){
        PostLoginInvalidMethod.responseCode405LoginInvalidMethod();
    }


    @Given("I set POST Login invalid payload")
    public void setPostLoginInvalidPayload(){
        PostLoginInvalidPayload.setPostLoginInvalidPayload();
    }
    @When("I send POST HTTP request Login invalid payload")
    public void sendPostHttpRequestLoginInvalidPayload(){
        PostLoginInvalidPayload.sendPostHttpRequestLoginInvalidPayload();
    }
    @Then("I receive response code 400 for Login invalid payload")
    public void responseCode400LoginInvalidPayload(){
        PostLoginInvalidPayload.responseCode400LoginInvalidPayload();
    }

}
