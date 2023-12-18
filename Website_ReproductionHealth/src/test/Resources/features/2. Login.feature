Feature: Login

  As a user
  I want to login in my account
  So that I can login with my account and use the feature of the website

  @TC-Login.1
  Scenario: Successfully login
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I enter correct email
    And I enter correct password
    And I click on the login button
    Then I should be redirected to my Reproduction dashboard

  @TC-Login.2
  Scenario: login by entering the wrong email
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I enter invalid email
    And I enter correct password
    And I click on the login button
    Then I can see error message "Email atau password yang anda masukkan salah!"

  @TC-Login.3
  Scenario: The user wants to log in by entering , but not filling in the email
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I enter correct password
    And I click on the login button
    Then I can see error message "Email harus diisi".

  @TC-Login.4
  Scenario: Login using an incorrectly formatted email.
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I input email with the login email not match the email writing format
    And I enter correct password
    And I click on the login button
    Then I can see error message "Email atau password yang anda masukkan salah!"

  @TC-Login.5
  Scenario: The user wants to log in by entering , but not filling in the password
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I enter correct email
    And I click on the login button
    Then I see error message "kata sandi harus diisi"


  @TC-Login.6
  Scenario: login by entering the wrong password
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I enter correct email
    And I enter invalid password
    And I click on the login button
    Then I can see error message "Email atau password yang anda masukkan salah!"

  @TC-Login.7
  Scenario: login by entering invalid email and password
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I enter invalid email
    And I enter invalid password
    And I click on the login button
    Then I can see error message "Email atau password yang anda masukkan salah!"

  @TC-Login.7
  Scenario: Log in by entering a password under 7 characters
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I enter correct email
    And I enter invalid password under 7 characters
    And I click on the login button
    Then I see error message "Kata sandi minimal 8 karakter".

  @TC-Login.8
  Scenario: User does not enter email and password
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I click on the login button
    Then I can see error message "Email harus diisi dan Kata sandi harus diisi!",


    Scenario: changing Password with incorrectly formatted email.
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I click "Lupa Kata sandi"
    And I enter incorrect email Forgot Password
    And I click button send
    Then I can see error message in page Forgot Password "Terjadi kesalahan, pastikan email sudah terdaftar"


  Scenario: Change the password to an unregistered email
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I click "Lupa Kata sandi"
    And I fills in the email with the unregistered email
    And I click button send
    Then I can see error message in page Forgot Password "Terjadi kesalahan, pastikan email sudah terdaftar",

  Scenario: changing Password but not filling in the email
    Given I am on the Reproduction landing page
    When I click button "Pelajari lebih lanjut"
    And I click button "Masuk sebagai dokter"
    And I click "Lupa Kata sandi"
    And I click button send
    Then I can see error message in page Forgot Password1 "Email harus diisi"

