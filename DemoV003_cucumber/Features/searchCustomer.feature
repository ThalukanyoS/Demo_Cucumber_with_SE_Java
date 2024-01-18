Feature: Search customer
  Background: Below are the common steps for each scenario
    Given the user launch chrome browser
    When the user opens URL "http://admin-demo.nopcommerce.com/login"
    And the user Enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can view Dashboard

  Scenario: searching customer By emailID
    When User click on customers Menu
    And click on customers Menu Item
    ##And the page with title "Customers / nopCommerce administration" is displayed
    And Enter customer Email
    And Click on search button
    Then the user should find email in the search table
    And Click on search button
    When User click on Log out link
    And close browser

  Scenario: Search Customer by Name
    When User click on customers Menu
    And click on customers Menu Item
      ##And the page with title "Customers / nopCommerce administration" is displayed
    And Enter customer FirstName
    And Enter customer LastName
    And Click on search button
    Then the user should find Name in the search table
    And Click on search button
    When User click on Log out link
    And close browser


