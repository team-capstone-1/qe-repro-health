package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.appointment.*;

public class AppointmentSteps {
    @Steps
    GetAllSpecialist GetAllSpecialist;



    @Given("I set GET endpoint all specialist")
    public void setGetEndpointAllSpecialist(){
        GetAllSpecialist.setGetEndpointAllSpecialist();
    }
    @When("I send GET HTTP request all specialist")
    public void sendGetHttpRequestAllSpecialist(){
        GetAllSpecialist.sendGetHttpRequestAllSpecialist();
    }
    @Then("I receive response code 200 for get all specialist")
    public void responseCode200ForGetAllSpecialist(){
        GetAllSpecialist.responseCode200ForGetAllSpecialist();
    }

}
