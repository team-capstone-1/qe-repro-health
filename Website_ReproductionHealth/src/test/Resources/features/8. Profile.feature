Feature: Profile

  As a user
  I want to see Profile
  So that I can display the Profile

  Scenario: look at work experience
    Given I am on the Reproduction Dashboard
    When I click menu profile
    And I click "Pengalaman Kerja"
    Then I have to display work experience

  Scenario: users see education
    Given I am on the Reproduction Dashboard
    When I click menu profile
    And I click "Pendidikan"
    Then I have to display education


  Scenario: the user sees the certification
    Given I am on the Reproduction Dashboard
    When I click menu profile
    And I click "Sertifikat"
    Then I have to display certification


  Scenario: displays certificate details
    Given I am on the Reproduction Dashboard
    When I click menu profile
    And I click "Sertifikat"
    And I click certification
    Then I have to display certificate details


    Scenario: looks for a certificate with a valid Certificate Type
    Given I am on the Reproduction Dashboard
    When I click menu profile
    And I click "Sertifikat"
    And I enters correct keywords in profile "Medical Board Certification"
    Then I have to displays Certification that match the keywords

    Scenario: looks for a certificate with a invalid Certificate Type
      Given I am on the Reproduction Dashboard
      When I click menu profile
      And I click "Sertifikat"
      And I enters incorrect keywords in profile "582647"
      Then I have to displays Certification that match the keywords.