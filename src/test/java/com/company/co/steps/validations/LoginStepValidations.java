package com.company.co.steps.validations;

import com.company.co.pages.validations.LoginPageValidations;
import net.serenitybdd.annotations.Step;

public class LoginStepValidations extends LoginPageValidations {
    @Step("Valida si el titilo Products esta presente en la pagina ")
    public boolean titleProductsIsPresent() {
        return locator_title_products.isPresent();
    }
}
