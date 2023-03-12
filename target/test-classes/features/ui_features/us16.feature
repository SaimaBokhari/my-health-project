@Api_Physicians_Test
Feature: Doctors List Validation

  @US31_Api
  Scenario: TC01_Doctors_List_should_Validate
    Given user sends GET request for physicians list
    Then HTTP status code must be 200
    Then Assert that user can see all physicians list
