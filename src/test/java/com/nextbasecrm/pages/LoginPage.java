package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (name = "USER_LOGIN")
    public WebElement userInput;

    @FindBy (name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy (className = "login-btn")
    public WebElement loginButton;

    public void login(String username, String password) {
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        wait.until(ExpectedConditions.titleIs("Portal"));

    }
}
