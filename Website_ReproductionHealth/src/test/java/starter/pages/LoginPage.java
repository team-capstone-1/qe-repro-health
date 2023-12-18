package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By emailField() {
        return By.xpath("/html/body/div/section/div[2]/div/div[1]/form/div[1]/div/input");
    }

    private By passwordField() {
        return By.xpath("/html/body/div/section/div[2]/div/div[1]/form/div[2]/div/input");
    }

    private By loginButton() {
        return By.id("submit-button");
    }

    private By LupaPasswordLink() {
        return By.xpath("/html/body/div/section/div[2]/div/div[1]/form/div[3]/a");
    }

    private By EmailForgotPassword() {
        return By.xpath("//*[@id=\"email\"]");
    }

    private By ButtonSendForgotPassword() {
        return By.xpath("//*[@id=\"submit-button\"]");
    }

    private By erorMessagageForgotPassword() {
        return By.xpath("//*[@id=\"error-toast\"]/div[1]/div");
    }

    private By successMessagageForgotPassword() {
        return By.xpath("//*[@id=\"verify-form\"]/div[1]/h3");
    }

    private By erorfieldForgotPassword() {
        return By.xpath("//*[@id=\"forgot-password-form\"]/div[2]/span");
    }

    private By errorMessagePageLogin(){
        return By.xpath("/html/body/div/div[2]");
    }

    private By errorMessageEmail(){
        return By.xpath("/html/body/div/section/div[2]/div/div[1]/form/div[1]/span");
    }

    private By errorMessagePassword(){
        return By.xpath("/html/body/div/section/div[2]/div/div[1]/form/div[2]/span");
    }

    private By messagesuccesLogin(){
        return By.xpath("/html/body/div/div[3]/main/section/div/div[1]/div[1]/h4");
    }

    private By ButtonMasukSebagaiDokter() {
        return By.id("login-as-doctor-button");
    }



    @Step
    public void clickButtonMasukSebagaiDokter() {
        $(ButtonMasukSebagaiDokter()).click();
    }


    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public boolean validatesuccesLogin() {
        return $(messagesuccesLogin()).isDisplayed();
    }

    @Step
    public boolean validateErrorMessage(){
        return $(errorMessagePageLogin()).isDisplayed();
    }
    @Step
    public boolean iValidateEqualErrorMessage(String message) {
        return ($(errorMessagePageLogin()).getText().equalsIgnoreCase(message));
    }

    @Step
    public boolean validateErrorMessage1(){
        return $(errorMessageEmail()).isDisplayed();
    }
    @Step
    public boolean incorrectErrorMessageEmail(String notFillingEmail) {

        return $(errorMessageEmail()).getText().equalsIgnoreCase(notFillingEmail);
    }

    @Step
    public boolean validateErrorMessage2(){
        return $(errorMessageEmail()).isDisplayed();
    }
    @Step
    public boolean incorrectAlertErrorMessagePassword(String notFillingPassword) {

        return ($(errorMessagePassword()).getText().equalsIgnoreCase(notFillingPassword));

    }


    @Step
    public boolean validateErrorMessage3(){
        return $(errorMessagePassword()).isDisplayed();
    }
    @Step
    public boolean incorrectAlertErrorMessagePasswordunder7characters(String under7characters) {

        return ($(errorMessagePassword()).getText().equalsIgnoreCase(under7characters));

    }

    @Step
    public boolean validateErrorMessage4(){
        return $(errorMessagePassword()).isDisplayed();
    }

    @Step
    public boolean incorrectAlertErrorMessageNotEnterEmailAndPassword(String NotEnterEmailAndPassword) {

        return ($(errorMessagePassword()).getText().equalsIgnoreCase(NotEnterEmailAndPassword));

    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
        
    }

    //forgot password
    @Step
    public void clickLupaPassword() {

        $(LupaPasswordLink()).click();
    }

    @Step
    public void inputEmailForgotPassword(String emailForgotPassword) {
        $(EmailForgotPassword()).type(emailForgotPassword);
    }

    @Step
    public void clickButtonSendForgotPassword() {

        $(ButtonSendForgotPassword()).click();
    }

    @Step
    public boolean validateErrorMessageForgotPassword(){
        return $(erorMessagageForgotPassword()).isDisplayed();
    }

    @Step
    public boolean incorrectAlertErrorMessageIncorrectlyFormattedEmail(String IncorrectlyFormattedEmailForgotPassword) {

        return ($(erorMessagageForgotPassword()).getText().equalsIgnoreCase(IncorrectlyFormattedEmailForgotPassword));

    }



    @Step
    public void inputUnregisteredEmailForgotPassword1(String emailForgotPassword1) {
        $(EmailForgotPassword()).type(emailForgotPassword1);
    }

    @Step
    public boolean validateErrorMessageUnregisteredEmailForgotPassword(){
        return $(erorMessagageForgotPassword()).isDisplayed();
    }

    @Step
    public boolean incorrectAlertErrorMessageUnregisteredEmail(String UnregisteredEmail) {

        return ($(erorMessagageForgotPassword()).getText().equalsIgnoreCase(UnregisteredEmail));

    }



    @Step
    public boolean validateErrorMessageNotFillingForgotPassword(){
        return $(erorfieldForgotPassword()).isDisplayed();
    }

    @Step
    public boolean incorrectAlertErrorMessageNotFilling(String NotFilling) {

        return ($(erorfieldForgotPassword()).getText().equalsIgnoreCase(NotFilling));

    }
}

