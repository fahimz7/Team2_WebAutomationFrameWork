Feature: Check if the Bottom tabs and Logos of Hartford homepage works

Background:
Given Open Hartford website through chrome browser

  Scenario: click on Car Insurance from the bottom of homepage
    Then Click on Car Insurance
    Then close the browser

  Scenario: click on Home Insurance from the bottom of homepage
    Then Click on Home Insurance
    Then close the browser

  Scenario: click on Business Insurance from the bottom of homepage
    Then Click on Business Insurance
    Then close the browser

  Scenario: click on Employee Benefits from the bottom of homepage
    Then Click on Employee Benefits
    Then close the browser

  Scenario: click on Car Insurance Logo from the bottom of homepage
    Then Click on Car Insurance Logo
    Then close the browser

  Scenario: click on Home Insurance Logo from the bottom of homepage
    Then Click on Home Insurance Logo
    Then close the browser

  Scenario: click on Business Insurance Logo from the bottom of homepage
    Then Click on Business Insurance Logo
    Then close the browser

  Scenario: click on Employee Benefits Logo from the bottom of homepage
    Then Click on Employee Benefits Logo
    Then close the browser

  Scenario: Check if Car Insurance rating stars present
    Then Car Insurance rating stars is displayed
    Then close the browser

  Scenario: Check if Car Insurance rating score present
    Then Car Insurance rating score is displayed
    Then close the browser

  Scenario: Check if Car Insurance rating reviews present
    Then Car Insurance rating reviews is displayed
    Then close the browser




