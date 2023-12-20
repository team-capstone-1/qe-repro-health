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



class chatbotSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("Click Forum on navbar")
	def clickChatbotIconOnHomePage() {
		Mobile.tap(findTestObject('Forum/btnNavbarForum'), 0)
	}

	@And("Click chatbot icon")
	def clickChatbotIcon() {
		Mobile.tap(findTestObject('Chatbot/btnChatbotAI'), 0)
		Mobile.tap(findTestObject('Chatbot/btnYesChatbotAI'), 0)
	}

	@And("Click Buat pesan baru")
	def clickBuatPesanBaru() {
		Mobile.tap(findTestObject('Chatbot/btnNewMsgChatbotAI'), 0)
	}

	@And("Input the question")
	def inputTheQuestion() {
		Mobile.tap(findTestObject('Chatbot/fieldQuestionChatbotAI'), 0)
		Mobile.setText(findTestObject('Chatbot/fieldQuestionChatbotAI'), 'bagaimana gejala awal salpingitis?', 0)
		Mobile.hideKeyboard()
	}

	@And("Click send to create new question")
	def clickSendCreateQuestion() {
		Mobile.tap(findTestObject('Chatbot/btnSendMsgChatbotAI'), 0)
	}

	@Then("Displays the chatbot page")
	def displayChatbotPage() {
		Mobile.verifyElementVisible(findTestObject('Chatbot/verifyHistoryChatbotAI'), 20)
	}

	@Then("Successfully create new question")
	def successfullyCreateNewQuestion() {
		Mobile.verifyElementVisible(findTestObject('Chatbot/h1ReproAssistChatbotAI'), 20)
		Mobile.closeApplication()
	}

	@Then("Unable to create questions")
	def unableCreateQuestions() {
		Mobile.verifyElementVisible(findTestObject('Chatbot/h1ReproAssistChatbotAI'), 20)
		Mobile.closeApplication()
	}

	@Then("Display see previous chat room details")
	def displaySeePreviousChatRoomDetails() {
		Mobile.verifyElementVisible(findTestObject('Chatbot/h1ReproAssistChatbotAI'), 20)
		Mobile.closeApplication()
	}

	@Then("Choose and click one of the questions")
	def ChooseClickQuestions() {
		Mobile.tap(findTestObject('Chatbot/1stQuestionAtChatbotAI'), 0)
	}
}