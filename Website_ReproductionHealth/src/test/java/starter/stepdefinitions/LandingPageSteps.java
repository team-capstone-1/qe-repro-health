package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LandingPage;

public class LandingPageSteps {

    @Steps
    LandingPage landingPage;

    @Given("I am on the Reproduction")
    public void onTheLoginPage() {
        landingPage.openPage();
    }

    @When("I click on the home")
    public void clickHome() {
        landingPage.clickHome();

    }

    @Then("I should be redirected to home Reproduction")
    public void validateOnhome() {
        landingPage.validateOnhome();
    }

    //about
    @When("I click on the about")
    public void clicksAbout() {
        landingPage.clicksAbout();}

    @Then("I should be redirected to about Reproduction")
    public void validateOnabout() {
        landingPage.validateOnabout();
    }

    //service
    @When("I click on the service")
    public void clickservice() {
        landingPage.clickservice();}

    @Then("I should be redirected to service Reproduction")
    public void validateOnservice() {
        landingPage.validateOnservice();
    }

//benefit
    @When("I click on the benefit")
    public void clickbenefit() {
        landingPage.clickbenefit();}

    @Then("I should be redirected to benefit Reproduction")
    public void validateOnBenefit() {
        landingPage.validateOnBenefit();
    }


    //ketentuan Pengguna
    @When("I click on the ketentuan Pengguna")
    public void clickketentuanPengguna() {
        landingPage.clickketentuanPengguna();}

    @Then("I should be redirected to ketentuan Pengguna Reproduction")
    public void validateOnketentuanPengguna() {
        landingPage.validateOnketentuanPengguna();
    }

    //kebijakan Privasi
    @When("I click on the kebijakan Privasi")
    public void clickkebijakanPrivasi() {
        landingPage.clickkebijakanPrivasi();}

    @Then("I should be redirected to kebijakan Privasi Reproduction")
    public void validateOnkebijakanPrivasi() {
        landingPage.validateOnkebijakanPrivasi();
    }

    //FAQ
    @When("I click on the FAQ")
    public void clickFAQ() {
        landingPage.clickFAQ();}

    @Then("I should be redirected to FAQ Reproduction")
    public void validateOnFAQ() {
        landingPage.validateOnFAQ();
    }

    //doctor page
    @When("i click dropdown pada pertanyaan")
    public void clickdropdownFAQ() {
        landingPage.clickdropdownFAQ();}


    //doctor page
    @When("I click button \"Pelajari lebih lanjut\"")
    public void clickbuttonLandingpage() {
        landingPage.clickbuttonLandingpage();}

    @Then("I should be redirected to doctor's page")
    public void validateDoctorPage() {
        landingPage.validateDoctorPage();
    }


    //doctor page
    @And("I click button \"Hubungi Kami\"")
    public void clickbuttonHubungiKami() {
        landingPage.clickbuttonHubungiKami();}

    @Then("I should be redirected to email")
    public void validatebuttonHubungi() {
        landingPage.validatebuttonHubungi();
    }
}
