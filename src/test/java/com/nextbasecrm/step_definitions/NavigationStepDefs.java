package com.nextbasecrm.step_definitions;

import com.nextbasecrm.utilities.Driver;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class NavigationStepDefs {
    @Then("The title should be {string}")
    public void the_title_should_be(String string) {
        Assert.assertTrue(Driver.get().getTitle().contains(string));
    }
}
