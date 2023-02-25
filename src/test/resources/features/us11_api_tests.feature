@API_Tests
Feature: API_Tests
  @us11_api_test1
  Scenario: TC03_Api_Get Request
    Given user sends GET request to "https://medunna.com/api/appointments"
    Then HTTP status code should be 200
    And assert that user can see appointment list


  @us11_api_test2
  Scenario: TC04_Api_Get Request

    Given user sends GET request to "https://medunna.com/api/appointments"
    Then HTTP status code should be 200
    And assert that user can see patient id
    And assert that user can see start date
    And assert that user can see end date
    And assert that user can see status
    And assert that user can see anamnesis
    And assert that user can see treatment
    And assert that user can see diagnosis
    And assert that user can see prescription
    And assert that user can see description
    And assert that user can see createdDate
    And assert that user can see physician
    And assert that user can see patient