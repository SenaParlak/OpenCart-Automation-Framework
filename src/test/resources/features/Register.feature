Feature: Register

  Scenario: Register a new user
    Given user is on Register page
    When user enters registration information
    |firstName|Sena|
    |lastName|Test|
    |email   |sena111@sena.com|
    |telephone   |5554443322   |
    |password|test1234     |
    |passwordConfirm|test1234|
    And user accepts the privacy policy and clicks countinue button
    Then account should be created successfully