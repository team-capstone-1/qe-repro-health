#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#When: Some precondition step
#And: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more When,And,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
# (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Profile Patient
  I want to use this template for my feature file

  Background: 
    Given open the Reprohealth application
    And click skip button
    And click the login button option
    And login with registered account



  #Scenario: change personal data
    #When Click the bottom navbar Profil
    #And Click Profil Saya
    #And Click change
    #And Input full name
    #And Input phone number
    #And Input birth date
    #And Input sex
    #And Input body weight
    #And Input body height
    #And Click save to save personal data
    #Then Successfully changed personal data

  #Scenario: change personal data with empty data
    #When Click the bottom navbar Profil
    #And Click Profil Saya
    #And Click change
    #And Empty full name
    #And Empty phone number
    #And Empty body weight
    #And Empty body height
    #And Click save to save personal data
    #Then display warning on empty fields

  #Scenario: change personal data with empty full name
    #When Click the bottom navbar Profil
    #And Click Profil Saya
    #And Click change
    #And Empty full name
    #And Click save to save personal data
    #Then display warning on the name field
  @tag1
  Scenario: change personal data with empty cell phone number
    When Click the bottom navbar Profil
    And Click Profil Saya
    And Click change    
    And Empty phone number
    And Click save to save personal data
    Then display warning on the phone number field

  #Scenario: change personal data with empty body weight
    #When Click the bottom navbar Profil
    #And Click Profil Saya
    #And Click change
    #And Empty body weight
    #And Click save to save personal data
    #Then display warning on the body weight field
#
  #Scenario: change personal data with empty body height
    #When Click the bottom navbar Profil
    #And Click Profil Saya
    #And Click change
    #And Empty body height
    #And Click save to save personal data
    #Then display warning on the body height field
#
  #Scenario: change profile photo
    #When Click the bottom navbar Profil
    #And Click Profil Saya
    #And Click on the profile photo icon
    #And Chooses the photo method
    #And Chooses a new photo for the profile
    #Then The new photo profile successfully changed

  #Scenario: add family member profile
    #When Click the bottom navbar Profil
    #And Click Keluarga Saya
    #And Click Tambah Profil
    #And Input member connection
    #And Input member full Name
    #And Input member phone Number
    #And Input member birth Date
    #And Input member sex
    #And Input member body Weight
    #And Input member body Height
    #And Click Simpan
    #Then Successfully added family member profile

	#Failed On Manual Testing
  #Scenario: add family member profiles with empty data
    #When Click the bottom navbar Profil
    #And Click Keluarga Saya
    #And Click Tambah Profil
    #And Click Simpan
    #Then Display warning on family empty fields 
#
  #Scenario: add family member profiles with empty full name
    #When Click the bottom navbar Profil
    #And Click Keluarga Saya
    #And Click Tambah Profil
    #And Input member connection
    #And Input member phone Number
    #And Input member birth Date
    #And Input member sex
    #And Input member body Weight
    #And Input member body Height
    #And Click Simpan
    #Then Display warning on family name field 
#
  #Scenario: add family member profiles with empty cell phone number
    #When Click the bottom navbar Profil
    #And Click Keluarga Saya
    #And Click Tambah Profil
    #And Input member connection
    #And Input member full Name
    #And Input member birth Date
    #And Input member sex
    #And Input member body Weight
    #And Input member body Height
    #And Click Simpan
    #Then Display warning on family phone number field
#
  #Scenario: add family member profiles with empty body weight
    #When Click the bottom navbar Profil
    #And Click Keluarga Saya
    #And Click Tambah Profil
    #And Input member connection
    #And Input member full Name
    #And Input member phone Number
    #And Input member birth Date
    #And Input member sex
    #And Input member body Height
    #And Click Simpan
    #Then Display warning on family body weight field
#
  #Scenario: add family member profiles with empty body height
    #When Click the bottom navbar Profil
    #And Click Keluarga Saya
    #And Click Tambah Profil
    #And Input member connection
    #And Input member full Name
    #And Input member phone Number
    #And Input member birth Date
    #And Input member sex
    #And Input member body Weight
    #And Click Simpan
    #Then Display warning on family body height field
#
  #Scenario: delete family member profile
    #When Click the bottom navbar Profil
    #And Click Keluarga Saya
    #And Chooses the profile of the family member to be deleted
    #And Click Hapus
    #Then The family member profile is successfully deleted

  Scenario: Successfully changed password
    When Click the bottom navbar Profil
    And Click Ubah Kata Sandi
    And Input the password
    And Input the confirm password
    And Click Ubah
    Then The password is successfully changed and is redirected to the login page
