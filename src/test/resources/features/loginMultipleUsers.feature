Feature:   Login to nop commerce application
  In order to login to application
  As a valid user
  I should provide valid email and password

  @sanity
  Scenario Outline:   Verify login with valid credentials

    Given    I navigate to url "https://demo.nopcommerce.com/"
    Then     I should be navigated to home page
    When     I click on login link
    Then     I should be navigated to login page
    When     I enter email "<email>"
    And      I enter password "<password>"
    And      I click on login button
    Then     I should be logged in successfully

    Examples:
    |    email               |    password       |
    |    testuser11@nop.com  |   Testing@123     |
    |    testuser10@nop.com  |   Testing@123     |



