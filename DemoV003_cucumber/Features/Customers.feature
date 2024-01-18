Feature: Customers
  Scenario: Add new Customer
    Given the user launch chrome browser
    When the user opens URL "http://admin-demo.nopcommerce.com/login"
    And the user Enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customers Menu
    And click on customers Menu Item
    And click on Add new Button
    Then user can view Add new customer page
    When User enter customer info
    And click on Save button
    Then user can view confirmation message "The new customer has been added successfully."
    When User click on Log out link
    And close browser
    And close browser

