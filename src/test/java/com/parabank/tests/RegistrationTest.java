package com.parabank.tests;

import com.base.BaseTest;
import com.parabank.action.RegistrationPageActions;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test(testName = "Able to register a user by providing details in the register form")
    public void registerAUserTest() throws InterruptedException {
        RegistrationPageActions registrationPageActions = new RegistrationPageActions(driver);

        registrationPageActions
                .registerAUser()
                .verifyRegistrationIsSuccesful();
    }
}
