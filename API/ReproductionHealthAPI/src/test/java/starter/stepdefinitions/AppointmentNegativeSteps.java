package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.appointment.*;

public class AppointmentNegativeSteps {

    @Steps
    GetAllSpecialistInvalidEndpoint GetAllSpecialistInvalidEndpoint;
    @Steps
    GetAllSpecialistInvalidMethod GetAllSpecialistInvalidMethod;

    @Given("I set GET all Specialist invalid endpoint")
    public void setGetEndpointAllSpecialist(){
        GetAllSpecialistInvalidEndpoint.setGetAllSpecialistInvalidEndpoint();
    }
    @When("I send GET HTTP request all Specialist invalid endpoint")
    public void sendGetHttpRequestAllSpecialist(){
        GetAllSpecialistInvalidEndpoint.sendGetHttpRequestAllSpecialistInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all Specialist invalid endpoint")
    public void responseCode200ForGetAllSpecialist(){
        GetAllSpecialistInvalidEndpoint.responseCode404ForGetAllSpecialistInvalidEndpoint();
    }

    @Given("I set GET all Specialist invalid method")
    public void setGetMethodAllSpecialist(){
        GetAllSpecialistInvalidMethod.setGetAllSpecialistInvalidMethod();
    }
    @When("I send GET HTTP request all Specialist invalid method")
    public void sendGetHttpRequestAllSpecialistInvalidMethod(){
        GetAllSpecialistInvalidMethod.sendGetHttpRequestAllSpecialistInvalidMethod();
    }
    @Then("I receive response code 405 for Get all Specialist invalid method")
    public void responseCode405ForGetAllSpecialistInvalidMethod(){
        GetAllSpecialistInvalidMethod.responseCode405ForGetAllSpecialistInvalidMethod();
    }

}
