package com.qa.pageActions;

import com.qa.pageLocators.LoginPageLocator;
import org.openqa.selenium.WebDriver;

public class LoginPageAction {

    private WebDriver driver;


    public LoginPageAction(WebDriver driver) {
        this.driver = driver;
    }

    public void doLogin(String emailId, String password) {
        driver.findElement(LoginPageLocator.emailIdTxt).sendKeys(emailId);
        driver.findElement(LoginPageLocator.passwordTxt).sendKeys(password);
        driver.findElement(LoginPageLocator.loginBtn).click();
    }
}
