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



class forumSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@When("Click the bottom navbar Forum")
	def ClickTheBottomNavbarForum() {
		Mobile.tap(findTestObject('Object Repository/Forum/btnNavbarForum'), 0)
	}

	@And("Click on the pencil button for create")
	def ClickOnThePencilButtonForCreate() {
		Mobile.tap(findTestObject('Object Repository/Forum/btnCreateForum'), 0)
	}

	@And("Fill in the title")
	def FillInTheTitle() {
		Mobile.tap(findTestObject('Object Repository/Forum/fieldTitleForum'), 0)
		Mobile.setText(findTestObject('Object Repository/Forum/fieldTitleForum'), 'Alternatif Pengganti Pembalut', 0)
		Mobile.hideKeyboard()
	}

	@And("Fill in the question")
	def FillInTheQuestion() {
		Mobile.tap(findTestObject('Object Repository/Forum/fieldBodyForum'), 0)
		Mobile.setText(findTestObject('Object Repository/Forum/fieldBodyForum'), 'Apa Alternatif Pengganti Pembalut?', 0)
		Mobile.hideKeyboard()
	}

	@And("Click Kirim for create Forum")
	def ClickKirimForCreateForum() {
		//		'Get Device Height and Store in device_height variable'
		device_Height = Mobile.getDeviceHeight()

		//		'Get Width Height and Store in device_Width variable'
		device_Width = Mobile.getDeviceWidth()

		//		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width / 2

		//		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = startX

		//		'Storing the startY value'
		int startY = device_Height * 0.30

		//		'Storing the endY value'
		int endY = device_Height * 0.70

		//		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)

		Mobile.tap(findTestObject('Forum/btnKirimCreateForum'), 0)
	}

	@Then("Forum success created")
	def ThenForumSuccessCreated() {
		Mobile.tap(findTestObject('Forum/tabPertanyaanSaya'), 0)
		Mobile.tap(findTestObject('Forum/btnCategoryTerbaru'), 0)
		Mobile.verifyElementVisible(findTestObject('Forum/h1Forum'), 0)
		Mobile.closeApplication()
	}


	@Then("Show warning on title")
	def ShowWarningOnTitle() {
		Mobile.verifyElementVisible(findTestObject('Forum/warningTitleForum'), 0)
		Mobile.closeApplication()
	}




	@And("Click category forum")
	def clickCategoryForum() {
		Mobile.tap(findTestObject('Object Repository/Forum/btnCategoryTerbaru'), 0)
		Mobile.tap(findTestObject('Object Repository/Forum/btnCategoryTerlama'), 0)
		Mobile.tap(findTestObject('Object Repository/Forum/btnCategoryPopuler'), 0)
	}

	@Then("Display forum based on category")
	def displayForumBasedOnCategory() {
		Mobile.verifyElementVisible(findTestObject('Forum/h1Forum'), 0)
		Mobile.closeApplication()
	}

	@And("Click search bar Forum")
	def clickSearchBarForum() {
		Mobile.tap(findTestObject('Forum/searchBarForum'), 0)
	}

	@And("Input the searched word")
	def inputSearchedWord() {
		Mobile.setText(findTestObject('Forum/searchBarForum'), 'penyakit', 0)
	}

	@Then("Displays the searched discussion")
	def displaySearchedDiscussion() {
		Mobile.verifyElementVisible(findTestObject('Forum/h1Forum'), 30)
		Mobile.closeApplication()
	}

	//	@And("Check the anonymous checkbox")
	//	def checkAnonymousCheckbox() {
	//
	//	}




	@And("Click the back button")
	def clickBackButton() {
		Mobile.tap(findTestObject('Forum/btnBackForum'), 0)
	}

	@And("Click the Ya, batal button")
	def clickYaBatalButton() {
		Mobile.tap(findTestObject('Forum/btnYesForum'), 0)
	}

	@Then("Back to forum page")
	def backToForumPage() {
		Mobile.verifyElementVisible(findTestObject('Forum/h1Forum'), 0)
		Mobile.closeApplication()
	}

	@And("Click the Pertanyaan Saya tab")
	def clickPertanyaanSayaTab() {
		Mobile.tap(findTestObject('Forum/tabPertanyaanSaya'), 0)
	}

	@And("Click the category for questions")
	def clickCategoryForQuestions() {
		Mobile.tap(findTestObject('Object Repository/Forum/btnCategoryTerbaru'), 0)
		Mobile.tap(findTestObject('Object Repository/Forum/btnCategoryTerlama'), 0)
		Mobile.tap(findTestObject('Object Repository/Forum/btnCategoryPopuler'), 0)
	}

	@Then("Display my questions based on category")
	def displayMyQuestionsBasedOnCategory() {
		Mobile.verifyElementVisible(findTestObject('Forum/h1Forum'), 0)
		Mobile.closeApplication()
	}

	@Then("Show warning on description")
	def ShowWarningOnDescription() {
		Mobile.verifyElementVisible(findTestObject('Forum/warningDescriptionNull'), 0)
		Mobile.closeApplication()
	}
}