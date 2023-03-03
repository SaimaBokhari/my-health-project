@US_15
Feature: Physician can view and update inpatients info

  Background: Sign in as a physician
    Given phsician goes to "app_url" page
    When phsician click on user icon
    And physician click on Sign In option
    And physician enter "doctor_username" as username input
    And physician enter "doctor_password" as password input
    And physician click on Remember Me checkbox
    And physician click on Sign In submit button
    And physician click on MyPages
    And physician click on MyInpatients
    And physician click on Edit button

  @US_15_TC_01
  Scenario: Physician can view all patient info
    Then verify physician should see ID section
    And verify physician should see Start Date section
    And verify physician should see End Date section
    And verify physician should see Description section
    And verify physician should see Created Date section
    And verify physician should see Appointment section
    And verify physician should see Status section
    And verify physician should see Room section
    And verify physician should see Patient section
    And close the application

  @US_15_TC_02
  Scenario: Physician should update inpatients info
    When physician click on status section
    And physician choose UNAPPROVED status
    And clicks on Save Submit button
    Then verify change is updated successfully
    And close the application

  @US_15_TC_03
  Scenario: Physician should update reserved room
    When physician click on Room Section
    And physician click on a room from dropbox
    And clicks on Save Submit button
    Then verify change is updated successfully
    And close the application




