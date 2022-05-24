package com.demoqa.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WordReferenceComponents {
    public static final Target WORD_REFERENCE_TEXT_BOX = Target.the("word reference text bos").located(By.id("si"));
    public static final Target WORD_REFERENCE_SEARCH_BUTTON =Target.the("Word reference search button").located(By.className("submit-button"));

}
