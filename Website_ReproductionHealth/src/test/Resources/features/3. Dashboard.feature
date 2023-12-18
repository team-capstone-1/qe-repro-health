Feature: Dashboard

As a user
I want to see Dashboard
So that I can display the Dashboard

  Scenario: View monthly doctor data
  Given I am on the Reproduction Dashboard
  When I click button "bulanan"
  Then I should be redirected to monthly doctor data

  Scenario: View weekly doctor data
    Given I am on the Reproduction Dashboard
    When I click button "Mingguan"
    Then I should be redirected to weekly doctor data


  Scenario: View daily doctor data
    Given I am on the Reproduction Dashboard
    When I click button "Harian"
    Then I should be redirected to daily doctor data


  Scenario: view all appointments
    Given I am on the Reproduction Dashboard
    When I click button "Lihat semua"
    Then I should be redirected to appointments page


