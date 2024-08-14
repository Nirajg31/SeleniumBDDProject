@Simplilearn
Feature: This feature will validate the login scenario for simplilearn.com

  @U_10001
  Scenario: Validate the login failure scenario
    Given I have launched the application
    And I clicked on the login link
    When I enter the username
    And I enter the password
    And I click on the login button
    Then I should get the error message as "The email or password you have entered is invalid."

  @U_10001
  Scenario: Validate the login failure scenario with parameters
    Given I have launched the application
    And I clicked on the login link
    When I enter the username as "abc@xyz.com"
    And I enter the password as "Abc@1234"
    And I click on the login button
    Then I should get the error message as "The email or password you have entered is invalid."

  @Ignore
  Scenario Outline: Validate the login failure scenario using scenario outline
    Given I have launched the application
    And I clicked on the login link
    When I enter the username as "<UserName>"
    And I enter the password as "<Password>"
    And I click on the login button
    Then I should get the error message as "<Error>"
 Examples:
   | UserName    | Password | Error                                              |
   | abc@xyz.com | Abc@1234 | The email or password you have entered is invalid. |
   | pqr@xyz.com | Pqr@1234 | The email or password you have entered is invalid. |

  @Regression
  Scenario: Validate that different login options are present on the login screen page
      Given I have launched the application
      And I clicked on the login link
       Then I see the below login options are present on the screen
      |Google|
      |Facebook|
      |Linkedin|
      |Apple|