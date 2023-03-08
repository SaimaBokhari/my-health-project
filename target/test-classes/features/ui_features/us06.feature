@US06
Feature: Health_Project US06:

  Background: User_goes_to_url
    Given user goes to the homepage
    And verify make an appointment button is displayed
    When user click to Make an Appointment
    Then verify Make an Appointment is displayed



  @TC01
  Scenario: TC01
    When user provide first name of the applicant "Tom"
    Then user does not get invalid error message
    And close the application



  @TC02
  Scenario: TC02
    When user provide first name of the applicant ""
    Then user should see error message
    And close the application



  @TC03
  Scenario Outline: TC03
    When user provides the "<valid>" SSN
    Then user does not get invalid error message
    And close the application

    Examples:
      | valid       |
      | 554-44-5454 |
      | 555-44-5555 |



  @TC04
  Scenario: TC05
    When user provides the "" SSN
    Then user should see error message
    And close the application




  @TC05
  Scenario: TC06
    When user provide last name of the applicant "Von"
    Then user does not get invalid error message
    And close the application



  @TC06
  Scenario: TC06
    When user provide last name of the application ""
    Then user should see error message
    And close the application



  @TC07
  Scenario Outline: TC07
    When user provides the "<valid>" phone number
    Then user does not get invalid error message
    And close the application

    Examples:
      |valid       |
      |152-442-5413|
      |151-443-5231|



  @TC08
  Scenario Outline: TC08
    When user provides the "<invalid>" phone number
    Then user should see error message
    And close the application

    Examples:
      |invalid      |
      |123          |
      |000-000-0000 |
      |12345678901  |
      |12-364-97656 |



  @TC09
  Scenario: TC09
    When user provides the "" phone number
    Then user should see error message
    And close the application



  @TC10
  Scenario: TC10
    When user provide email name of the applicant "Tom02@gmai.com"
    Then user does not get invalid error message
    And close the application




  @US6TC11
  Scenario: TC11
    When user provide first name of the applicant "Tom"
    When user provide last name of the applicant "Von"
    When user provides the "555-44-5555" SSN
    When user provides the "151-443-5231" phone number
    When user provide email name of the applicant "Tom02@gmai.com"
    And user click to Sent an Appointment Request button
    Then click on user icon
    Then click on Sign In option
    And enter "Tom02" in Username input
    And enter "Tom02@?" in Password input
    And click on Sign In submit button
    And click on My Pages
    And click on My Appointments
    And verify that patient updated info is displayed

