Feature: Check if the Business tab of Hartford homepage works

  Background:
    Given Open Hartford website through chrome browser

  Scenario:  Hover mouse on Business tab and click on Business Insurance
    When hover mouse over Business tab
    Then  click on Business insurance and navigate back to homepage
    Then close the browser

  Scenario:  Hover mouse on Business tab and click on Small Business Insurance
    When hover mouse over Business tab
    Then click on Small Business insurance and navigate back to homepage
    Then close the browser

  Scenario:  Hover mouse on Business tab and click on General Liability Insurance
    When hover mouse over Business tab
    Then click on General Liability insurance and navigate back to homepage
    Then close the browser

  Scenario:  Hover mouse on Business tab and click on Workers Compensation Insurance
    When hover mouse over Business tab
    Then click on Workers Compensation insurance and navigate back to homepage
    Then close the browser

  Scenario:  Hover mouse on Business tab and click on All Business Coverate
   When hover mouse over Business tab
    Then  click on All Business Coverage and navigate back to homepage
    Then close the browser

  Scenario:  Hover mouse on Business tab and click on All Industries
    When hover mouse over Business tab
    Then click on All Industries and navigate back to homepage
    Then close the browser