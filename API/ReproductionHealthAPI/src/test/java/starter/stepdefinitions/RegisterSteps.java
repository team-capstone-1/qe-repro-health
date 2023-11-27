package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.register.*;

public class RegisterSteps {
    @Steps
    PostRegister PostRegister;

    @Given("I set POST endpoints Register")
    public void setPostRegisterEndpoint(){
        PostRegister.setPostRegisterEndpoint();
    }
    @When("I send POST HTTP request Register")
    public void sendPostHttpRequestRegisterEndpoint(){
        PostRegister.sendPostHttpRequestRegisterEndpoint();
    }
    @Then("I receive response code 200 Register")
    public void responseCode200RegisterEndpoint(){
        PostRegister.responseCode200RegisterEndpoint();
    }
    @And("I receive valid data for Register")
    public void receiveValidDataForRegister(){
        PostRegister.receiveValidDataForRegister();
    }
}
