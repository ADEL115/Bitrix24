package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("I am on a login page")
    public void i_am_on_a_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String user, String password) {
        LoginPage loginPage = new LoginPage();

        loginPage.userInput.sendKeys(user);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("I should be able to see the dashboard page")
    public void i_should_be_able_to_see_the_dashboard_page() {
        Assert.assertEquals("Portal", Driver.get().getTitle());
    }

    @Then("I shouldn't be able to see the dashboard page")
    public void i_shouldn_t_be_able_to_see_the_dashboard_page() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(ConfigurationReader.get("url")));
    }

    @Given("I login as {string}")
    public void i_login_as(String userType) {

        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("help desk")) {
            username = ConfigurationReader.get("helpdesk");
            password = ConfigurationReader.get("password");
        } else if (userType.equalsIgnoreCase("hr")) {
            username = ConfigurationReader.get("hr");
            password = ConfigurationReader.get("password");

        } else if (userType.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.get("marketing");
            password = ConfigurationReader.get("password");
        } else {
            throw new RuntimeException("Invalid Username or Password");
        }
        new LoginPage().login(username, password);
    }
}
