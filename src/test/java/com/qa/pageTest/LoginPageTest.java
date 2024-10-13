package com.qa.pageTest;

import com.qa.pageActions.LoginPageAction;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    @Test
    public void loginPageTest() {
        String emailId = "david.thomson@gmail.com";
        String password = "Secret@123";
        LoginPageAction loginPageAction = new LoginPageAction(driver);
        loginPageAction.doLogin(emailId, password);
    }
}
