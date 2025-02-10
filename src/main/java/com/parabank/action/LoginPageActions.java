package com.parabank.action;

import com.parabank.action.base.BaseActions;
import com.parabank.action.base.Waits;
import com.parabank.locatorPages.LoginPage;
import com.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.parabank.locatorPages.LoginPage.*;

public class LoginPageActions extends BaseActions {

    private Waits waits;
    private WebDriver driver;

    public LoginPageActions(WebDriver driver) {
        this.driver = driver;
        this.waits = new Waits(driver);
    }

    public LoginPageActions navigateToParaBankPage(){

        ConfigReader configReader = new ConfigReader();

        WebElement userName = waits.waitForElementToBeClickable(usernameField);
        userName.sendKeys(configReader.getUsername());
        WebElement password = waits.waitForElementToBeClickable(passwordField);
        password.sendKeys(configReader.getPassword());
        waits.waitForElementToBeClickable(loginButton).click();
        System.out.println(driver.getTitle());
        return this;
    }

    public boolean invalidCredsErrorValidation(){
        WebElement errorMessage = waits.waitForElementToBeVisible(errorMessageText, 5000);
        if(errorMessage.isDisplayed()){
            return true;
        } else {
            return false;
        }
    }


    public String getPageTitle() {
        return driver.getTitle();
    }
}
