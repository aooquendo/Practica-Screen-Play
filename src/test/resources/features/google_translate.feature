Feature: Google translate
  As a web user i want to translate words between two different languages
    Scenario: Translate from english to spanish
      Given that Alex wants to translate a word
      When she translates the word Teacher from english to spanish
      Then she should see the word Profesor in the screen