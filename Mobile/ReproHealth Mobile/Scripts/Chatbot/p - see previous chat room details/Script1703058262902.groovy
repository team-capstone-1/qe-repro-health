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

Mobile.tap(findTestObject('Forum/btnNavbarForum'), 0)

Mobile.tap(findTestObject('Chatbot/btnChatbotAI'), 0)

Mobile.tap(findTestObject('Chatbot/btnYesChatbotAI'), 0)

Mobile.tap(findTestObject('Chatbot/1stQuestionAtChatbotAI'), 0)

Mobile.verifyElementVisible(findTestObject('Chatbot/h1ReproAssistChatbotAI'), 20)

Mobile.closeApplication()

