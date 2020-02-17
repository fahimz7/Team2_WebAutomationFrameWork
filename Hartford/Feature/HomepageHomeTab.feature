Feature: Check if the Home tab of Hartford homepage works

  Background:
    Given Open Hartford website through chrome browser

  Scenario:  Hover mouse on Home tab and click on Homeowners Insurance
    When hover mouse over Home tab
    Then click on Homeowners Insurance
    Then close the browser

  Scenario:  Hover mouse on Home tab and click on Renters Insurance
    When hover mouse over Home tab
    Then click on Renters Insurance
    And close the browser

  Scenario:  Hover mouse on Home tab and click on Condo Insurance
    When hover mouse over Home tab
    Then click on condo Insurance
    And close the browser

  Scenario:  Hover mouse on Home tab and click on Flood Insurance
    When hover mouse over Home tab
    Then click on Flood Insurance
    And close the browser

  Scenario:  Hover mouse on Home tab and click on Umbrella Insurance
    When hover mouse over Home tab
    Then click on umbrella Insurance
    And close the browser
