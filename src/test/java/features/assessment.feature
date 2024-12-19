Feature: assessment

  Scenario: Verify user can sort the product list for "Name Z to A"
    Given enter the "standard user" username
    When enter the password
    And click the login button
    And select "Name (Z to A)" as sorting option
    And verify the product list
    Then user logouts from application

    Scenario: Verify user can complete an order
      Given enter the "standard user" username
      When enter the password
      And click the login button
      And click add to cart button for "Sauce Labs Backpack"
     And click your cart button
      And click the checkout button
      And enter user information
      And click continue button
      And click finish button
      Then user logouts from application
