Feature: Logout

  As a user
  I want to Logout in my account
  So that I can Logout with my account


  Scenario: Successfully logout
    Given I am on the Reproduction Dashboard
    When I click button "Keluar"
    And I click "Ya, saya keluar"
    Then I should be redirected to my landingpage


  Scenario: failed to logout
    Given I am on the Reproduction Dashboard
    When I click button "Keluar"
    And I click button  "Tidak, Batalkan"
    Then I should be stay in dashboard
