Feature: My Schedule

As a user
I want to see My Schedule
So that I can display the My Schedule


  Scenario: displays all my schedules for the last month
    Given I am on the Reproduction Dashboard
    When I click menu "Jadwal Saya"
    And I click previous slide button
    Then I have to display all my schedules for the last month


  Scenario: displays all my schedules for the next month
    Given I am on the Reproduction Dashboard
    When I click menu "Jadwal Saya"
    And I clicks the next slide button
    Then I have to display all my schedules for the next month


  Scenario: change the schedule for the next day
    Given I am on the Reproduction Dashboard
    When I click menu "Jadwal Saya"
    And I clicks on the desired date
    And I clicks the time range they want to change
    And I click button "Simpan Perubahan"
    And I click button "Ya, Saya Yakin"
    Then I can see success message in page my schedule "Jadwal berhasil diubah!"

  Scenario: failed to change the schedule for the next day
    Given I am on the Reproduction Dashboard
    When I click menu "Jadwal Saya"
    And I clicks on the desired date
    And I clicks the time range they want to change
    And I click button "Simpan Perubahan"
    And I click button "Tidak, batalkan"
    Then I should be redirected to the same page


  Scenario: View the appointment schedule for one day in each range
    Given I am on the Reproduction Dashboard
    When I click menu "Jadwal Saya"
    And I clicks on the desired date
    And The user clicks on the desired time range on the appointment schedule
    Then I have to displays a schedule of appointments for one day in each range
