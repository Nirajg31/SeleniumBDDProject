Feature: This feature will do different operation with string
  Scenario: To compare the values of two strings
    Given The first string is "Sunny"
    And The second string is "Sunny"
    When I compare the strings
    Then I should get the result as "matching"

  Scenario Outline: : To compare the values of two strings with different text
    Given The first string is "<str1>"
    And The second string is "<str2>"
    When I compare the strings
    Then I should get the result as "<result>"
    Examples:
      | str1  | str2   | result       |
      | Ron   | Ron    | matching     |
      | Ron   | Sai    | missmatching |
      | Nalini| Yazana | missmatching |
