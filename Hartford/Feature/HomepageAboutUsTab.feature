Feature: Check if the About Us tab of Hartford homepage works

  Background:
    Given Open Hartford website through chrome browser

  Scenario:  Hover mouse on About Us tab and click on About The Hartford
    When  hover mouse on About Us Tab
    Then click on Click on About The Hartford
    And close the browser

  Scenario:  Hover mouse on About Us tab and click on Investor Relations
    When  hover mouse on About Us Tab
    Then click on Investor Relations
    And close the browser

  Scenario:  Hover mouse on About Us tab and click on Newsroom
    When  hover mouse on About Us Tab
     And click on Newsroom
    And close the browser

  Scenario:  Hover mouse on About Us tab and click on Corporate Sustainability
    When  hover mouse on About Us Tab
    And click on Corporate Sustainability
    Then close the browser