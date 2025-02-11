package com.parabank.locatorPages;

import org.openqa.selenium.By;

public class RegistrationPage {

    public static By registrationLink = By.xpath("//a[contains(text(),'Register')]");
    public static By firstNameInputText = By.cssSelector("[id=\"customer.firstName\"]");
    public static By lastNameInputText =  By.cssSelector("[id=\"customer.lastName\"]");
    public static By addresssInputRText =  By.cssSelector("[id=\"customer.address.street]");
    public static By cityInputText = By.cssSelector("[id=\"customer.address.city\"]");
    public static By state = By.cssSelector("[id=\"customer.address.state\"]");
    public static By zipCodeInputText = By.cssSelector("[id=\"customer.address.zipCode\"]");
    public static By phonrnUmberInputText =  By.cssSelector("[id=\"customer.phoneNumber\"]");
    public static By ssn = By.cssSelector("[id=\"customer.ssn\"]");
    public static By userNameInputText = By.cssSelector("[id=\"customer.username\"]");
    public static By password = By.cssSelector("[id=\"customer.password\"]");
    public static By confirmPasswordInputText = By.cssSelector("[id=\"repeatedPassword\"]");
    public static By registerButton = By.cssSelector("[value=\"Register\"]");
    public static By errorMessagesList = By.cssSelector("[class=\"error\"]");
    public static By formInputTexts = By.cssSelector("td [type=\"text\"]");
    public static By registrationSuccesfulMessage = By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in.')]");


}
