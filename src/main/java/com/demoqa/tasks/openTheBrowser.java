package com.demoqa.tasks;

import com.demoqa.userinterface.WordReferencePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class openTheBrowser implements Task {

    @Override
    @Step("{0} open the browser on Google home")
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Open.browserOn(new WordReferencePage()));
    }

    public static openTheBrowser on(){
        return instrumented(openTheBrowser.class);
    }
}
