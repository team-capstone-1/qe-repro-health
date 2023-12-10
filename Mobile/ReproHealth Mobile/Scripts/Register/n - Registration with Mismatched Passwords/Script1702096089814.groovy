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

Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\ReproHealth2.apk', true)

Mobile.tap(findTestObject('Login/btnLewati'), 0)

Mobile.tap(findTestObject('SignUp/btnSignUpAccount'), 0)

Mobile.tap(findTestObject('Object Repository/SignUp/fieldNameOnSignUp'), 0)

Mobile.setText(findTestObject('SignUp/fieldNameOnSignUp'), 'Aaa1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/SignUp/fieldEmailOnSignUp'), 0)

Mobile.setText(findTestObject('SignUp/fieldEmailOnSignUp'), 'aaa3@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/SignUp/fieldPasswordOnSignUp'), 0)

Mobile.setText(findTestObject('SignUp/fieldPasswordOnSignUp'), 'Aaa111222', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/SignUp/fieldPassConfirmOnSignUp'), 0)

Mobile.setText(findTestObject('SignUp/fieldPassConfirmOnSignUp'), 'Aaa111223', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/SignUp/btnSignUp'), 0)

Mobile.verifyElementVisible(findTestObject('SignUp/warningConfirmPasswordOnSignUp'), 0)

Mobile.closeApplication()
