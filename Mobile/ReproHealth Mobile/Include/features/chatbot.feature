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
Feature: Chatbot AI
  I want to use this template for my feature file

  Background: 
    Given open the Reprohealth application
    And click skip button
    And click the login button option
    And login with registered account
    
  @tag1
  Scenario: open chatbot
    When Click Forum on navbar
    And Click chatbot icon
    Then Displays the chatbot page

  Scenario: create new questions to the chatbot
    When Click Forum on navbar
    And Click chatbot icon
    And Click Buat pesan baru
    And Input the question
    And Click send to create new question
    Then Successfully create new question

  Scenario: create new questions empty question
    When Click Forum on navbar
    And Click chatbot icon
    And Click Buat pesan baru
    And Input the question
    And Click send to create new question
    Then Unable to create questions

  Scenario: create new questions only filled space on question
    When Click Forum on navbar
    And Click chatbot icon
    And Click Buat pesan baru
    And Input the question
    And Click send to create new question
    Then Unable to create questions

  Scenario: see previous chat room details
    When Click Forum on navbar
    And Click chatbot icon
    And Choose and click one of the questions
    Then Display see previous chat room details
