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
Feature: Register
  I want to use this template for my feature file

	Background: 
		Given open Reprohealth application
    And click the skip button
		And click the sign up button option
		
  @tag1
  Scenario: Successful Registration
    When input name
    And input email
    And input password
    And input confirm password
    And click sign up button
    Then verify success sign up

  Scenario: Registration with Blank Fields
and empty confirm password
    When click sign up button1
    Then shows an alert on name

  Scenario: Registration with the symbol in the first letter of the name
    When input symbol in the first letter of name
    And input email
    And input password
    And input confirm password
    And click sign up button
    Then shows an alert on name

  Scenario: Registration with lowercase letters in the first letter of the name
    When input lowercase in first letter of name
    And input email
    And input password
    And input confirm password
    And click sign up button
    Then shows an alert on name

  Scenario: Registration with Existing Email
    When input name
    And input existing email
    And input password
    And input confirm password
    And click sign up button
    Then shows an alert that the email is existing

  Scenario: Registration with Invalid Email Domain
    When input name
    And input invalid email domain
    And input password
    And input confirm password
    And click sign up button
    Then shows an alert on email

  Scenario: Registration with Uppercase Email
    When input name
    And input uppercase email
    And input password
    And input confirm password
    And click sign up button
    Then verify success sign up

  Scenario: Registration with no domain in the Email
    When input name
    And input email without domain
    And input password
    And input confirm password
    And click sign up button
    Then shows an alert on email

  Scenario: Registration with lowercase letters in Password and confirm Password
    When input name
    And input email
    And input lowercase password
    And input lowercase confirm password
    And click sign up button
    Then shows an alert on password

  Scenario: Registration with Mismatched Passwords
    When input name
    And input email
    And input password
    And input mismatched confim password
    And click sign up button
    Then shows an alert on confim password

  Scenario: Registration with Empty Password and confirm Password
    When input name
    And input email
    And input empty password
    And input empty confirm password
    And click sign up button
    Then shows an alert on password

  Scenario: Registration with password and confirm password Less Than 8 Characters
    When input name
    And input email
    And input password less than 8 characters
    And input confirm password less than 8 characters
    And click sign up button
    Then shows an alert on password
