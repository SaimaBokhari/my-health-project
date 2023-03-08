@US_14
Feature: Physician should see all test results

  Background: Sign in as a physician
    Given phsician goes to "app_url" page
    When phsician click on user icon
    And physician click on Sign In option
    And physician enter "doctor_username" as username input
    And physician enter "doctor_password" as password input
    And physician click on Remember Me checkbox
    And physician click on Sign In submit button
    And physician click on MyPages
    And physician click on My Appointments
    And physician click on Edit button

  @US_14_TC_01
  Scenario: Physician should be able to see all test results
    Then verify Show Test Results button is displayed
    And close the application

  @US_14_TC_02
  Scenario: Physician should be able to see all test details
    When physician click on Show Test Results button
    Then verify View Results button is displayed on the site
    And physician click on View Results button
    Then verify Test Results page is displayed
    And verify test id is visible
    And verify test name is visible
    And verify test result is visible
    And verify default min value is visible
    And verify default max value is visible
    And verify test is visible
    And verify description is visible
    And verify test date is visible
    And close the application

  @US_14_TC_03
  Scenario: Physician should be able to request inpatient
    When physician click on Request Inpatient button
    And physician types "clear"  as anamnesis
    And physician types "blood thinner" as treatment
    And physician types "tension" as diagnosis
    And phycician click on Save button
    And physician click on MyPages
    And physician click on MyInpatients
    And verify Inpatient Appointment number is visible on the page
    And close the application



