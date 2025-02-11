package com.parabank.action;

import com.parabank.action.base.BaseActions;
import com.parabank.action.base.Waits;
import dev.failsafe.internal.util.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.parabank.locatorPages.RegistrationPage.*;

public class RegistrationPageActions extends BaseActions {

    private WebDriver driver;
    private Waits waits;
    private static String userNameValue;
    private static String passwordValue;


    public RegistrationPageActions(WebDriver driver){
        this.driver = driver;
        this.waits = new Waits(driver);
    }

    public RegistrationPageActions registerAUser() throws InterruptedException {
        waits.setImplicitWait(5000);
        WebElement registerLink = waits.waitForElementToBeClickable(registrationLink);
        registerLink.click();
       List<WebElement> formInputs = driver.findElements(formInputTexts);
        for(int i = 0; i <= formInputs.size()-2;i++){
            String value = RandomStringUtils.random(10,true,false);
            formInputs.get(i).click();
            formInputs.get(i).sendKeys(value);
        }
        //username and password are static variables so as to be able to access it later
        userNameValue = RandomStringUtils.random(10,true,false);
        passwordValue = RandomStringUtils.random(10,true,false);

        waits.waitForElementToBeClickable(userNameInputText).sendKeys(userNameValue);
        waits.waitForElementToBeClickable(password).sendKeys(passwordValue);
        waits.waitForElementToBeClickable(confirmPasswordInputText).sendKeys(passwordValue);
        waits.waitForElementToBeClickable(registerButton).click();
        Thread.sleep(5000);
        return this;
    }

    public RegistrationPageActions verifyRegistrationIsSuccesful(){
        WebElement registrationIsSuccessfulMessage =  waits.waitForElementToBeVisible(registrationSuccesfulMessage,2000);
        Assert.isTrue(registrationIsSuccessfulMessage.isDisplayed(), "Registration successful is not displayed");
        return this;
    }

}
