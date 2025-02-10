package com.parabank.tests;

import com.base.BaseTest;
import com.parabank.action.LoginPageActions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test(testName = "Able to validate error message when trying to login with invalid creds")
    public void testLogin() throws InterruptedException {
        LoginPageActions loginPageActions = new LoginPageActions(driver);

        loginPageActions
                .navigateToParaBankPage();

        Assert.assertTrue(loginPageActions.invalidCredsErrorValidation(),"Error message not visible");
    }
}
