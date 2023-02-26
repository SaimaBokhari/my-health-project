@API_Tests
Feature: API_Tests
  @us11_api_test1
  Scenario: TC03_Api_Get_Request
    Given doctor sends GET request to see appointments
    Then HTTP status code should be 200
    And assert that user can see appointment list
