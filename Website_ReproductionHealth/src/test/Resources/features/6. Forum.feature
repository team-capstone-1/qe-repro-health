Feature: Forum

  As a user
  I want to see Forum
  So that I can display the Forum

  Scenario: Search for forum with existing keywords
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I enters correct keywords "pria"
    Then I have to displays articles that match the keywords


  Scenario: Search for forum with keywords that are not in the system
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I enters incorrect keywords "payung"
    Then I have to displays articles that match the keywords


  Scenario: displays all discussions in the forum
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I clicks button "Semua"
    Then I have to displays all discussions in the forum

  Scenario: displays popular discussions on the forum
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I clicks button "popular"
    Then I have to displays popular discussions on the forumall discussions in the forum

  Scenario: displays the latest discussions in the forum
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I clicks button "Terbaru"
    Then I have to displays the latest discussions in the forum

  Scenario: displays discussion details
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I clicks "Lihat lebih lanjut"
    Then I have to displays all detail discussions in the forum

  Scenario: list of unanswered discussions
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I click menu has not been answered
    Then I have to displays a list of unanswered discussions


  Scenario: answer the discussion
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I click menu has not been answered
    And I clicks "Lihat lebih lanjut".
    And I writes answer forum
    And I clicks the button "kirim"
    And I clicks the "Ya, kirim jawaban" button.
    Then I can see success message in Forum page "Jawaban anda telah dikirim!"


  Scenario: Answer discussions that exceed the maximum character limit
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I click menu has not been answered
    And I clicks "Lihat lebih lanjut".
    And I writes answer
    And I clicks the button "kirim"
    And I clicks the "Ya, kirim jawaban" button.
    Then I can see failed message in Forum page "Gagal mengirim jawaban!"

  Scenario: send a discussion without filling in the answer
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I click menu has not been answered
    And I clicks "Lihat lebih lanjut".
    And I clicks the button "kirim"
    Then I should have stayed on the question answer page and message eror "Jawaban harus diisi"


  Scenario: Double check answers before sending
    Given I am on the Reproduction Dashboard
    When I click menu forum
    And I click menu has not been answered
    And I clicks "Lihat lebih lanjut".
    And I writes answer forum
    And I clicks the button "kirim"
    And I clicks the "Tidak, Cek lagi" button.
    Then I should still be on the question answer page