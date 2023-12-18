package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import starter.pages.DashboardPage;
import starter.pages.LandingPage;
import starter.pages.LoginPage;

public class DashboardSteps{
    @Steps
    DashboardPage dashboardPage;

    @Steps
    LandingPage landingPage;

    @Steps
    LoginPage loginPage;



    @When("I click button \"bulanan\"")
    public void clickButtonMonthly() {
        dashboardPage.clickButtonMonthly();

    }

    @Then("I should be redirected to monthly doctor data")
    public void validateMonthlyDoctorData() {
        dashboardPage.validateMonthlyDoctorData();
    }

    //Weekly
    @When("I click button \"Mingguan\"")
    public void clickButtonWeekly() {
        dashboardPage.clickButtonWeekly();

    }

    @Then("I should be redirected to weekly doctor data")
    public void validateWeeklyDoctorData() {
        dashboardPage.validateWeeklyDoctorData();
    }

    //Daily
    @When("I click button \"Harian\"")
    public void clickButtonDaily() {
        dashboardPage.clickButtonDaily();

    }

    @Then("I should be redirected to daily doctor data")
    public void validateDailyDoctorData() {
        dashboardPage.validateDailyDoctorData();
    }


    //appointments
    @When("I click button \"Lihat semua\"")
    public void clickViewAppointment() {
        dashboardPage.clickViewAppointment();

    }

    @Then("I should be redirected to appointments page")
    public void ValidateAppointmentPage() {
        dashboardPage.ValidateAppointmentPage();
    }


}