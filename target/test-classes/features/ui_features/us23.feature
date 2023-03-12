@us_23
Feature: Patient Login and Update Info
    Background:
    Given staff is on "https://medunna.com/" page
    When click on user icon
    And click on Sign In option
    And enter "matt" in Username input
    And enter "4004Hakan" in Password input
    And click on Remember Me checkbox
    And click on Sign In submit button

  @appointment_update
  Scenario: TC_01 Patient Login
    And staff clicks on MY PAGES icon
    And clicks on Search Patient icon
    And enters SSN into Patient "SSN" into SSN text box
    And clicks on Show Appointments button
    And clicks on edit button to edit
    And sets new "startdateTime" for appointment
    And sets new endDateTime in "endDateTime" field for appointment
    And clicks on Save button to save
    Then verify that appointment is updated

  @status_update
  Scenario: Status Change
    When staff clicks on MY PAGES icon
    And clicks on Search Patient icon
    And enters SSN into Patient "SSN" into SSN text box
    And clicks on Show Appointments button
    And clicks on edit button to edit
    When clicks on status and changes "<status>"
    And clicks on Save button to save
    Then verify that status is changed

