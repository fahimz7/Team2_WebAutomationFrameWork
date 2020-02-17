Feature: Check if the Employee Benefits tab of Hartford homepage works

  Background:
    Given Open Hartford website through chrome browser

  Scenario:  Hover mouse on Employee Benefits tab and click on Employee Benefits
    When Hover mouse on Employee Benefits
    Then click on Employee Benefits
    Then close the browser

  Scenario:  Hover mouse on Employee Benefits tab and click on Voluntary Benefits
    When Hover mouse on Employee Benefits
    Then click on Voluntary Benefits
    Then close the browser

  Scenario:  Hover mouse on Employee Benefits tab and click on Absence Management
    When Hover mouse on Employee Benefits
    Then click on Absence Management
    Then close the browser

  Scenario:  Hover mouse on Employee Benefits tab and click on For Employees
    When Hover mouse on Employee Benefits
    Then click on For Employees
    Then close the browser
