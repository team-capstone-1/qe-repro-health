import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("open the Reprohealth application")
	def openTheReprohealthApp() {
		Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\ReproHealth.apk', true)
	}

	@And("click skip button")
	def clickSkipButton() {
		Mobile.tap(findTestObject('Login/btnLewati'), 0)
	}

	@And("click the login button option")
	def clickTheLoginButtonOption() {
		Mobile.tap(findTestObject('Object Repository/Login/btnMasuk'), 0)
	}

	@When("input valid email & valid password")
	def inputValidEmailValidPassword() {
		Mobile.tap(findTestObject('Login/fieldEmail'), 0)
		Mobile.setText(findTestObject('Login/fieldEmail1'), 'aaa@gmail.com', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Login/fieldPassword'), 0)
		Mobile.setText(findTestObject('Login/fieldPassword1'), 'Aaa111222', 0)
		Mobile.hideKeyboard()
	}

	@And("click the remember me checkbox")
	def clickTheRememberMeCheckbox() {
		Mobile.tap(findTestObject('Object Repository/Login/checkboxIngatkanSaya'), 0)
	}

	@And("click login button")
	def clickLoginButton() {
		Mobile.tap(findTestObject('Object Repository/Login/btnLogin'), 0)
	}

	@Then("verify success login")
	def verifySuccessLogin() {
		Mobile.verifyElementVisible(findTestObject('Profile/btnNavbarProfile'), 0)
		Mobile.closeApplication()
	}

	@When("input empty field email & valid password")
	def inputEmptyFieldEmailValidPass() {
		Mobile.tap(findTestObject('Login/fieldPassword'), 0)
		Mobile.setText(findTestObject('Login/fieldPassword1'), 'Aaa111222', 0)
		Mobile.hideKeyboard()
	}

	@When("input valid email & empty field password")
	def inputValidEmailEmptyFieldPass() {
		Mobile.tap(findTestObject('Login/fieldEmail'), 0)
		Mobile.setText(findTestObject('Login/fieldEmail1'), 'aaa@gmail.com', 0)
		Mobile.hideKeyboard()
	}

	@When("input valid email with uppercase letters & valid password")
	def inputValidEmailWithUppercaseLettersValidPass() {
		Mobile.tap(findTestObject('Login/fieldEmail'), 0)
		Mobile.setText(findTestObject('Login/fieldEmail1'), 'Aaa@gmail.com', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Login/fieldPassword'), 0)
		Mobile.setText(findTestObject('Login/fieldPassword1'), 'Aaa111222', 0)
		Mobile.hideKeyboard()
	}

	@When("input space on email & valid password")
	def inputSpaceOnEmailValidPass() {
		Mobile.tap(findTestObject('Login/fieldEmail'), 0)
		Mobile.setText(findTestObject('Login/fieldEmail1'), ' ', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Login/fieldPassword'), 0)
		Mobile.setText(findTestObject('Login/fieldPassword1'), 'Aaa111222', 0)
		Mobile.hideKeyboard()
	}

	@When("input valid email & space on password")
	def inputValidEmailSpaceOnPass() {
		Mobile.tap(findTestObject('Login/fieldEmail'), 0)
		Mobile.setText(findTestObject('Login/fieldEmail1'), 'aaa@gmail.com', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Login/fieldPassword'), 0)
		Mobile.setText(findTestObject('Login/fieldPassword1'), ' ', 0)
		Mobile.hideKeyboard()
	}

	@When("input invalid email format & valid password")
	def inputInvalidEmailFormatValidPass() {
		Mobile.tap(findTestObject('Login/fieldEmail'), 0)
		Mobile.setText(findTestObject('Login/fieldEmail1'), 'aaa', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Login/fieldPassword'), 0)
		Mobile.setText(findTestObject('Login/fieldPassword1'), 'Aaa111222', 0)
		Mobile.hideKeyboard()
	}

	@Then("shows an alert that email or password invalid")
	def showsAlertEmailOrPassInvalid() {
		Mobile.verifyElementVisible(findTestObject('Login/msgLoginFailed'), 0)
		Mobile.closeApplication()
	}

	@And("login with registered account")
	def loginWithRegisteredAccount() {
		Mobile.tap(findTestObject('Login/fieldEmail'), 0)
		Mobile.setText(findTestObject('Login/fieldEmail1'), 'muhammadalbert16@gmail.com', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Login/fieldPassword'), 0)
		Mobile.setText(findTestObject('Login/fieldPassword1'), 'Cobaaja123', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Object Repository/Login/btnLogin'), 0)
	}


	@When("Click Lupa kata Sandi")
	def ClickForgotPass() {
		Mobile.tap(findTestObject('Object Repository/ForgotPass/btnLupaKataSandi'), 0)
	}

	@And("Input Email with an unregistered email")
	def InputEmailUnregEmail() {
		Mobile.tap(findTestObject('Object Repository/ForgotPass/fieldEmailForgotPass'), 0)
		Mobile.setText(findTestObject('Object Repository/ForgotPass/fieldEmailForgotPass'), 'jokoo@gmail.com', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Object Repository/ForgotPass/btnKirim1st'), 0)
	}

	@Then("warning email not registered")
	def warningEmailNotRegistered() {
		Mobile.verifyElementVisible(findTestObject('ForgotPass/msgEmailNotRegistered'), 0)
		Mobile.closeApplication()
	}

	@And("Not filling the email")
	def NotfillEmail() {
		Mobile.tap(findTestObject('Object Repository/ForgotPass/btnKirim1st'), 0)
	}


	@And("Input Email only with space on email")
	def InputEmailWithSpace() {
		Mobile.tap(findTestObject('Object Repository/ForgotPass/fieldEmailForgotPass'), 0)
		Mobile.setText(findTestObject('Object Repository/ForgotPass/fieldEmailForgotPass'), ' ', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Object Repository/ForgotPass/btnKirim1st'), 0)
	}

	@And("Input Email with invalid format")
	def InputEmailInvalidFormat() {
		Mobile.tap(findTestObject('Object Repository/ForgotPass/fieldEmailForgotPass'), 0)
		Mobile.setText(findTestObject('Object Repository/ForgotPass/fieldEmailForgotPass'), 'mariachristinahartono@example.com', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Object Repository/ForgotPass/btnKirim1st'), 0)
	}

	@And("Not fill OTP")
	def NotFillOTP() {
		Mobile.tap(findTestObject('ForgotPass/btnKirim2nd'), 0)
	}

	@Then("warning on OTP")
	def warningOnOTP() {
		Mobile.verifyElementVisible(findTestObject('ForgotPass/msgValidateWrongOTP'), 0)
		Mobile.closeApplication()
	}

	@And("input wrong OTP")
	def inputWrongOTP() {
		Mobile.tap(findTestObject('ForgotPass/fieldOTP1st'), 0)
		Mobile.setText(findTestObject('ForgotPass/fieldOTP1st'), '890122', 0)
		Mobile.tap(findTestObject('ForgotPass/btnKirim2nd'), 0)
	}

	@And("Input valid Email")
	def InputValidEmail() {
		Mobile.tap(findTestObject('Object Repository/ForgotPass/fieldEmailForgotPass'), 0)
		Mobile.setText(findTestObject('Object Repository/ForgotPass/fieldEmailForgotPass'), 'mariachristinahartono@gmail.com', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Object Repository/ForgotPass/btnKirim1st'), 0)
	}

	@And("click resend button")
	def clickResendButton() {
		Mobile.tap(findTestObject('ForgotPass/btnResendOTP'), 0)
	}

	@Then("success resend OTP to email")
	def successResendOTP() {
		Mobile.verifyElementVisible(findTestObject('ForgotPass/btnKirim2nd'), 0)
		Mobile.closeApplication()
	}

	@Then("warning on email field")
	def warningOnEmailField() {
		Mobile.verifyElementVisible(findTestObject('ForgotPass/verifyEmailNotValidForgotPass'), 0)
		Mobile.closeApplication()
	}

	@Then("shows alert on email")
	def showsAlertonEmail() {
		Mobile.verifyElementVisible(findTestObject('Login/warningEmailNotValid'), 0)
		Mobile.closeApplication()
	}

	@Then("shows alert on password")
	def showsAlertOnPassword() {
		Mobile.verifyElementVisible(findTestObject('Login/warningPassNotValid'), 0)
		Mobile.closeApplication()
	}
}