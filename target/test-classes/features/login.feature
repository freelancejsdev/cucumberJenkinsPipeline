Feature:   Login to nop commerce application
  In order to login to application
  As a valid user
  I should provide valid email and password

  @login
  Scenario:   Verify login with valid credentials

    Given    I navigate to url "https://demo.nopcommerce.com/"
    Then     I should be navigated to home page
    When     I click on login link
    Then     I should be navigated to login page
    When     I enter email "qauser89@nop.com"
    And      I enter password "Testing@123"
    And      I click on login button
    Then     I should be logged in successfully