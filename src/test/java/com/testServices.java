package com;

import cucumber.api.java.nl.Stel;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class testServices {

    private final String restApi = "https://reqres.in/api";


    @Test
    public void test1()
    {
        Actor luis = Actor.named("Luis usuario de prueba")
                .whoCan(CallAnApi.at(restApi));
        luis.attemptsTo(GetUsers.fromPage(3));
    }

}
