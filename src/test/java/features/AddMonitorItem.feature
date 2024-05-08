Feature: Adding a “Monitor” Item in Cart

  @MonitorItem @VerifyCartItem
  Scenario: Adding a “Monitor” Item in Cart and verifying sub total displayed
    Given user is on the Amazon home Page
    When  the user searches for the monitor item
    And   selects the first item and add the item to the cart
    Then  the user verifies that the item price is identical to the product page
    And   also the the sub total is identical to the item price in the product page