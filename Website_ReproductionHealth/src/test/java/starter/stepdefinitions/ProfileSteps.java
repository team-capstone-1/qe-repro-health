package starter.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProfilPage;

public class ProfileSteps {

    @Steps
    ProfilPage profilPage;

    @When("I click menu profile")
    public void clickProfilePage() {
        profilPage.clickProfilePage();

    }

    @And("I click \"Pengalaman Kerja\"")
    public void clickworkExperience() {
        profilPage.clickworkExperience();

    }

    @Then("I have to display work experience")
    public void ValidateworkExperience() {
        profilPage.ValidateworkExperience();
    }

    //education
    @And("I click \"Pendidikan\"")
    public void clickeducation() {
        profilPage.clickeducation();

    }

    @Then("I have to display education")
    public void Validateeducation() {
        profilPage.Validateeducation();
    }

    //Certificate
    @And("I click \"Sertifikat\"")
    public void clickCertificate() {
        profilPage.clickCertificate();

    }

    @Then("I have to display certification")
    public void ValidateCertificate() {
        profilPage.ValidateCertificate();
    }

    //Detail Certificate
    @And("I click certification")
    public void clickDetailCertificate() {
        profilPage.clickDetailCertificate();

    }

    @Then("I have to display certificate details")
    public void ValidateDetailCertificatePicture() {
        profilPage.ValidateDetailCertificatePicture();
    }


    //search
    @And("I enters correct keywords in profile {string}")
    public void clickSearchCertificate(String KeywordCertificate) {
        profilPage.clickSearchCertificate(KeywordCertificate);
    }

    @Then("I have to displays Certification that match the keywords")
    public void ValidateSearchCertificate() {
        profilPage.ValidateSearchCertificate();
    }

    @And("I enters incorrect keywords in profile {string}")
    public void clickSearchCertificate1(String KeywordCertificate1) {
        profilPage.clickSearchCertificate1(KeywordCertificate1);
    }

    @Then("I have to displays Certification that match the keywords.")
    public void ValidateSearchCertificate1() {
        profilPage.ValidateSearchCertificate1();
    }


}
