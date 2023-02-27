@DatabaseTest
Feature: database_appointments

  @db_validate_appointment
  Scenario: read_appointment_details
    Given doctor connects to the database
    And doctor sends query to get data of "id" column from "appointment" table
    And doctor reads all of the "id" column data
    And doctor verifies the appointments by "id"
    Then close the database connection