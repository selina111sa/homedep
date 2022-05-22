@functional
Feature: Add to cart button is disabled for unavailable items
  			 If an item is unavailable for delivry the add to cart
  			 button should be disabled.

  @cart_button
  Scenario: add to cart button disable for non-deliverable items
    Given user can visit homedepot homepage
    And user navigate to lawn and garden saving page
    When an item is out of stock or non-deliverable
    Then the add to cart button should be disabled
    

