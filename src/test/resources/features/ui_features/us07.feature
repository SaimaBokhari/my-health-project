@patient_user_settings
Feature: Patient Login and Update Info

  @patient_login
  Scenario: TC_01 Patient Login Scenario
    Given patient is on "https://medunna.com/" page
    When click on user icon
    And click on Sign In option
    And enter "oduntas" in Username input
    And enter "4004Hakan_" in Password input
    And click on Remember Me checkbox
    And click on Sign In submit button
    Then verify that login is successfull.


  @patient_info
  Scenario: TC_02 Patient Info Test
    When patient clicks on user icon
    And clicks on Settings option
    Then verify that "User settings for [" message is displayed


  @patient_info_update
  Scenario Outline: TC_03 Patient Info Updated Test
    When patient updates "<firstname>" into First Name input field
    And patient updates "<lastname>" into Last Name input field
    And clicks on Save button
    Then verify that patient updated info is displayed

    Examples:Credentials
      | firstname | lastname |
      | apple     | orange   |


    #firstname and lastname can not include numeric, this is a bug.
  @patient_info_update
  Scenario Outline: TC_04 Patient Info Updated Negative Test
    When patient updates "<firstname>" into First Name input field
    And patient updates "<lastname>" into Last Name input field
    And clicks on Save button
    Then verify that patient updated info is displayed

    Examples:Credentials
      | firstname | lastname |
      | 12543     | 22nerows |








