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



class registerSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("open Reprohealth application")
	def openReprohealthApp() {
		Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\ReproHealth.apk', true)
	}

	@And("click the skip button")
	def clickTheSkipButton() {
		Mobile.tap(findTestObject('Login/btnLewati'), 0)
	}

	@And("click the sign up button option")
	def clickTheSignUpButtonOption() {
		Mobile.tap(findTestObject('SignUp/btnSignUpAccount'), 0)
	}

	@When("input name")
	def inputNameEmailPasswordAndConfirmPassword() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldNameOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldNameOnSignUp'), 'Aaa', 0)
		Mobile.hideKeyboard()
	}

	@And("input email")
	def inputEmail() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldEmailOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldEmailOnSignUp'), 'www2@gmail.com', 0)
		Mobile.hideKeyboard()
	}

	@And("input password")
	def inputPassword() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldPasswordOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldPasswordOnSignUp'), 'Www111222', 0)
		Mobile.hideKeyboard()
	}

	@And("input confirm password")
	def inputConfirmPassword() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldPassConfirmOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldPassConfirmOnSignUp'), 'Www111222', 0)
		Mobile.hideKeyboard()
	}

	@And("click sign up button")
	def clickSignUpButton() {
		Mobile.tap(findTestObject('Object Repository/SignUp/btnSignUp'), 0)
	}

	@When("verify success sign up")
	def verifySuccessSignUp() {
		Mobile.verifyElementVisible(findTestObject('SignUp/msgSuccessSignUp'), 0)
	}

	@When("click sign up button1")
	def clickSignUpButton1() {
		Mobile.tap(findTestObject('Object Repository/SignUp/btnSignUp'), 0)
	}

	@And("input symbol in the first letter of name")
	def inputSymbolInFirstLetterOfName() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldNameOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldNameOnSignUp'), '@aa1', 0)
		Mobile.hideKeyboard()
	}

	@And("input lowercase in first letter of name")
	def inputLowercaseInFirstLetterOfName() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldNameOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldNameOnSignUp'), 'aaa1', 0)
		Mobile.hideKeyboard()
	}

	@And("input existing email")
	def inputExistingEmail() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldEmailOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldEmailOnSignUp'), 'aaa@gmail.com', 0)
		Mobile.hideKeyboard()
	}

	@And("input invalid email domain")
	def inputInvalidEmailDomain() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldEmailOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldEmailOnSignUp'), 'aaa@example.com', 0)
		Mobile.hideKeyboard()
	}

	@And("input uppercase email")
	def inputUppercaseEmail() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldEmailOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldEmailOnSignUp'), 'EeE1@gmail.com', 0)
		Mobile.hideKeyboard()
	}

	@And("input email without domain")
	def inputEmailWithoutDomain() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldEmailOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldEmailOnSignUp'), 'aaa', 0)
		Mobile.hideKeyboard()
	}

	@And("input lowercase password")
	def inputLowercasePassword() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldPasswordOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldPasswordOnSignUp'), 'aaa111222', 0)
		Mobile.hideKeyboard()
	}

	@And("input lowercase confirm password")
	def inputLowercaseConfirmPassword() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldPassConfirmOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldPassConfirmOnSignUp'), 'aaa111222', 0)
		Mobile.hideKeyboard()
	}

	@And("input mismatched confim password")
	def inputMismatchedPassword() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldPassConfirmOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldPassConfirmOnSignUp'), 'Aaa111223', 0)
		Mobile.hideKeyboard()
	}

	@And("input empty password")
	def inputEmptyPassword() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldPasswordOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldPasswordOnSignUp'), '', 0)
		Mobile.hideKeyboard()
	}

	@And("input empty confirm password")
	def inputEmptyConfirmPassword() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldPassConfirmOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldPassConfirmOnSignUp'), '', 0)
		Mobile.hideKeyboard()
	}

	@And("input password less than 8 characters")
	def inputPasswordLessThan8Char() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldPasswordOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldPasswordOnSignUp'), 'weak', 0)
		Mobile.hideKeyboard()
	}

	@And("input confirm password less than 8 characters")
	def inputConfirmPasswordLessThan8Char() {
		Mobile.tap(findTestObject('Object Repository/SignUp/fieldPassConfirmOnSignUp'), 0)
		Mobile.setText(findTestObject('SignUp/fieldPassConfirmOnSignUp'), 'weak', 0)
		Mobile.hideKeyboard()
	}

	@Then("shows an alert on name")
	def showsAlertOnName() {
		Mobile.verifyElementVisible(findTestObject('SignUp/warningNameOnSignUp'), 0)
		Mobile.closeApplication()
	}

	@Then("shows an alert on email")
	def showsAlertOnEmail() {
		Mobile.verifyElementVisible(findTestObject('SignUp/warningEmailOnSignUp'), 0)
		Mobile.closeApplication()
	}

	@Then("shows an alert that the email is existing")
	def showsAlertThatEmailIsExisting() {
		Mobile.verifyElementVisible(findTestObject('SignUp/warningEmailExisting'), 0)
		Mobile.closeApplication()
	}

	@Then("shows an alert on password")
	def showsAlertOnPassword() {
		Mobile.verifyElementVisible(findTestObject('SignUp/warningPasswordOnSignUp'), 0)
		Mobile.closeApplication()
	}

	@Then("shows an alert on confim password")
	def showsAlertOnConfimPassword() {
		Mobile.verifyElementVisible(findTestObject('SignUp/warningConfirmPasswordOnSignUp'), 0)
		Mobile.closeApplication()
	}
}