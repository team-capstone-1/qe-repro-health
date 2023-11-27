package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.login.*;

public class LoginSteps {
    @Steps
    PostLogin PostLogin;



    @Given("I set POST endpoints Login")
    public void setPostLoginEndpoint(){
        PostLogin.setPostLoginEndpoint();
    }
    @When("I send POST HTTP request Login")
    public void sendPostHttpRequestLoginEndpoint(){
        PostLogin.sendPostHttpRequestLoginEndpoint();
    }
    @Then("I receive response code 200 Login")
    public void responseCode200LoginEndpoint(){
        PostLogin.responseCode200LoginEndpoint();
    }

}
