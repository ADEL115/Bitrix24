package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends NavigationBar{

    public TasksPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (id = "tasks-buttonAdd")
    public WebElement newTaskButton;



}
