@US01_DataBase
Feature: US01_DataBase_ssn

  @dbTest_Validate_ssn
  Scenario: TC05_validate_registrant_ssn_ids
    Given user connects to the application database
    Then user sends query to get all of "ssn" column from "jhi_user" table
    And user reads all registrant "ssn" column data
    Then user verifies all registrants "ssn"
    Then close the database connection




                              #Tese case  = Validate registrant SSN ids with DB