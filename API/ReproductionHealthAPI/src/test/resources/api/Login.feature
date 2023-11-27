Feature: Authentication
  As an quality engineer
  I want to be able to authenticate my account
  So that I can access all the features

  Scenario: POST - Successful Login
    Given I set POST endpoints Login
    When I send POST HTTP request Login
    Then I receive response code 200 Login

  Scenario: POST - Login invalid endpoint
    Given I set POST Login invalid endpoint
    When I send POST HTTP request Login invalid endpoint
    Then I receive response code 404 for Login invalid endpoint

  Scenario: POST - Login invalid method
    Given I set POST Login invalid method
    When I send POST HTTP request Login invalid method
    Then I receive response code 405 for Login invalid method

  Scenario: POST - Login invalid payload
    Given I set POST Login invalid payload
    When I send POST HTTP request Login invalid payload
    Then I receive response code 400 for Login invalid payload





