@Calculator
Feature: This functionality will check the calculation flow

  Scenario: Check the addition of two numbers
    Given I have two numbers 44 and 44
    When I add those numbers
    Then the result should be as 88

  Scenario: Check the substraction of two numbers
    Given I have two numbers 44 and 44
    When I subtract those numbers
    Then the result should be as 0

  Scenario: Check the Multiplication of two numbers
    Given I have two numbers 20 and 20
    When I multiply those numbers
    Then the result should be as 400
