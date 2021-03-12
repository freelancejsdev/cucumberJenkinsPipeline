Feature:  Search For Product


  @regression @search
  Scenario:   Verify search for product

    Given    I navigate to url "https://demo.nopcommerce.com/"
    Then     I should be navigated to home page
    When     I enter search text as "laptop"
    And      I click on search button
    Then     I should see corresponding results