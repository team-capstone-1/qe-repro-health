Feature: Landingpage

As a user
I want to see Landing Pages
So that I can display the Landing Page


Scenario: view the ReproHealth home menu
  Given I am on the Reproduction
  When I click on the home
  Then I should be redirected to home Reproduction

  Scenario: view the ReproHealth about me menu
    Given I am on the Reproduction
    When I click on the about
    Then I should be redirected to about Reproduction

  Scenario: view the ReproHealth service menu
    Given I am on the Reproduction
    When I click on the service
    Then I should be redirected to service Reproduction

  Scenario: view the ReproHealth benefits menu
    Given I am on the Reproduction
    When I click on the benefit
    Then I should be redirected to benefit Reproduction


  Scenario: see user requirements
    Given I am on the Reproduction
    When I click on the ketentuan Pengguna
    Then I should be redirected to ketentuan Pengguna Reproduction


  Scenario: see privacy policy
    Given I am on the Reproduction
    When I click on the kebijakan Privasi
    Then I should be redirected to kebijakan Privasi Reproduction

  Scenario: see questions in the FAQ
    Given I am on the Reproduction
    When I click on the FAQ
    Then I should be redirected to FAQ Reproduction

  Scenario: displays answers to questions in the FAQ
    Given I am on the Reproduction
    When I click on the FAQ
    And i click dropdown pada pertanyaan
    Then I should be redirected to FAQ Reproduction

  Scenario: displays the doctor's page
    Given I am on the Reproduction
    When I click button "Pelajari lebih lanjut"
    Then I should be redirected to doctor's page


  Scenario: ask questions on the FAQ menu
    Given I am on the Reproduction
    When I click button "Pelajari lebih lanjut"
    And I click button "Hubungi Kami"
    Then I should be redirected to email