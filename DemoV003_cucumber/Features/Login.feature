Feature: Login

  Scenario: Successful Login with valid Credentials
    Given the user launch chrome browser
    When the user opens URL "http://admin-demo.nopcommerce.com/login"
    And the user Enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    And close browser

  Scenario Outline: Login Data Driven
    Given the user launch chrome browser
    When the user opens URL "http://admin-demo.nopcommerce.com/login"
    And the user Enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    ##Then Page Title should be "Your store. Login"
    And close browser

     Examples:
       | email | password|
       | admin@yourstore.com  | admin |
       | admin1@yourstore.com | admin123 |
