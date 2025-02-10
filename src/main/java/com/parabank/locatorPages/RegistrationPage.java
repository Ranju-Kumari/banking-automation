package com.parabank.locatorPages;

import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public static byte[] getPageTitle() {
        return null;
    }

    public void enterRegistrationDetails(String john, String doe, String s, String city, String state, String number, String number1, String s1, String johnDoe, String password123) {
    }

    public void clickRegisterButton() {
    }

    public boolean isRegistrationSuccessful() {
        return true;

    }

    // Home Page elements and methods go here
}
