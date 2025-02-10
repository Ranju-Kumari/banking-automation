package com.parabank.action.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

    private WebDriver driver;

    public Waits(WebDriver driver) {
        this.driver = driver;
    }

    // Implicit wait
    public void setImplicitWait(int timeoutInSeconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutInSeconds));
    }

    // Explicit Wait for an element to be present in the DOM
    public WebElement waitForElementToBePresent(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Explicit Wait for an element to be visible
    public WebElement waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Explicit Wait for an element to be clickable
    public WebElement waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Fluent Wait for an element to be present (polls at regular intervals)
    public WebElement fluentWaitForElementToBePresent(By locator, int timeoutInSeconds, int pollingIntervalInMillis) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofMillis(pollingIntervalInMillis))
                .ignoring(Exception.class);

        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait for an element to disappear
    public void waitForElementToDisappear(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

//    // Wait for an element's text to be present
//    public WebElement waitForTextToBePresent(By locator, String text, int timeoutInSeconds) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
//        return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
//    }

    // Wait for an element's attribute to change
//    public WebElement waitForAttributeToChange(By locator, String attributeName, int timeoutInSeconds) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
//        return wait.until(ExpectedConditions.attributeToBeNotEmpty(locator, attributeName));
//    }
}
