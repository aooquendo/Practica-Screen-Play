package com.demoqa.stepsdefinitions;


import com.demoqa.tasks.GoTo;
import com.demoqa.tasks.openTheBrowser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class google_translate_stepsdefinition {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor alex = Actor.named("Alex");

    @Before
    public void setUp(){
        alex.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("that Alex wants to translate a word")
    public void thatAlexWantsToTranslateAWord() {
        alex.wasAbleTo(openTheBrowser.on());
    }
    @When("she translates the word Teacher from english to spanish")
    public void sheTranslatesTheWordTeacherFromEnglishToSpanish() {
        alex.attemptsTo(GoTo.searchWord());
    }
    @Then("she should see the word Profesor in the screen")
    public void sheShouldSeeTheWordProfesorInTheScreen() {

    }

}
