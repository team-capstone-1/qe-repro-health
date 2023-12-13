#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
  I want to use this template for my feature file

	Background: 
		Given open the Reprohealth application
    And click skip button
		And click the login button option
		
  @tag1
  Scenario: Login using valid email & valid password
    When input valid email & valid password
    And click the remember me checkbox
    And click login button
    Then verify success login
    
  Scenario: Login by not check the Ingatkan Saya checkbox
    When input valid email & valid password
    And click login button
    Then verify success login
    
  Scenario: Login with empty field email
    When input empty field email & valid password
    And click the remember me checkbox
    And click login button
    Then shows an alert that email or password invalid

  Scenario: Login with empty field password
    When input valid email & empty field password
    And click the remember me checkbox
    And click login button
    Then shows an alert that email or password invalid

  Scenario: Valid Login with Uppercase Letters in Email
    When input valid email with uppercase letters & valid password
    And click the remember me checkbox
    And click login button
    Then verify success login

  Scenario: Login with only filled space on Email
    When input space on email & valid password
    And click the remember me checkbox
    And click login button
    Then shows an alert that email or password invalid

  Scenario: Login with only filled space on Password
    When input valid email & space on password
    And click the remember me checkbox
    And click login button
    Then shows an alert that email or password invalid

  Scenario: Login with invalid email format (no domain)
    When input invalid email format & valid password
    And click the remember me checkbox
    And click login button
    Then shows an alert that email or password invalid
    
    
    