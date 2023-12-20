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
@tag
Feature: Appointment
  I want to use this template for my feature file

  Background: 
    Given open the Reprohealth application
    And click skip button
    And click the login button option
    And login with registered account

  @tag1
  Scenario: finding a specialist
    When Clicks the bottom navbar Janji Temu
    And Click search bar
    And Input the searched word
    Then Display the searched specialist

  Scenario: see all specialist
    When Clicks the bottom navbar Janji Temu
    And Click Lihat Semua based on specialist
    Then Display all specialists

  Scenario: view list doctor
    When Clicks the bottom navbar Janji Temu
    And Choose and click one of the specialists
    Then display list doctor

  Scenario: search location
    When Clicks the bottom navbar Janji Temu
    And Click Cari Lokasi
    And Click search bar
    And Input the searched location
    Then Display the searched location

  Scenario: search location invalid keyword
    When Clicks the bottom navbar Janji Temu
    And Click Cari Lokasi
    And Click search bar
    And Input invalid searched location
    Then Display search not found

  Scenario: make appointments with manual transfer and direct payment
    When Clicks the bottom navbar Janji Temu
    And Choose and click one of the specialists
    And choose and click doctor
    And Click Jadwalkan
    And Set date appointment and session
    And Click Lanjut ke data pemesanan
    And Click patient profile
    And Click Selanjutnya
    And Click Pilih Metode Pembayaran
    And Click payment method Transfer Manual
    And Click bayar
    And Confirm payment
    And Click Kirim
    Then show payment confirmed immediately

  Scenario: make appointments with manual transfer and not yet paid
    When Clicks the bottom navbar Janji Temu
    And Choose and click one of the specialists
    And choose and click doctor
    And Click Jadwalkan
    And Set date appointment and session
    And Click Lanjut ke data pemesanan
    And Click patient profile
    And Click Selanjutnya
    And Click Pilih Metode Pembayaran
    And Click payment method Transfer Manual
    And Click bayar
    And Click Back until homepage
    And Click btn Navbar History Transaction
    Then Show payment is pending

  Scenario: make appointments with pay at clinic
    When Clicks the bottom navbar Janji Temu
    And Choose and click one of the specialists
    And choose and click doctor
    And Click Jadwalkan
    And Set date appointment and session
    And Click Lanjut ke data pemesanan
    And Click patient profile
    And Click Selanjutnya
    And Click Pilih Metode Pembayaran
    And Click payment method Pay at Clinic
    And Click bayar
    Then show payment confirmed immediately

  Scenario: make appointments without choose session
    When Clicks the bottom navbar Janji Temu
    And Choose and click one of the specialists
    And choose and click doctor
    And Click Jadwalkan
    And Click Lanjut ke data pemesanan
    Then Warning that must choose a session

  Scenario: make appointments without select payment method
    When Clicks the bottom navbar Janji Temu
    And Choose and click one of the specialists
    And choose and click doctor
    And Click Jadwalkan
    And Set date appointment and session
    And Click Lanjut ke data pemesanan
    And Click patient profile
    And Click Selanjutnya
    And Click Pilih Metode Pembayaran
    And Click bayar
    Then Warning that must choose a payment

  #Failed On Manual Testing
  #Scenario: make appointments with manual transfer without input confirm payment field
  #When Clicks the bottom navbar Janji Temu
  #And Choose and click one of the specialists
  #And choose and click doctor
  #And Click Jadwalkan
  #And Set date appointment and session
  #And Click Lanjut ke data pemesanan
  #And Click patient profile
  #And Click Selanjutnya
  #And Click Pilih Metode Pembayaran
  #And Click payment method Transfer Manual
  #And Click bayar
  #And Click Kirim
  #Then Warning on empty field
  
  
  Scenario: view doctor details
    When Clicks the bottom navbar Janji Temu
    And Click on one of the specialists
    And choose and click doctor
    Then Display doctor details

  Scenario: view clinic details
    When Clicks the bottom navbar Janji Temu
    And Choose and click clinic
    Then Display clinic details
