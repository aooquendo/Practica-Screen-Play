package com.demoqa.tasks;

import com.demoqa.userinterface.WordReferenceComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues("Profesor").into(WordReferenceComponents.WORD_REFERENCE_TEXT_BOX));
        actor.attemptsTo(Click.on(WordReferenceComponents.WORD_REFERENCE_SEARCH_BUTTON));
    }

    public static GoTo searchWord(){
        return instrumented(GoTo.class);
    }
}
