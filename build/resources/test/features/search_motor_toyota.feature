@navigation
Feature: Perform the navigation of a flow that allows me to visualize the engine specifications of
         a car model on the toyota.com.co website


  @success
  Scenario: view details of the engine of a car model
    Given Carlos enters the toyota.com.co website
    When try to choose a car model
    Then check engine information
