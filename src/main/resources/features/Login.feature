Feature: Test funcationality of login
 @automation
  Scenario: check this scenario with inValid data

    Given user enter correct email
    When user enter wrong email
    And user click in button of login
    Then user check the wrong message will appear

