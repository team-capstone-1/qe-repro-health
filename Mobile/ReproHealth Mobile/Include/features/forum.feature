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
# (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#
## (Comments)
#Sample Feature Definition Template

Feature: Forum
  I want to use this template for my feature file

  Background: 
    Given open the Reprohealth application
    And click skip button
    And click the login button option
    And login with registered account
       
  Scenario: view forums based on category (terbaru terlama terpopuler)
    When Click the bottom navbar Forum
    And Click category forum
    Then Display forum based on category
    
  Scenario: search a discussion
    When Click the bottom navbar Forum
    And Click search bar Forum
    And Input the searched word
    Then Displays the searched discussion
    
  Scenario: create new forum not anonymous
    When Click the bottom navbar Forum
    And Click on the pencil button for create
    And Fill in the title 
    And Fill in the question
    And Click Kirim for create Forum
    Then Forum success created
    
  #Scenario: create new forum as anonymous
    #When Click the bottom navbar Forum
    #And Click on the pencil button for create
    #And Fill in the title 
    #And Fill in the question
    #And Check the anonymous checkbox
    #And Click Kirim for create Forum
    #Then Forum success created
      
  Scenario: create new forum with empty title
    When Click the bottom navbar Forum
    And Click on the pencil button for create
    And Fill in the question
    And Click Kirim for create Forum
    Then Show warning on title
  
  Scenario: create new forum with empty description
    When Click the bottom navbar Forum
    And Click on the pencil button for create
    And Fill in the title
    And Click Kirim for create Forum
    Then Show warning on description
    
  Scenario: cancel creating a forum
    When Click the bottom navbar Forum
    And Click on the pencil button for create
    And Fill in the title
    And Fill in the question
    And Click the back button
    And Click the Ya, batal button
    Then Back to forum page

  Scenario: my questions based on category (terbaru terlama terpopuler)
    When Click the bottom navbar Forum
    And Click the Pertanyaan Saya tab
    And Click the category for questions
    Then Display my questions based on category
  
  