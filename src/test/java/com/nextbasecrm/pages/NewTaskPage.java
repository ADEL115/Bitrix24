package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTaskPage extends NavigationBar{

    public NewTaskPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@title='Upload files']")
    public WebElement uploadFilesButton;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement addLinksButton;

    @FindBy(xpath = "//span[.='Checklist']")
    public WebElement addChecklist;

    @FindBy(xpath = "//input[@data-bx-id='datepicker-display']")
    public WebElement deadline;
}
