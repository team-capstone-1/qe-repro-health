Feature: Article
As a user
I want to see the Article
So that I can make see Article

  Scenario: Search for articles with existing keywords
    Given I am on the Reproduction Dashboard
    When I clicks menu article
    And I enters correct keywords in article "Pria"
    Then I have to displays article that match the keywords

  Scenario: Search for articles with keywords that are not in the system
    Given I am on the Reproduction Dashboard
    When I clicks menu article
    And I enters incorrect keywords in article "nenek"
    Then I have to displays article that match the keywords


  Scenario: displays the contents of the article
    Given I am on the Reproduction Dashboard
    When I clicks menu article
    And I clicks on the desired article
    Then I have to displays the contents of the article

  Scenario: delete article
    Given I am on the Reproduction Dashboard
    When I clicks menu article
    And I clicks on the desired article
    And I clicks the delete button
    And I clicks "yes, delete" button
    Then I can success message in page Article "Artikel telah berhasil di hapus!"


  Scenario: Upload articles but don't fill in any requirements
    Given I am on the Reproduction Dashboard
    When I clicks menu article
    And I clicks the "Tulis Artikel" button.
    And I user clicks the "unggah" button.
    Then I can see erorr message in page article1