#
  #Scenario: Change password with only filled space on new password
    #When Click the bottom navbar Profil
    #And Click Ubah Kata Sandi
    #And Input the password with space
    #And Input the confirm password
    #And Click Ubah
    #Then Warning that password mismatched
#
  #Scenario: Change password with empty new password
    #When Click the bottom navbar Profil
    #And Click Ubah Kata Sandi
    #And Input the password
    #And Input the confirm password
    #And Click Ubah
    #Then Change password failed and warning on new password field

  #Scenario: Change password with empty confirm password
    #When Click the bottom navbar Profil
    #And Click Ubah Kata Sandi
    #And Input the password
    #And Input the confirm password
    #And Click Ubah
    #Then Change password failed and warning on confirm password
#
  #Scenario: Change password with only filled space on confirm password
    #When Click the bottom navbar Profil
    #And Click Ubah Kata Sandi
    #And Input the password
    #And Input the confirm password with space
    #And Click Ubah
    #Then Change password failed and warning on confirm password

  #Scenario: Change password with mismatched passwords
    #When Click the bottom navbar Profil
    #And Click Ubah Kata Sandi
    #And Input the password
    #And Input the mismatched confirm password
    #And Click Ubah
    #Then Warning that password mismatched

  #Scenario: Change password less than 8 characters
    #When Click the bottom navbar Profil
    #And Click Ubah Kata Sandi
    #And Input the password < 8
    #And Input the confirm password < 8
    #And Click Ubah
    #Then Change password failed and warning on confirm password

  #Scenario: View information about us ReproHealth
    #When Click the bottom navbar Profil
    #And Click Tentang Kami
    #Then Display information about us ReproHealth
#
  #Scenario: View help center information on popular questions on appointments
    #When Click the bottom navbar Profil
    #And Click Pusat Bantuan
    #And Click Pertanyaan Populer
    #And Click Janji Temu
    #And Choose an appointment question
    #Then Display help center information on popular questions on appointment
#
  #Scenario: View help center information on popular questions on articles
    #When Click the bottom navbar Profil
    #And Click Pusat Bantuan
    #And Click Pertanyaan Populer
    #And Click Artikel
    #And Choose an article question
    #Then Display help center information on popular questions on articles
#
  #Scenario: View help center information on popular questions on forum
    #When Click the bottom navbar Profil
    #And Click Pusat Bantuan
    #And Click Pertanyaan Populer
    #And Click Forum
    #And Choose a forum question
    #Then Display help center information on popular questions on forum
#
  #Scenario: View help center information on popular questions on history transaction
    #When Click the bottom navbar Profil
    #And Click Pusat Bantuan
    #And Click Pertanyaan Populer
    #And Click History Transaction
    #And Choose a history transaction question
    #Then Display help center information on popular questions on History Transaction
#
  #Scenario: View help center information on popular questions on profile
    #When Click the bottom navbar Profil
    #And Click Pusat Bantuan
    #And Click Pertanyaan Populer
    #And Click Profile
    #And Choose a profile question
    #Then Display help center information on popular questions on profile
#
  #Scenario: Send email questions to the help center on the appointment
    #When Click the bottom navbar Profil
    #And Click Pusat Bantuan
    #And Click Pertanyaan Populer
    #And Click Janji Temu
    #And Choose an appointment question
    #Then Successfully send email questions to the help center on the appointment
#
  #Scenario: Create new questions on Reprohealth Assistant
    #When Click the bottom navbar Profil
    #And Click Pusat Bantuan
    #And Click Reprohealth Assistant
    #And Input question
    #And Click Send for create question
    #Then Successfully create new question and display the answer to the question
#
  #Scenario: Choose category question
    #When Click the bottom navbar Profil
    #And Click Pusat Bantuan
    #And Click Reprohealth Assistant
    #And Choose category
    #Then Successfully create new question and display the answer to the question
#
  #Scenario: View ReproHealth terms of use information
    #When Click the bottom navbar Profil
    #And Click Ketentuan Penggunaan
    #Then Display ReproHealth terms of use information
#
  #Scenario: View ReproHealth privacy policy information
    #When Click the bottom navbar Profil
    #And Click Kebijakan Privasi
    #Then Display ReproHealth privacy policy information
