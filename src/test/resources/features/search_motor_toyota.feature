@navigation
Feature: Perform the navigation of a flow that allows me to visualize the engine specifications of
  a car model on the toyota.com.co website


  @success
  Scenario Outline: view details of the engine of a car model
    Given Carlos enters the toyota.com.co website
    When try to choose a option for a car model in the page
      | Options   | Models   |
      | <Options> | <Models> |
    Then check engine information
    Examples:
      | Options | Models      |
      | 5       | HILUX 2.8L  |
      | 8       | YARIS SPORT |
