package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.AppointmentPage;
import starter.pages.LandingPage;
import starter.pages.LoginPage;

public class AppointmentSteps {

    @Steps
    AppointmentPage appointmentPage;

    @Steps
    LandingPage landingPage;

    @Steps
    LoginPage loginPage;

    @Given("I am on the Reproduction Dashboard")
    public void onTheDashboard() {
        landingPage.openPage();
        landingPage.clickbuttonLandingpage();
        loginPage.clickButtonMasukSebagaiDokter();
        loginPage.inputEmail("lalasyaa92@gmail.com");
        loginPage.inputPassword("Taurus123");
        loginPage.clickLoginButton();
    }

    @When("I click menu \"janji temu\"")
    public void clicksMenuAppointment() {
        appointmentPage.clicksMenuAppointment();

    }

    @And("I enter correct keywoards")
    public void entersearchField() {appointmentPage.entersearchField("Muhammad");

    }

    @Then("I should be redirected to my detail pasien")
    public void ValidateSuccesSearch() {
        appointmentPage.ValidateSuccesSearch();
    }




//Negatif search
    @And("I enter incorrect keywoards")
    public void entersearchFieldincorrect() {appointmentPage.entersearchFieldincorrect("felix");}

    @Then("I should be display no data")
    public void ValidateInvalidSearch() {
        appointmentPage.ValidateInvalidSearch();}


//filter status menunggu
    @And("I click fillter")
    public void clickfilterField() {appointmentPage.clickfilterField();}

    @And("I click \"menunggu\"")
    public void clickfilterMenunggu() {appointmentPage.clickfilterMenunggu();}

    @Then("I should be displays a list of appointments based on Menunggu status")
    public void validatefilterMenunggu() {
        appointmentPage.validatefilterMenunggu();
    }

    //filter status berjalan
    @And("I click \"Berjalan\"")
    public void clickfilterBerjalan() {appointmentPage.clickfilterBerjalan();}

    @Then("I should be displays a list of appointments based on Berjalan status")
    public void validatefilterBerjalan() {
        appointmentPage.validatefilterberjalan();
    }

    //filter status dibatalkan
    @And("I click \"Dibatalkan\"")
    public void clickfilterDibatalkan() {appointmentPage.clickfilterDibatalkan();}

    @Then("I should be displays a list of appointments based on Dibatalkan status")
    public void validatefilterDibatalkan() {
        appointmentPage.validatefilterDibatalkan();
    }


    //filter status dibatalkan
    @And("I click \"selesai\"")
    public void clickfilterSelesai() {appointmentPage.clickfilterSelesai();}

    @Then("I should be displays a list of appointments based on Selesai status")
    public void validatefilterselesi() {
        appointmentPage.validatefilterSelesai();
    }


    //filter Sesi Pagi
    @And("I clicks the filter button")
    public void clickFillterSesi() {appointmentPage.clickFillterSesi();}

    @And("I clicks morning")
    public void clickFillterSesiPagi() {appointmentPage.clickFillterSesiPagi();}

    @And("I clicks the button OK")
    public void clickbuttonOK() {appointmentPage.clickbuttonOK();}

    @Then("I should be shows the patient with a morning session")
    public void validatefilterSesiPagi() {
        appointmentPage.validatefilterSesi();
    }

    //filter Sesi siang
    @And("I click during the day")
    public void clickFillterSesiSiang() {appointmentPage.clickFillterSesiSiang();}

    @Then("I should be shows patients with afternoon sessions")
    public void validatefilterSesiSiang() {
        appointmentPage.validatefilterSesi();
    }

    //filter Sesi Malam
    @And("I click at evening")
    public void clickFillterSesiMalam() {appointmentPage.clickFillterSesiMalam();}

    @Then("I should be shows patients with evening sessions")
    public void validatefilterSesiMalam() {
        appointmentPage.validatefilterSesi();
    }

    //reset
    @And("I click at morning, afternoon, evening")
    public void clickFillterSesi3() {
        appointmentPage.clickFillterSesiPagi();
        appointmentPage.clickFillterSesiSiang();
        appointmentPage.clickFillterSesiMalam();}

