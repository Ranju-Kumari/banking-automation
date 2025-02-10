package com.parabank.locatorPages;

import org.openqa.selenium.By;

public class LoginPage {

    public static By usernameField = By.cssSelector("[name=\"username\"]");
    public static By passwordField = By.cssSelector("[name=\"password\"]");
    public static By loginButton = By.xpath("//input[@value='Log In']");
    public static By errorMessageText = By.xpath("//*[contains(text(),'The username and password could not be verified.')]");




}
