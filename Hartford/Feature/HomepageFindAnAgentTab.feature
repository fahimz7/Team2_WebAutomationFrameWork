Feature: Check if the Find An Agent tab of Hartford homepage works

  Background:
    Given Open Hartford website through chrome browser

  Scenario:  Hover mouse on Find An Agent tab and click on Auto And Home
    When hover mouse over Find An Agent Tab
    Then click on Auto and Home
    And close the browser

  Scenario:  Hover mouse on Find An Agent tab and click on Small Business
    When hover mouse over Find An Agent Tab
    Then click on Small Business
    Then close the browser

  Scenario:  Hover mouse on Find An Agent tab and click on MidSize Business
    When hover mouse over Find An Agent Tab
    Then click on MidSize Business
    Then close the browser