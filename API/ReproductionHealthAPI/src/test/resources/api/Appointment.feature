Feature: Register
  As an quality engineer
  I want to be able to see all patient appointment
  So that patients can make an appointment with doctor

  Scenario: GET - Get all specialist success
    Given I set GET endpoint all specialist
    When I send GET HTTP request all specialist
    Then I receive response code 200 for get all specialist

  Scenario: GET - Get all specialist invalid endpoint
    Given I set GET all specialist invalid endpoint
    When I send GET HTTP request all specialist invalid endpoint
    Then I receive response code 404 for Get all specialist invalid endpoint

  Scenario: GET - Get all specialist invalid method
    Given I set GET all specialist invalid method
    When I send GET HTTP request all specialist invalid method
    Then I receive response code 405 for Get all specialist invalid method




