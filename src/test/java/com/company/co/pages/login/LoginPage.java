package com.company.co.pages.login;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    protected WebElementFacade input_username;

    @FindBy(id = "password")
    protected WebElementFacade input_password;

    @FindBy(id = "login-button")
    protected WebElementFacade btn_login;

}
