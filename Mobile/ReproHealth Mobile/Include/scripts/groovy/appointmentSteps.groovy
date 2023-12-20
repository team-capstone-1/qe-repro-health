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



class appointmentSteps {
	@When("Clicks the bottom navbar Janji Temu")
	def ClicksNavbarJanjiTemu() {
		Mobile.tap(findTestObject('Object Repository/Appointment/btnNavbarAppointment'), 0)
	}

	@And("Choose and click one of the specialists")
	def clickOneSpecialists() {
		Mobile.tap(findTestObject('Object Repository/Appointment/btnSpecialistKandungan'), 0)
	}

	@Then("display list doctor")
	def displayListDoctor() {
		Mobile.verifyElementVisible(findTestObject('Appointment/1stDoctor'), 30)
		Mobile.closeApplication()
	}

	@And("choose and click doctor")
	def ChooseClickDoctor() {

		Mobile.tap(findTestObject('Appointment/1stDoctor'), 30)
	}

	@And("Click Jadwalkan")
	def ClickJadwalkan() {
		Mobile.tap(findTestObject('Object Repository/Appointment/btnJadwalkan'), 0)
	}

	@And("Set date appointment and session")
	def SetDateAppointmentSession() {
		Mobile.tap(findTestObject('Object Repository/Appointment/btnSesiSiang'), 0)
	}

	@And("Click Lanjut ke data pemesanan")
	def ClickLanjutKeDataPemesanan() {

		'Get Device Height and Store in device_height variable'
		device_Height = Mobile.getDeviceHeight()

		'Get Width Height and Store in device_Width variable'
		device_Width = Mobile.getDeviceWidth()

		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width / 2

		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = startX

		'Storing the startY value'
		int startY = device_Height * 0.30

		'Storing the endY value'
		int endY = device_Height * 0.70

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)

