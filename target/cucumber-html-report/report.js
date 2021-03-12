$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login to nop commerce application",
  "description": "  In order to login to application\n  As a valid user\n  I should provide valid email and password",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to url \"https://demo.nopcommerce.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_navigate_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_should_be_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_should_be_navigated_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email \"qauser89@nop.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_enter_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"Testing@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_should_be_logged_in_successfully()"
});
formatter.result({
  "error_message": "org.opentest4j.AssertionFailedError\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:35)\n\tat org.junit.jupiter.api.Assertions.fail(Assertions.java:98)\n\tat utils.DriverUtils.click(DriverUtils.java:132)\n\tat pageObjects.HomePage.verifyLogout(HomePage.java:65)\n\tat steps.StepDefinitions.i_should_be_logged_in_successfully(StepDefinitions.java:62)\n\tat ✽.I should be logged in successfully(file:src/test/resources/features/login.feature:16)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});