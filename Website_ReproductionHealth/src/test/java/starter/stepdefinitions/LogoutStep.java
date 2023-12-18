package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutPage;

public class LogoutStep {

    @Steps
    LogoutPage logoutPage;

    @When("I click button \"Keluar\"")
    public void clickButtonLogout() {
        logoutPage.clickButtonLogout();

    }

    @And("I click \"Ya, saya keluar\"")
    public void clickButtonLogoutConfirmation() {
        logoutPage.clickButtonLogoutConfirmation();

    }

    @Then("I should be redirected to my landingpage")
    public void ValidateSuccessLogout() {
        logoutPage.ValidateSuccessLogout();
    }

    //failed to logout
    @And("I click button  \"Tidak, Batalkan\"")
    public void clickButtonLogoutConfirmationNo() {
        logoutPage.clickButtonLogoutConfirmationNo();

    }

    @Then("I should be stay in dashboard")
    public void ValidateFailedLogout() {
        logoutPage.ValidateFailedLogout();
    }

}
