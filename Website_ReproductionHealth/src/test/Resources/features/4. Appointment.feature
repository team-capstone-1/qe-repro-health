Feature: Appointment

  As a user
  I want to see Appointment
  So that I can display the Appointment

  Scenario: Appointment search was successful
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I enter correct keywoards
    Then I should be redirected to my detail pasien


  Scenario: User searches for appointments with keywords that do not exist in the system
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I enter incorrect keywoards
    Then I should be display no data

  Scenario: The user wants to see a list of appointments based on Menunggu status
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click fillter
    And I click "menunggu"
    Then I should be displays a list of appointments based on Menunggu status

  Scenario: Users want to see a list of appointments based on Berjalan status
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click fillter
    And I click "Berjalan"
    Then I should be displays a list of appointments based on Berjalan status

  Scenario: The user wants to see a list of appointments based on Dibatalkan status
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click fillter
    And I click "Dibatalkan"
    Then I should be displays a list of appointments based on Dibatalkan status

  Scenario: Users want to see a list of appointments based on selesai status
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click fillter
    And I click "selesai"
    Then I should be displays a list of appointments based on Selesai status


    Scenario: Users want to see transaction details
      Given I am on the Reproduction Dashboard
      When I click menu "janji temu"
      And I click patient name
      And I click "bukti transaksi"
      Then I should be displays transaction details

  Scenario: Users want to see proof of transfer in patient details
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click patient name
    And I click "bukti transaksi"
    And I click picture
    Then I should be displays proof of patient transfer


  Scenario: change the status on the appointment list to "sedang berjalan"
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click patient name with waiting status
    And I click Button "Konfirmasi sekarang"
    And I clicks button "Ya, Saya yakin"
    Then I can see success message "Janji temu telah di konfirmasi!"
#
  Scenario: change the status on the appointment list to "selesai"
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click patient name with status "Berjalan"
    And I click Button "Konfirmasi sekarang"
    And I clicks button "Ya, Saya yakin"
    Then I can see success message "Janji temu selesai"..


  Scenario: see next appointment list slide
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click next appointment list number
    Then I should be display next appointment slide


  Scenario: change status on appointment list to "in progress" failed
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I clicks on the name of the patient with waiting status
    And I click Button "Konfirmasi sekarang"
    And I clicks button "Tidak, batalkan"
    Then I should be stay on the appointment page


  Scenario: Users want to see patient names alphabetically at the top
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click button triangle top on name patient
    Then I should be displays a list of patient names in order from letters A-Z

  Scenario: Users want to see patient names alphabetically at the down
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click button triangle down on name patient
    Then I should be displays a list of patient names in order from letters Z-A

  Scenario: Users want to see the order number based on the highest value
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click button triangle top on no.urut
    Then I should be displays the appointment number in order from the highest value


  Scenario: Users want to see the order number based on the lowest value
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I click button triangle down on no.urut
    Then I should be displays appointment no. Sort appointments from lowest value


  Scenario: see patients with morning session
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I clicks the filter button
    And I clicks morning
    And I clicks the button OK
    Then I should be shows the patient with a morning session


  Scenario: seeing patients with afternoon sessions
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I clicks the filter button
    And I click during the day
    And I clicks the button OK
    Then I should be shows patients with afternoon sessions


  Scenario: seeing patients with evening sessions
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I clicks the filter button
    And I click at evening
    And I clicks the button OK
    Then I should be shows patients with evening sessions


  Scenario: reset selected session filters
    Given I am on the Reproduction Dashboard
    When I click menu "janji temu"
    And I clicks the filter button
    And I click at morning, afternoon, evening
    And clicks the reset button
    Then I successfully reset selected session filters