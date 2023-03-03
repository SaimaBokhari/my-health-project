@DatabaseTest
Feature: Perform DB test to verify appointmnet details

  @db_validate_appointment_info
  Scenario: appointment_validation

    Given patient connects to the database
    When patient sends query to get data of the patient the appointment is booked for
    Then patient conforms First name is "Tom", Last name is "Von", email is "tom02@gmail.com", phone is "151-443-5231"
    And close the database connection