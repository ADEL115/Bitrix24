package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.NewTaskPage;
import com.nextbasecrm.pages.TasksPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatingTasksStepDefs {

    @When("I click on {string}")
    public void i_click_on_Tasks(String module) {
        new TasksPage().selectTab(module);
    }

    @Then("I should be able to create new task")
    public void i_should_be_able_to_create_new_task() {
        TasksPage tasksPage = new TasksPage();
        try {
            BrowserUtils.highlight(tasksPage.newTaskButton);
        } catch (Exception e) {}
        BrowserUtils.verifyElementDisplayed(tasksPage.newTaskButton);
    }

    @Then("I should be able to add {string}")
    public void i_should_be_able_to_add(String addition) {
        NewTaskPage newTaskPage = new NewTaskPage();

        if (addition.equalsIgnoreCase("files and images")) {
            BrowserUtils.highlight(newTaskPage.uploadFilesButton);
            BrowserUtils.verifyElementDisplayed(newTaskPage.uploadFilesButton);
        } else if (addition.equalsIgnoreCase("link")) {
            BrowserUtils.highlight(newTaskPage.addLinksButton);
            BrowserUtils.verifyElementDisplayed(newTaskPage.addLinksButton);
        } else if (addition.equalsIgnoreCase("checklist")) {
            BrowserUtils.highlight(newTaskPage.addChecklist);
            BrowserUtils.verifyElementDisplayed(newTaskPage.addChecklist);
        } else if (addition.equalsIgnoreCase("deadline")) {
        BrowserUtils.highlight(newTaskPage.deadline);
        BrowserUtils.verifyElementDisplayed(newTaskPage.deadline);
    }


    }

    @And("I click New Task")
    public void iClickNewTask() {
        TasksPage tasksPage = new TasksPage();
        BrowserUtils.highlight(tasksPage.newTaskButton);
        tasksPage.newTaskButton.click();
        Driver.get().navigate().refresh();
        BrowserUtils.waitFor(1);
    }
}
