package com.company.co.definitions;

import com.company.co.browser.Browser;
import com.company.co.steps.login.LoginSteps;
import com.company.co.steps.validations.LoginStepValidations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class LoginStepDefinitions extends PageObject {

    @Steps(shared = true)
    Browser browser;

    @Steps(shared = true)
    LoginSteps loginSteps;

    @Steps(shared = true)
    LoginStepValidations loginStepValidations;

    @Given("Que el usuario se encuentra en la platafomra web Sauces demo")
    public void navigateToHomePage() {
        browser.navigateTo();
    }

    @When("ingrese las credenciales validas")
    public void login() {
        loginSteps.typeUsername("standard_user");
        loginSteps.typePassword("secret_sauce");
        loginSteps.clickBtnLogin();
    }


    @Then("el sistema nos redirige al modulo de productos")
    public void validateTitleProductsIsPresent() {
        Assert.assertTrue(loginStepValidations.titleProductsIsPresent());
    }


}
