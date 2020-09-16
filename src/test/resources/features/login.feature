Feature: Login User
  Everybody wants to know when it's Friday

  Scenario: Login user
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"