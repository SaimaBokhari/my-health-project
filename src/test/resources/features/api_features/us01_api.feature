@API_Tests
Feature: Registration_api_test

  Scenario: US01_HealthProject_Registration
    Given user sends get request for registrant
    Then HTTP status code should be 200
    And  user gets  registrant data and validate them