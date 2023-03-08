@US01

Feature: US01_HealthProject_Regiter

  @TC01
  Scenario: TC01_enter 9_digit_ssn
    Given "User" goes home page
    When click on user icon
    Then click on register option
    And "User" enters "valid_ssn_number" in SSN box

  Scenario: TC01_negative01_6_digit_ssn
    Given "User" goes home page
    When click on user icon
    Then click on register option
    And "User" enters "invalid_ssn_number" in SSN box

  @TC02
  Scenario: TC02_enterFirstName
    Given "User" goes home page
    When click on user icon
    Then click on register option
    And "User" enters "Negar" in First Name Box
    Then verify FirstName box contains Valid First Name


  @TC03
  Scenario: TC03_enterLastName
    Given "User" goes home page
    When click on user icon
    And click on register option
    And "User" enters "France" in Last Name Box
    Then verify LastName box contains Valid Last Name



  @TC05
  Scenario:negative_test_LastName_Box
    Given "User" goes home page
    When click on user icon
    And User clicks on "Register" from drop down menu
    And "User" enters "Negar" in First Name Box
    And User clicks on Register submit button
    Then Verify the error message appears
    And User closes the application

  @TC06
  Scenario:negative_test_firstName_Box
    Given "User" goes home page
    When click on user icon
    And User clicks on "Register" from drop down menu
    And "User" enters "valid_ssn_number" in SSN box
    And User clicks on Register submit button
    Then verify that error message appears
    And User closes the application

