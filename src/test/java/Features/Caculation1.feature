Feature: This functionality will check the calculation flow with multiple data sets

  Scenario Outline: Check the addition of two numbers with multiple dataset
    Given I have two numbers <num1> and <num2>
    When I add those numbers
    Then the result should be as <Result>
    Examples:
    |num1|num2|Result|
    |15  |15  |30    |
    |14  |14  |28    |
    |17  |17  |34    |
    |90  |90  |180   |

    Scenario: This scenario  will add two or more numbers  and validate the results
      Given I have below numbers
      |11|
      |25|
      |33|
      |41|
      | 7|
      |10|
      |20|
    When I add the numbers
      Then the result should be as 147

  Scenario: Validate the total bill amount of the purchased items
    Given Below items are added to the cart
      |Coffee|20|
      |Burger|30|
      |Pizza |50|
    When I do the checkout
    Then Validate the total bill as 100

  Scenario: Validate the total bill amount of the purchased items in multiple quantity
    Given Below items are added to the cart with given quantity
      |Coffee|2|20|
      |Burger|3|30|
      |Pizza |1|50|
    When I do the checkout with given quantity
    Then Validate the total bill as 180

