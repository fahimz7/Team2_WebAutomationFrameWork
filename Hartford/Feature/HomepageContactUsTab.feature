Feature: Check if the Contact Us tab of Hartford homepage works

  Background:
    Given Open Hartford website through chrome browser

  Scenario:  Click on Contact Us tab and then click on AARP Members Auto Insurance

    When click on Contact Us tab
    Then click on AARP Members Auto Insurance
    Then close the browser

  Scenario:  Click on Contact Us tab and then click on AARP Members Home Insurance
    When click on Contact Us tab
    Then click on AARP Members Home Insurance and navigate back
    Then close the browser

  Scenario:  Click on Contact Us tab and then click on Business Insurnace
    When click on Contact Us tab
    Then click on Business Insurance and navigate back
    Then close the browser

  Scenario:  Click on Contact Us tab and then click on Auto Insurance
    When click on Contact Us tab
    Then click on Auto Insurance and navigate back
    Then close the browser

  Scenario:  Click on Contact Us tab and then click on Home Insurance
    When click on Contact Us tab
    Then click on Home Insurance and navigate back
    Then close the browser

  Scenario:  Click on Contact Us tab and then click on Financial Products
    When click on Contact Us tab
    Then click on Financial Products and navigate back
    Then close the browser

  Scenario:  Click on Contact Us tab and then click on Employee Benefits
    When click on Contact Us tab
    Then click on Employee Benefits of Contact Us Tab and navigate back
    Then close the browser

  Scenario:  Click on Contact Us tab and then click on Agents And Producers
    When click on Contact Us tab
    Then Click on Agents and Producers and navigate back
    Then close the browser

  Scenario:  Click on Contact Us tab and then click on Contact Information
    When click on Contact Us tab
    Then Click on Main Contact Information


    Then close the browser