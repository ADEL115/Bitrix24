package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class NavigationBar {

    public void selectTab(String tab) {

        String xpath = "//span[contains(text(), '"+tab+"')]";
        WebElement module = Driver.get().findElement(By.xpath(xpath));
        BrowserUtils.highlight(module);
        module.click();
        BrowserUtils.waitFor(1);

    }


}
