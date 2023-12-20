import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.TouchAction as TouchAction
import org.openqa.selenium.Dimension as Dimension

Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\ReproHealth.apk', true)

Mobile.tap(findTestObject('Login/btnLewati'), 0)

Mobile.tap(findTestObject('Object Repository/Login/btnMasuk'), 0)

Mobile.tap(findTestObject('Login/fieldEmail'), 0)

Mobile.setText(findTestObject('Login/fieldEmail1'), 'muhammadalbert16@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login/fieldPassword'), 0)

Mobile.setText(findTestObject('Login/fieldPassword1'), 'Cobaaja123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/checkboxIngatkanSaya'), 0)

Mobile.tap(findTestObject('Object Repository/Login/btnLogin'), 0)

Mobile.tap(findTestObject('Object Repository/Appointment/btnNavbarAppointment'), 0)

Mobile.tap(findTestObject('Object Repository/Appointment/btnSpecialistKandungan'), 0)

Mobile.tap(findTestObject('Appointment/1stDoctor'), 30)

Mobile.tap(findTestObject('Object Repository/Appointment/btnJadwalkan'), 0)

Mobile.tap(findTestObject('Object Repository/Appointment/btnSesiSiang'), 0)

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

Mobile.tap(findTestObject('Appointment/profilePatientAlbert1'), 0)

Mobile.tap(findTestObject('Object Repository/Appointment/btnSelanjutnya'), 0)

Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Appointment/btnChoosePaymentMethod2'), 0)

Mobile.tap(findTestObject('Object Repository/Appointment/btnTransferManual'), 0)

Mobile.tap(findTestObject('Object Repository/Appointment/btnBayar'), 30)

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

Mobile.tap(findTestObject('Object Repository/Appointment/Receipt1st'), 30)

Mobile.tap(findTestObject('Object Repository/Appointment/btnKirim'), 20)

Mobile.verifyElementVisible(findTestObject('Appointment/msgPaymentConfirmSoon'), 20)

Mobile.closeApplication()

