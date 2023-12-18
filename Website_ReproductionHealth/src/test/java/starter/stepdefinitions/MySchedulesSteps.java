package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.MySchedulesPage;

public class MySchedulesSteps {

    @Steps
    MySchedulesPage mySchedulesPage;


//displays all my schedules for the last month
    @When("I click menu \"Jadwal Saya\"")
    public void clicksMySchedulesPage() {
        mySchedulesPage.clicksMySchedulesPage();
    }

    @And("I click previous slide button")
    public void clicksPreviousMonth() {
        mySchedulesPage.clicksPreviousMonth();
    }

    @Then("I have to display all my schedules for the last month")
    public void ValidateMySchedulesForTheLastMonth() {
        mySchedulesPage.ValidateMySchedulesForTheLastMonth();
    }


//displays all my schedules for the next month
    @And("I clicks the next slide button")
    public void clicksNextMonth() {
        mySchedulesPage.clicksNextMonth();
    }

    @Then("I have to display all my schedules for the next month")
    public void ValidateMySchedulesForTheNextMonth() {
        mySchedulesPage.ValidateMySchedulesForTheNextMonth();
    }

    //change the schedule for the next day
    @And("I clicks on the desired date")
    public void clicksDate() {
        mySchedulesPage.clicksDate();
    }

    @And("I clicks the time range they want to change")
    public void clicksTimeRange() {
        mySchedulesPage.clicksTimeRange();
    }

    @And("I click button \"Simpan Perubahan\"")
    public void clicksButtonSave() {
        mySchedulesPage.clicksButtonSave();
    }

    @And("I click button \"Ya, Saya Yakin\"")
    public void clicksButtonConfirmationYes() {
        mySchedulesPage.clicksButtonConfirmationYes();
    }

    @Then("I can see success message in page my schedule {string}")
    public void ValidateToastSuccess(String messageSuccess) {

        mySchedulesPage.ValidateToastSuccess();
        mySchedulesPage.correctAlertSuccessMessage(messageSuccess);
    }


    //failed to change the schedule for the next day
    @And("I click button \"Tidak, batalkan\"")
    public void clicksButtonConfirmationNo() {
        mySchedulesPage.clicksButtonConfirmationNo();
    }

    @Then("I should be redirected to the same page")
    public void ValidateFailedChangeTheSchedule() {

        mySchedulesPage.ValidateFailedChangeTheSchedule();

    }

    //View the appointment schedule for one day in each range
    @And("The user clicks on the desired time range on the appointment schedule")
    public void clickslistAppointment() {
        mySchedulesPage.clickslistAppointment();
    }

    @Then("I have to displays a schedule of appointments for one day in each range")
    public void ValidateAppointmentScheduleForOneDayInEachRange() {

        mySchedulesPage.ValidateAppointmentScheduleForOneDayInEachRange();

    }

}
