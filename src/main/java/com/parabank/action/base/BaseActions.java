package com.parabank.action.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class BaseActions {

    WebDriver driver;

    // Constructor to initialize WebDriver
    public BaseActions() {
        this.driver = driver;
    }

    // Method to switch to a different window
    public void switchToWindow(int index) {
        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
    }

    // Method to switch to an iframe by index
    public void switchToIframe(int index) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
    }

    // Method to switch to an iframe by locator
    public void switchToIframe(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.switchTo().frame(iframe);
    }

}
