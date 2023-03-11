
Feature: Driver should be able to create vehicle costs

  Background:
    Given the user is on the login page
     When the user enters the driver information
     Then the user should be able to login

  Scenario: Create vehicle costs
    When the driver hovers over fleet button
    And the driver clicks vehicle costs button
    And the driver clicks create vehicle costs button on the page
    And the driver clicks type button on the  Create vehicle costs page
    And the driver writes total price on the Create vehicle costs page
    And the driver enters date on the Create vehicle costs page
    And the driver writes cost description on the Create vehicle costs page
    And the driver enters and clicks add button for chassis number on the Create vehicle costs page
    And the driver clicks selects chassis number on the select carreservation page
    And the driver enters and clicks add button for license plate on the Create vehicle costs page
    And the driver clicks selects license plate on the select carreservation page
    Then the driver clicks save and close button on the page