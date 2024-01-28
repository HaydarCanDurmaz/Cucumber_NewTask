Feature: Country Multi Scenario

  Background:// before
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country page
  @Regression
  Scenario: Create country
    When create a country
    Then Success message should be displayed
  @Regression
  Scenario: Create country 2
    When create a country name as "hysd4333" code as "h7342154"
    Then Success message should be displayed