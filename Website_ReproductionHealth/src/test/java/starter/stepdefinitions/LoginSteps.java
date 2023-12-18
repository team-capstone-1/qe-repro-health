package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LandingPage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    LandingPage landingPage;


    // Positive

    @Given("I am on the Reproduction landing page")
    public void onTheLandingPage() {
        landingPage.openPage();
    }

    @When("I click button \"Masuk sebagai dokter\"")
    public void clickButtonMasukSebagaiDokter() {
        loginPage.clickButtonMasukSebagaiDokter();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("I enter correct email")
    public void inputEmail() {
        loginPage.inputEmail("lalasyaa92@gmail.com");
    }

    @And("I enter correct password")
    public void inputPassword() {
        loginPage.inputPassword("Taurus123");
    }

    @And("I click on the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
		try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I should be redirected to my Reproduction dashboard")
    public void validatesuccesLogin() {
        loginPage.validatesuccesLogin();
    }

    // Negative


    @Then("I can see error message {string}")
    public void alertContent(String message) {
        loginPage.validateErrorMessage();
        loginPage.iValidateEqualErrorMessage(message);
    }

    @And("I enter invalid email")
    public void inputIncorrectEmail() {
        loginPage.inputEmail("lalasyaa@gmail.com");
    }

    @And("I input email with the login email not match the email writing format")
    public void inputWrongEmailFormat() {
        loginPage.inputEmail("lalasyaa@gm");
    }

    @And("I enter invalid password")
    public void inputInvalidPassword() {
        loginPage.inputPassword("Taurus246");
    }

    @And("I enter empty email")
    public void inputEmptyEmail() {
        loginPage.inputEmail("");
    }

    @And("I enter empty password")
    public void inputEmptyPassword() {
        loginPage.inputPassword("");
    }


    @Then("I can see error message {string}.")
    public void incorrectErrorMessageEmail(String notFillingEmail) {
        loginPage.validateErrorMessage1();
        loginPage.incorrectErrorMessageEmail(notFillingEmail);
    }

    @Then("I see error message {string}")
    public void incorrectAlertErrorMessagePassword(String notFillingPassword) {
        loginPage.validateErrorMessage2();
        loginPage.incorrectAlertErrorMessagePassword(notFillingPassword);
    }

    @And("I enter invalid password under 7 characters")
    public void inputInvalidPasswordunder7characters() {
        loginPage.inputPassword("Taurus");
    }

    @Then("I see error message {string}.")
    public void incorrectAlertErrorMessagePasswordunder7characters(String under7characters) {
        loginPage.validateErrorMessage3();
        loginPage.incorrectAlertErrorMessagePasswordunder7characters(under7characters);
    }

    @Then("I can see error message {string},")
    public void incorrectAlertErrorMessageNotEnterEmailAndPassword(String NotEnterEmailAndPassword) {
        loginPage.validateErrorMessage4();
        loginPage.incorrectAlertErrorMessageNotEnterEmailAndPassword(NotEnterEmailAndPassword);

    }

    //FORGOT PASSWORD

    @And("I click \"Lupa Kata sandi\"")
    public void clickButtonLupaPassword() {
        loginPage.clickLupaPassword();
    }


    @And("I enter incorrect email Forgot Password")
    public void inputIncorrectEmailForgotPassword() {
        loginPage.inputEmailForgotPassword("lalasyaa@gma.com");
    }

    @And("I click button send")
    public void clickButtonSendForgotPassword() {
        loginPage.clickButtonSendForgotPassword();

    }
    @Then("I can see error message in page Forgot Password {string}")
    public void incorrectAlertErrorMessageForgotPassword(String IncorrectlyFormattedEmailForgotPassword) {
        loginPage.validateErrorMessageForgotPassword();
        loginPage.incorrectAlertErrorMessageIncorrectlyFormattedEmail(IncorrectlyFormattedEmailForgotPassword);
    }


    @And("I fills in the email with the unregistered email")
    public void inputUnregisteredEmailForgotPassword1() {
        loginPage.inputEmailForgotPassword("cheilintclaudina@gmail.com");
    }

    @Then("I can see error message in page Forgot Password {string},")
    public void incorrectAlertErrorMessageForgotPasswordUnregisteredEmail(String UnregisteredEmail) {
        loginPage.validateErrorMessageUnregisteredEmailForgotPassword();
        loginPage.incorrectAlertErrorMessageUnregisteredEmail(UnregisteredEmail);
    }



    @Then("I can see error message in page Forgot Password1 {string}")
    public void incorrectAlertErrorMessageForgotPasswordNotFillingEmail(String NotFilling) {
        loginPage.validateErrorMessageNotFillingForgotPassword();
        loginPage.incorrectAlertErrorMessageNotFilling(NotFilling);
    }
}
