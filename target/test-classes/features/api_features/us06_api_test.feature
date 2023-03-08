@Api_Tests
Feature: API_Test_US06

  @US06_api_test
  Scenario: US06_Api_Request
    Given patient sends GET request to see appointments
#   Then HTTP status code must be 200
#    And assert that user can see appointment list
