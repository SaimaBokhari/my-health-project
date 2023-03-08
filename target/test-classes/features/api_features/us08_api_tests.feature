@API_validation
Feature: Api_Validation
  @TC_08_api
  Scenario: TC_03_api_validation
    Given user sends post request for appointments
    Then status code must be 200 for post request
    And Get that appointment as a Get request