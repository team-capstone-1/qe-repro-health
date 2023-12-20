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



class profileSteps {
//
//	@And("login with registered account")
//	def loginWithRegisteredAccount() {
//		Mobile.tap(findTestObject('Login/fieldEmail'), 0)
//		Mobile.setText(findTestObject('Login/fieldEmail1'), 'muhammadalbert16@gmail.com', 0)
//		Mobile.hideKeyboard()
//		Mobile.tap(findTestObject('Login/fieldPassword'), 0)
//		Mobile.setText(findTestObject('Login/fieldPassword1'), 'Cobaaja123', 0)
//		Mobile.hideKeyboard()
//		Mobile.tap(findTestObject('Object Repository/Login/btnLogin'), 0)
//	}

	@When("Click the bottom navbar Profil")
	def clickBottomNavbarProfil() {
		Mobile.tap(findTestObject('Profile/btnNavbarProfile'), 0)
	}

	@And("Click Profil Saya")
	def ClickProfilSaya() {
		Mobile.tap(findTestObject('Profile/btnMyProfile'), 0)
	}

	@And("Click change")
	def clickChange() {
		Mobile.tap(findTestObject('Profile/btnChangeMyProfile'), 0)
	}

	@And("Input full name")
	def inputFullName() {
		Mobile.tap(findTestObject('Profile/fieldNameMyProfile'), 0)

		Mobile.setText(findTestObject('Profile/fieldNameMyProfile'), 'Inaaa', 0)
	}

	@And("Input phone number")
	def inputPhoneNumber() {

		Mobile.setText(findTestObject('Profile/fieldPhoneMyProfile'), '0812345678111', 0)
	}

	@And("Input birth date")
	def inputBirthDate() {
		Mobile.tap(findTestObject('Profile/fieldBirthDateMyProfile'), 0)

		Mobile.tap(findTestObject('Profile/btnOKBirthDate'), 0)
	}

	@And("Input sex")
	def inputSex() {
		Mobile.tap(findTestObject('Profile/btnSexWomanMyProfile'), 0)
	}

	@And("Input body weight")
	def inputBodyWeight() {
		Mobile.tap(findTestObject('Profile/fieldWeightMyProfile'), 0)

		Mobile.setText(findTestObject('Profile/fieldWeightMyProfile'), '48', 0)

		Mobile.hideKeyboard()
	}

	@And("Input body height")
	def inputBodyHeight() {
		Mobile.tap(findTestObject('Profile/fieldHeightMyProfile'), 0)

		Mobile.setText(findTestObject('Profile/fieldHeightMyProfile'), '160', 0)

		Mobile.hideKeyboard()
	}

	
	
	@And("Empty full name")
	def emptyFullName() {
		Mobile.tap(findTestObject('Profile/fieldNameMyProfile'), 0)
		Mobile.setText(findTestObject('Profile/fieldNameMyProfile'), '', 0)
		Mobile.hideKeyboard()
	}
	
	@And("Empty phone number")
	def emptyPhoneNumber() {
Mobile.tap(findTestObject('Profile/fieldPhoneMyProfile'), 0)
Mobile.setText(findTestObject('Profile/fieldPhoneMyProfile'), '', 0)
Mobile.hideKeyboard()
		
	}
	
	@And("Empty body weight")
	def emptyBodyWeight() {
Mobile.tap(findTestObject('Profile/fieldWeightMyProfile'), 0)

Mobile.setText(findTestObject('Profile/fieldWeightMyProfile'), '', 0)

Mobile.hideKeyboard()
		
	}
	
	@And("Empty body height")
	def emptyBodyHeight() {
Mobile.tap(findTestObject('Profile/fieldHeightMyProfile'), 0)

Mobile.setText(findTestObject('Profile/fieldHeightMyProfile'), '', 0)

Mobile.hideKeyboard()
		
	}
	
	
	@And("Click save to save personal data")
	def ClickSavePersonalData() {
		Mobile.tap(findTestObject('Profile/btnSaveMyProfile'), 0)
	}

	@Then("Successfully changed personal data")
	def verifyPersonalDataChange() {
		Mobile.verifyElementVisible(findTestObject('Profile/h1MyProfile'), 0)
		Mobile.closeApplication()
	}


