package com.company.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPageValidations extends PageObject {

    @FindBy(xpath = "//span[@data-test='title' and text()='Products']")
    protected WebElementFacade locator_title_products;
}
