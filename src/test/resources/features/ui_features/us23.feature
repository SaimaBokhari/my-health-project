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


  @TC01_test_result_update
  Scenario: TC_01 Patient Login
    And staff clicks on MY PAGES icon
    And clicks on Search Patient icon
    And enters SSN into Patient "SSN" into SSN text box
    And clicks on Show Appointments button
    And clicks on Show Tests button
    And clicks on View Results button
    And clicks on edit button to edit
    And sets new value in "results" input section
    And clicks on Save button to save
    Then verify that appointment is updated
    And close the application

  @TC_02_test_result_details_visible
  Scenario: Staff can see all sections of test result
    When staff clicks on MY PAGES icon
    And clicks on Search Patient icon
    And enters SSN into Patient "SSN" into SSN text box
    And clicks on Show Appointments button
    And clicks on Show Tests button
    And clicks on View Results button
    And clicks on edit button to edit
    And verifies ID section is visible
    And verifies Date section is visible
    And verifies Result section is visible
    And verifies Description section is visible
    And verifies createdDate section is visible
    And verifies testItem section is visible
    And verifies Test section is visible
    And clicks on Save button to save
    And close the application

  @TC_03_test_result_details_updated
  Scenario: Staff can see all sections of test result
    When staff clicks on MY PAGES icon
    And clicks on Search Patient icon
    And enters SSN into Patient "SSN" into SSN text box
    And clicks on Show Appointments button
    And clicks on Show Tests button
    And clicks on View Results button
    And clicks on edit button to edit
    And sets new value in "ID" section
    And verifies ID section is updated
    And sets new value in "Date" input section
    And verifies Date section is updated
    And sets new value in "results" input section
    And verifies Result section is updated
    And sets new value in "Description" input section
    And verifies Description section is updated
    And sets new value in "createdDate" input section
    And verifies createdDate section is updated
    And sets new value in "testItem" input section
    And verifies testItem section is updated
    And sets new value in "Test" input section
    And verifies Test section is updated
    And clicks on Save button to save
    And close the application

