package com.company.co.browser;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;


public class Browser {

    @Steps(shared = true)
    PageObject pageObject;

    public void navigateTo() {
        EnvironmentVariables env = SystemEnvironmentVariables.createEnvironmentVariables();
        final String URL = env.getProperty("base.url");

        if (URL == null || URL.isEmpty()) {
            throw new IllegalArgumentException("La propiedad 'base.url' no está configurada.");
        }

        pageObject.setDefaultBaseUrl(URL);
        pageObject.open();
    }
}