    @And("clicks the reset button")
    public void clickbuttonReset() {appointmentPage.clickbuttonReset();}

    @Then("I successfully reset selected session filters")
    public void validatefilterReset() {
        appointmentPage.validatefilterSesi();
    }

    //transaction detail
    @And("I click patient name")
    public void clickpatientName() {
        appointmentPage.clickpatientName();}

    @And("I click \"bukti transaksi\"")
    public void clicktransactionDetails() {appointmentPage.clicktransactionDetails();}

    @Then("I should be displays transaction details")
    public void validateValidatetransaction() {
        appointmentPage.validateValidatetransaction();
    }

    //transaction detail picture
    @And("I click picture")
    public void clicktransactionDetailsfoto() {appointmentPage.clicktransactionDetailsfoto();}

    @Then("I should be displays proof of patient transfer")
    public void validateValidatetransactionfoto() {
        appointmentPage.validateValidatetransactionfoto();
    }

//confirmation Patient
    @And("I click patient name with waiting status")
    public void clickpatientNameWithWaitingStatus() {
        appointmentPage.clickpatientNameWithWaitingStatus();}

    @And("I click Button \"Konfirmasi sekarang\"")
    public void clickButtonConfirmation1() {appointmentPage.clickButtonConfirmation1();}

    @And("I clicks button \"Ya, Saya yakin\"")
    public void clickButtonConfirmation2() {
        appointmentPage.clickButtonConfirmation2();}

    @Then("I can see success message {string}")
    public void ValidateSuccessTransaction1(String success1) {
        appointmentPage.ValidateSuccessTransaction1();
        appointmentPage.SuccessMessageConfirmation1(success1);
    }

    @And("I click patient name with status \"Berjalan\"")
    public void clickpatientNameWithStatusBerjalan() {
        appointmentPage.clickpatientNameWithStatusBerjalan();}

    @Then("I can see success message {string}..")
    public void ValidateSuccessTransaction2(String success2) {
        appointmentPage.ValidateSuccessTransaction2();
        appointmentPage.SuccessMessageConfirmation2(success2);
    }

    //see next appointment list slide
    @And("I click next appointment list number")
    public void clickNextAppointmentListNumber() {
        appointmentPage.clickNextAppointmentListNumber();}

    @Then("I should be display next appointment slide")
    public void ValidateNextAppoint() {
        appointmentPage.ValidateNextAppoint();
    }


    //change status on appointment list to "in progress" failed
    @And("I clicks on the name of the patient with waiting status")
    public void clickPatientWithWaitingStatus() {
        appointmentPage.clickPatientWithWaitingStatus();}

    @And("I clicks button \"Tidak, batalkan\"")
    public void clickButtonNo() {
        appointmentPage.clickButtonNo();}

    @Then("I should be stay on the appointment page")
    public void ValidateChangeStatusTransactions() {
        appointmentPage.ValidateChangeStatusTransactions();
    }



    // Ascending name

    @And("I click button triangle top on name patient")
    public void clickascendingName() {
        appointmentPage.clickascendingName();}

    @Then("I should be displays a list of patient names in order from letters A-Z")
    public void ValidateAscendingName() {
        appointmentPage.ValidateAscendingName();
    }

    // Descending name

    @And("I click button triangle down on name patient")
    public void clickDescendingName() {
        appointmentPage.clickDescendingName();}

    @Then("I should be displays a list of patient names in order from letters Z-A")
    public void ValidateDescendingName() {
        appointmentPage.ValidateDescendingName();
    }

    // Ascending no urut

    @And("I click button triangle top on no.urut")
    public void clickascendingOrderNumber() {
        appointmentPage.clickascendingOrderNumber();}

    @Then("I should be displays the appointment number in order from the highest value")
    public void ValidateascendingOrderNumber() {
        appointmentPage.ValidateascendingOrderNumber();
    }

    // Descending no urut

    @And("I click button triangle down on no.urut")
    public void clickdescendingOrderNumber() {
        appointmentPage.clickdescendingOrderNumber();}

    @Then("I should be displays appointment no. Sort appointments from lowest value")
    public void ValidatedescendingOrderNumber() {
        appointmentPage.ValidatedescendingOrderNumber();
    }
}