		Mobile.tap(findTestObject('Appointment/btnLanjutKeDataPemesanan1'), 0)
	}

	@And("Click patient profile")
	def ClickPatientProfile() {
		Mobile.tap(findTestObject('Appointment/profilePatientAlbert1'), 0)
	}

	@And("Click Selanjutnya")
	def ClickSelanjutnya() {
		Mobile.tap(findTestObject('Object Repository/Appointment/btnSelanjutnya'), 0)
	}

	@And("Click Pilih Metode Pembayaran")
	def ClickPilihMetodePembayaran() {

		'Get Device Height and Store in device_height variable'
		device_Height = Mobile.getDeviceHeight()

		'Get Width Height and Store in device_Width variable'
		device_Width = Mobile.getDeviceWidth()

		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width / 2

		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = startX

		'Storing the startY value'
		int startY = device_Height * 0.30

		'Storing the endY value'
		int endY = device_Height * 0.70

		Mobile.swipe(startX, endY, endX, startY)

		Mobile.tap(findTestObject('Appointment/btnChoosePaymentMethod2'), 0)
	}

	@And("Click payment method Transfer Manual")
	def ClickPaymentTransferManual() {
		Mobile.tap(findTestObject('Object Repository/Appointment/btnTransferManual'), 0)
	}

	@And("Click bayar")
	def ClickBayar() {
		Mobile.tap(findTestObject('Object Repository/Appointment/btnBayar'), 30)
	}

	@And("Confirm payment")
	def ConfirmPayment() {
		Mobile.tap(findTestObject('Object Repository/Appointment/fieldNamePayment'), 0)
		Mobile.setText(findTestObject('Object Repository/Appointment/fieldNamePayment'), 'Albert', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Object Repository/Appointment/fieldBank'), 0)
		Mobile.tap(findTestObject('Object Repository/Appointment/BankBCA'), 0)
		Mobile.tap(findTestObject('Object Repository/Appointment/fieldAccountNumber'), 0)
		Mobile.setText(findTestObject('Object Repository/Appointment/fieldAccountNumber'), '111222333', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Object Repository/Appointment/fieldReceipt'), 0)
		Mobile.tap(findTestObject('Object Repository/Appointment/btnChooseFromGaleri'), 30)
		Mobile.tap(findTestObject('Object Repository/Appointment/Receipt1st'), 20)
	}

	@And("Click Kirim")
	def ClickKirim() {
		Mobile.tap(findTestObject('Object Repository/Appointment/btnKirim'), 20)
	}

	@And("show payment confirmed immediately")
	def ShowPaymentConfirmedImmediately() {
		Mobile.verifyElementVisible(findTestObject('Appointment/msgPaymentConfirmSoon'), 20)
		Mobile.closeApplication()
	}


	@Then("Display the searched specialist")
	def displaySearchedSpecialist() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Appointment/resultSearchHompage'), 0)
		Mobile.closeApplication()
	}

	@And("Click Lihat Semua based on specialist")
	def clickLihatSemua() {
		Mobile.tap(findTestObject('Object Repository/Appointment/LihatSemuaSpecialist'), 0)
	}

	@Then("Display all specialists")
	def displayAllSpecialists() {
		Mobile.verifyElementVisible(findTestObject('Appointment/h1Specialist'), 0)
		Mobile.closeApplication()
	}

	@Then("Display doctor details")
	def displayDoctorDetails() {
		Mobile.verifyElementVisible(findTestObject('Appointment/verifyDetailDoctor'), 0)
		Mobile.closeApplication()
	}

	@And("Click on one of the specialists")
	def clickOnSpecialist() {
		Mobile.tap(findTestObject('Object Repository/Appointment/btnSpecialistKandungan'), 0)
	}

	@And("Choose and click clinic")
	def chooseAndClickClinic() {
		Mobile.tap(findTestObject('Appointment/btnClinics'), 0)
	}

	@Then("Display clinic details")
	def displayClinicDetails() {
		Mobile.verifyElementExist(findTestObject('Appointment/detailClinic'), 0)
		Mobile.closeApplication()
	}


	@And("Click Cari Lokasi")
	def clickCariLokasi() {
		Mobile.tap(findTestObject('Appointment/btnLocation'), 0)
	}

	@And("Click search bar")
	def clickSearchBar() {
		Mobile.tap(findTestObject('Appointment/searchBarLocation'), 30)
	}

	@And("Input the searched location")
	def inputSearchedLocation() {
		Mobile.setText(findTestObject('Appointment/searchBarLocation'), 'Tanah Abang', 0)
	}



	@Then("Display the searched location")
	def displaySearchedLocation() {
		Mobile.verifyElementVisible(findTestObject('Appointment/verifyLocationResult'), 0)
		Mobile.closeApplication()
	}

	@And("Input invalid searched location")
	def inputInvalidSearchedLocation() {
		Mobile.setText(findTestObject('Appointment/searchBarLocation'), 'Bandara Ngurah Rai', 0)
		Mobile.hideKeyboard()
	}

	@Then("Display search not found")
	def displaySearchNotFound() {
		Mobile.verifyElementVisible(findTestObject('Appointment/msgLocationNotFound'), 0)
		Mobile.closeApplication()
	}

	@And("Click Back until homepage")
	def clickBackUntilHomepage() {
		Mobile.tap(findTestObject('Profile/btnBackReproAssistant'), 0)
		Mobile.tap(findTestObject('Profile/btnBackReproAssistant'), 0)
		Mobile.tap(findTestObject('Profile/btnBackReproAssistant'), 0)
		Mobile.tap(findTestObject('Profile/btnBackReproAssistant'), 0)
		Mobile.tap(findTestObject('Profile/btnBackReproAssistant'), 0)
	}

	@And("Click btn Navbar History Transaction")
	def clickHistoryTransaction() {
		Mobile.tap(findTestObject('Appointment/btnNavbarHistoryTransaction'), 0)
	}

	@Then("Show payment is pending")
	def showPaymentIsPending() {
		Mobile.verifyElementVisible(findTestObject('Appointment/h1HistoryTransaction'), 0)
		Mobile.closeApplication()
	}

	@And("Click payment method Pay at Clinic")
	def clickPaymentMethodPayAtClinic() {
		Mobile.tap(findTestObject('Appointment/btnPayAtClinic'), 0)
	}

	@Then("Warning that must choose a session")
	def warningChooseSession() {
		Mobile.verifyElementVisible(findTestObject('Appointment/msgSessionNull'), 20)
		Mobile.closeApplication()
	}

	@Then("Warning that must choose a payment")
	def warningChoosePayment() {
		Mobile.verifyElementVisible(findTestObject('Appointment/msgPaymentMethodNull'), 20)
		Mobile.closeApplication()
	}
}