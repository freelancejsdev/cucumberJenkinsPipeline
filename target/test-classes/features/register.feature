Feature: Register new user
   In order to register
   As a new user
   I have to enter data in all the mandatory fields

  @register @regression
  Scenario: Verify new user registration by providing data in mandatory fields
    Given    I navigate to url "https://demo.nopcommerce.com/"
    Then     I should be navigated to home page
    When     I click on register link from the navbar
    Then     I should be navigated to register page
    When     I select gender as male
    And      I enter fistName lastName email password confirmPassword

    | firstName  | lastName |   email         | password      | confirmPassword|
    |   user1    |  qa1     |  qauser3@nop.com|    Testing@123| Testing@123    |
    And     I click on register button
    Then    registration should be successful


   @register @ui @sanity
   Scenario: Verify register error messages when data is not entered in mandatory fields

     Given    I navigate to url "https://demo.nopcommerce.com/"
     Then     I should be navigated to home page
     When     I click on register link from the navbar
     Then     I should be navigated to register page
     When     I click on register button
     Then     I should see error messages for all the mandatory fields













