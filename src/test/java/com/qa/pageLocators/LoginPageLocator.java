package com.qa.pageLocators;

import org.openqa.selenium.By;

public class LoginPageLocator {
    public static By emailIdTxt = By.name("email");
    public static By passwordTxt = By.name("password");
    public static By loginBtn = By.xpath("//input[@value='Login']");
}
