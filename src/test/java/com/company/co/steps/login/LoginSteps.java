package com.company.co.steps.login;

import com.company.co.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;


public class LoginSteps extends LoginPage {

    @Step("Ingresa el susuario")
    public void typeUsername(String username) {
        input_username.type(username);
    }

    @Step("Ingresa la contraseña")
    public void typePassword(String password) {
        input_password.type(password);
    }

    @Step("Da click en el boton de login")
    public void clickBtnLogin() {
        btn_login.click();
    }

}
