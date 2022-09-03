@smoke
Feature:F2
  Scenario: open Today's Page ,select
    Given Open amazon link https://www.amazon.com/
    Given  Open today's deals
    When  Select "Headphones" and "grocery"
    And   Select  discount part choose "10% off or more "
    And   Go to the fourth page
    Then  Select any item
    And   Add item to the cart1
    And   Check item add successful1