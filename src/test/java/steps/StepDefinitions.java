package steps;

import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions
{

    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        BasePage.driverUtils.navigateToUrl(url);
    }

    @Then("I should be navigated to home page")
    public void i_should_be_navigated_to_home_page()
    {
         String homepageTitle = BasePage.driverUtils.getPageTitle();
         System.out.println(homepageTitle);
    }

    @When("I click on login link")
    public void i_click_on_login_link()
    {
       BasePage.homePage.clickLoginLink();
    }

    @Then("I should be navigated to login page")
    public void i_should_be_navigated_to_login_page()
    {

        BasePage.driverUtils.pageRefresh();
        String loginpageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(loginpageTitle);
    }

    @When("I enter email {string}")
    public void i_enter_email(String email)
    {
        BasePage.loginPage.enterEmail(email);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password)
    {
       BasePage.loginPage.enterPassword(password);
    }



    @When("I click on login button")
    public void i_click_on_login_button()
    {
          BasePage.loginPage.clickLogin();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
        BasePage.homePage.verifyLogout();
    }

    @When("I click on register link from the navbar")
    public void i_click_on_register_link_from_the_navbar()
    {
         BasePage.homePage.clickRegisterLink();
    }

    @Then("I should be navigated to register page")
    public void i_should_be_navigated_to_register_page()
    {
        String registerpageTitle = BasePage.driverUtils.getPageTitle();
        System.out.println(registerpageTitle);
    }

    @When("I select gender as male")
    public void i_select_gender_as_male()
    {
         BasePage.driverUtils.pageRefresh();
         BasePage.registerPage.clickFemaleRadioBtn();

    }

    @When("I enter fistName lastName email password confirmPassword")
    public void i_enter_fist_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable)
    {
        BasePage.registerPage.enterFirstName(dataTable.cell(1,0));
        BasePage.registerPage.enterLastName(dataTable.cell(1,1));
        BasePage.registerPage.enterEmail(dataTable.cell(1,2));
        BasePage.registerPage.enterPassword(dataTable.cell(1,3));
        BasePage.registerPage.enterConfirmPassword(dataTable.cell(1,4));
    }

    @When("I click on register button")
    public void i_click_on_register_button()
    {
          BasePage.registerPage.clickRegisterButton();
    }

    @Then("registration should be successful")
    public void registration_should_be_successful()
    {
         String msg = BasePage.registerPage.verifyRegisterConfMsg();
         System.out.println(msg);

         BasePage.homePage.verifyLogout();

    }

    @Then("I should see error messages for all the mandatory fields")
    public void i_should_see_error_messages_for_all_the_mandatory_fields()
    {
        System.out.println("Verify Error Messages");
    }


    @When("I enter search text as {string}")
    public void i_enter_search_text_as(String text)
     {

     }


}