	@Then("display warning on empty fields")
	def displayWarningOnEmptyFields() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnNameMyProfile'), 0)
		Mobile.closeApplication()
	}

	@Then("display warning on the name field")
	def displayWarningOnNameField() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnNameMyProfile'), 0)
		Mobile.closeApplication()
	}

	@Then("display warning on the phone number field")
	def displayWarningOnPhoneNumberField() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningPhoneMyProfile'), 0)
		Mobile.closeApplication()
	}

	@Then("display warning on the body weight field")
	def displayWarningOnBodyWeightField() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnWeightMyProfile'), 0)
		Mobile.closeApplication()
	}

	@Then("display warning on the body height field")
	def displayWarningOnBodyHeightField() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnHeightMyProfile'), 0)
		Mobile.closeApplication()
	}

	@And("Click on the profile photo icon")
	def clickProfilePhotoIcon() {

		Mobile.tap(findTestObject('Profile/btnProfilePhoto'), 0)
	}

	@And("Chooses the photo method")
	def choosePhotoMethod() {

		Mobile.tap(findTestObject('Profile/btnChooseFromGaleri'), 0)
	}

	@And("Chooses a new photo for the profile")
	def chooseNewProfilePhoto() {

		Mobile.tap(findTestObject('Profile/photo1stMyProfile'), 0)
	}


	@Then("The new photo profile successfully changed")
	def verifyNewProfilePhotoChange() {
		Mobile.verifyElementVisible(findTestObject('Profile/h1MyProfile'), 0)
		Mobile.closeApplication()
	}



	@And("Chooses the profile of the family member to be deleted")
	def chooseProfileToDelete() {
		Mobile.tap(findTestObject('Profile/profileFam3rd'), 0)
	}

	@And("Click Hapus")
	def clickHapus() {
		Mobile.tap(findTestObject('Profile/btnDeleteProfileFam'), 0)

		Mobile.tap(findTestObject('Profile/btnDeleteOptionProfileFam'), 0)
	}

	@Then("The family member profile is successfully deleted")
	def verifyFamilyMemberProfileDeletion() {

		Mobile.verifyElementVisible(findTestObject('Profile/h1ProfileFam'), 0)
		Mobile.closeApplication()
	}




	@And("Click Ubah Kata Sandi")
	def ClickUbahKataSandi() {
		Mobile.tap(findTestObject('Profile/btnChangePassword'), 0)
	}

	@And("Input the password")
	def inputPassword() {
		Mobile.tap(findTestObject('Profile/fieldNewPassword'), 0)
		Mobile.setText(findTestObject('Profile/fieldNewPassword'), 'Cobaaja123', 0)
	}

	@And("Input the confirm password")
	def inputConfirmPassword() {
		Mobile.tap(findTestObject('Profile/fieldConfirmNewPassword'), 0)
		Mobile.setText(findTestObject('Profile/fieldConfirmNewPassword'), 'Cobaaja123', 0)
		Mobile.hideKeyboard()
	}

	@And("Input the confirm password with space")
	def inputConfirmPasswordWithSpace() {
		Mobile.tap(findTestObject('Profile/fieldConfirmNewPassword'), 0)
		Mobile.setText(findTestObject('Profile/fieldConfirmNewPassword'), ' ', 0)
		Mobile.hideKeyboard()
	}

	@Then("The password is successfully changed and is redirected to the login page")
	def verifySuccessfulPassChange() {
		Mobile.verifyElementVisible(findTestObject('Profile/btnNavbarProfile'), 0)
		Mobile.closeApplication()
	}

	@And("Input the password with space")
	def inputPasswordWithSpace() {
		Mobile.tap(findTestObject('Profile/fieldNewPassword'), 0)
		Mobile.setText(findTestObject('Profile/fieldNewPassword'), ' ', 0)
		Mobile.hideKeyboard()
	}

	@Then("The password change fails and a warning appears on the new password field")
	def NewPassFieldWarning() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnNewPass'), 0)
		Mobile.closeApplication()
	}

	@And("Input the mismatched confirm password")
	def inputMismatchedConfirmPassword() {
		Mobile.tap(findTestObject('Profile/fieldConfirmNewPassword'), 0)
		Mobile.setText(findTestObject('Profile/fieldConfirmNewPassword'), 'Coba1234', 0)
		Mobile.hideKeyboard()
	}

	@And("Input the password < 8")
	def inputPasswordLessThan8Chars() {

		Mobile.tap(findTestObject('Profile/fieldNewPassword'), 0)

		Mobile.setText(findTestObject('Profile/fieldNewPassword'), '1234', 0)
	}

	@And("Input the confirm password < 8")
	def inputConfirmPasswordLessThan8Chars() {
		Mobile.tap(findTestObject('Profile/fieldConfirmNewPassword'), 0)
		Mobile.setText(findTestObject('Profile/fieldConfirmNewPassword'), '1234', 0)
		Mobile.hideKeyboard()
	}


	@And("Click Ubah")
	def clickUbah() {

		Mobile.tap(findTestObject('Profile/btnChange'), 0)
	}


	@And("Click Keluarga Saya")
	def clickKeluargaSaya() {
		Mobile.tap(findTestObject('Object Repository/Profile/btnKeluargaSaya'), 0)
	}

	@And("Input member connection")
	def inputMemberConnection() {
		Mobile.tap(findTestObject('Object Repository/Profile/btnDropDownHubunganFam'), 0)

		Mobile.tap(findTestObject('Profile/btnHubAnak'), 0)
	}

	@And("Input member full Name")
	def inputMemberFullName() {
		Mobile.tap(findTestObject('Profile/fieldNameFam'), 0)

		Mobile.setText(findTestObject('Profile/fieldNameFam'), 'Ina', 0)
	}

	@And("Input member phone Number")
	def inputMemberPhoneNumber() {
		Mobile.tap(findTestObject('Profile/fieldPhoneFam'), 0)

		Mobile.setText(findTestObject('Profile/fieldPhoneFam'), '0812345678912', 0)
	}

	@And("Input member birth Date")
	def inputMemberBirthDate() {
		Mobile.tap(findTestObject('Profile/btnBirthDate'), 0)

		Mobile.tap(findTestObject('Profile/btnOKBirthDate'), 0)
	}

	@And("Input member sex")
	def inputMemberSex() {
		Mobile.tap(findTestObject('Profile/btnSexWoman'), 0)
	}

	@And("Input member body Weight")
	def inputMemberBodyWeight() {
		Mobile.tap(findTestObject('Profile/fieldWeight'), 0)

		Mobile.setText(findTestObject('Profile/fieldWeight'), '60', 0)

		Mobile.hideKeyboard()
	}

	@And("Input member body Height")
	def inputMemberBodyHeight() {
		Mobile.tap(findTestObject('Profile/fieldHeight'), 0)
		Mobile.setText(findTestObject('Profile/fieldHeight'), '163', 0)
		Mobile.hideKeyboard()
	}





	@And("Click Tambah Profil")
	def clickTambahProfil() {
		Mobile.tap(findTestObject('Object Repository/Profile/btnTambahProfilFam'), 0)
	}

	@And("Click Simpan")
	def clickSimpan() {
		Mobile.tap(findTestObject('Profile/btnSaveProfileFam'), 0)
	}

	@Then("Successfully added family member profile")
	def verifyAddedFamilyMemberProfile() {
		Mobile.verifyElementVisible(findTestObject('Profile/h1ProfileFam'), 0)
		Mobile.closeApplication()
	}

	@Then("Display warning on family empty fields")
	def displayWarningOnFamEmptyFields() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnNameFam'), 0)
		Mobile.closeApplication()
	}

	@Then("Display warning on family name field")
	def displayWarningOnFamilyNameField() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnNameFam'), 0)
		Mobile.closeApplication()
	}

	@Then("Display warning on family phone number field")
	def displayWarningOnFamilyPhoneNumberField() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnPhoneFam'), 0)
		Mobile.closeApplication()
	}

	@Then("Display warning on family body weight field")
	def displayWarningOnFamilyBodyWeightField() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnWeightFam'), 0)
		Mobile.closeApplication()
	}

	@Then("Display warning on family body height field")
	def displayWarningOnFamilyBodyHeight() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnHeightFam'), 0)
		Mobile.closeApplication()
	}


	@Then("Change password failed and warning on new password field")
	def NewPasswordFieldWarning() {
		Mobile.verifyElementVisible(findTestObject('Profile/h1ChangePassword'), 0)
		Mobile.closeApplication()
	}

	@Then("Change password failed and warning on confirm password")
	def ConfirmPasswordFieldWarning() {
		Mobile.verifyElementVisible(findTestObject('Profile/warningOnConfirmNewPass'), 0)
		Mobile.closeApplication()
	}

	@Then("Warning that password mismatched")
	def WarningPassMismatched() {
		Mobile.verifyElementVisible(findTestObject('Profile/h1ChangePassword'), 0)
		Mobile.closeApplication()
	}




	@And("Click Tentang Kami")
	def clickTentangKami() {
		Mobile.tap(findTestObject('Profile/btnAboutUs'), 0)
	}

	@Then("Display information about us ReproHealth")
	def displayReproHealthInfo() {

		Mobile.verifyElementVisible(findTestObject('Profile/verifyH1AboutUs'), 0)
		Mobile.closeApplication()
	}

	@And("Click Pusat Bantuan")
	def clickPusatBantuan() {
		Mobile.tap(findTestObject('Profile/btnHelpCenter'), 0)
	}

	@And("Click Pertanyaan Populer")
	def clickPertanyaanPopuler() {
		Mobile.tap(findTestObject('Profile/btnFAQ'), 0)
	}

	@And("Click Janji Temu")
	def clickJanjiTemu() {
		Mobile.tap(findTestObject('Profile/btnFAQAppointment'), 0)
	}

	@And("Choose an appointment question")
	def chooseAppointmentQuestion() {
		Mobile.tap(findTestObject('Profile/btnFAQAppointmentQ1'), 0)
	}

	@Then("Display help center information on popular questions on appointment")
	def displayHelpCenterAppointmentInfo() {
		Mobile.verifyElementVisible(findTestObject('Profile/VerifyFAQAppointmentQ1'), 0)
		Mobile.closeApplication()
	}

	@And("Click Artikel")
	def clickArtikel() {
		Mobile.tap(findTestObject('Profile/btnFAQArticle'), 0)
	}

	@And("Choose an article question")
	def chooseArticleQuestion() {
		Mobile.tap(findTestObject('Profile/btnFAQArticleQ1'), 0)
	}

	@Then("Display help center information on popular questions on articles")
	def displayHelpCenterArticlesInfo() {
		Mobile.verifyElementVisible(findTestObject('Profile/verifyFAQArticleQ1'), 0)
		Mobile.closeApplication()
	}

	@And("Click Forum")
	def clickForum() {
		Mobile.tap(findTestObject('Profile/btnFAQForum'), 0)
	}

	@And("Choose a forum question")
	def chooseForumQuestion() {
		Mobile.tap(findTestObject('Profile/btnFAQForumQ1'), 0)
	}

	@Then("Display help center information on popular questions on forum")
	def displayHelpCenterForumInfo() {
		Mobile.verifyElementVisible(findTestObject('Profile/verifyFAQForumQ1'), 0)
		Mobile.closeApplication()
	}

	@And("Click History Transaction")
	def clickHistoryTransaction() {
		Mobile.tap(findTestObject('Profile/btnFAQHistoryTrans'), 0)
	}


	@And("Choose a history transaction question")
	def chooseHistoryTransactionQuestion() {
		Mobile.tap(findTestObject('Profile/btnFAQHistoryTransQ1'), 0)
	}

	@Then("Display help center information on popular questions on History Transaction")
	def displayHelpCenterHistoryTransactionInfo() {
		Mobile.verifyElementVisible(findTestObject('Profile/verifyFAQHistoryTransQ1'), 0)
		Mobile.closeApplication()
	}


	@And("Click Profile")
	def clickProfile() {
		Mobile.tap(findTestObject('Profile/btnFAQProfile'), 0)
	}

	@And("Choose a profile question")
	def chooseProfileQuestion() {
		Mobile.tap(findTestObject('Profile/btnFAQProfileQ1'), 0)
	}

	@Then("Display help center information on popular questions on profile")
	def displayHelpCenterProfileInfo() {
		Mobile.verifyElementVisible(findTestObject('Profile/verifyFAQProfileQ1'), 0)
		Mobile.closeApplication()
	}












	@And("Click Ketentuan Penggunaan")
	def clickKetentuanPenggunaan() {
		Mobile.tap(findTestObject('Profile/btnTermsofUse'), 0)
	}



	@Then("Display ReproHealth terms of use information")
	def displayTermsOfUseInfo() {
		Mobile.verifyElementVisible(findTestObject('Profile/verifyH1TermsofUse'), 0)
	}

	@And("Click Kebijakan Privasi")
	def clickKebijakanPrivasi() {
		Mobile.tap(findTestObject('Profile/btnPrivacyPolicy'), 0)
	}

	@Then("Display ReproHealth privacy policy information")
	def displayPrivacyPolicyInfo() {
		Mobile.verifyElementVisible(findTestObject('Profile/verifyH1PrivacyPolicy'), 0)
	}



	@And("Click Reprohealth Assistant")
	def clickReprohealthAssistant() {
		Mobile.tap(findTestObject('Profile/btnReproAssistant'), 0)
	}

	@And("Input question")
	def inputQuestion() {
		Mobile.tap(findTestObject('Profile/fieldQuestionAIAssistant'), 0)

		Mobile.setText(findTestObject('Profile/fieldQuestionAIAssistant'), 'Apa ciri-ciri menstruasi?', 0)

		Mobile.hideKeyboard()
	}

	@And("Click Send for create question")
	def clickSendForCreateQuestion() {
		Mobile.tap(findTestObject('Profile/btnSendAIAssistant'), 0)
	}

	@Then("Successfully create new question and display the answer to the question")
	def successfullyCreateAndDisplayAnswer() {
		Mobile.verifyElementVisible(findTestObject('Profile/h1ReproAssistant'), 0)
	}



	@And("Choose category")
	def chooseCategory() {
		Mobile.tap(findTestObject('Profile/btnAIJanjiTemu'), 0)
	}







	@Then("Successfully send email questions to the help center on the appointment")
	def successfullySendEmail() {
		Mobile.verifyElementVisible(findTestObject('Profile/btnSendEmail'), 0)
	}
}