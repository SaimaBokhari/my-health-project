@US_13
Feature:US13_Doctor_Request_Test
  Background: user_goes_to_medunna_site
    When "Doctor" goes home pagee
    Then "Doctor" clicks on the menu dropdown
    And "Doctor" clicks on the Sign in button
    And "Doctor" enters "doctorJames" in username fields
    And "Doctor" enters "James1234." in password fields
    And "Doctor" clicks on Sign in button


  @TC01_doctorRequest
  Scenario:TC_01_doctor_request_test
    When "Doctor" clicks on my pages option
    Then "Doctor" clicks on my appointments icon
    And "Doctor" clicks on edit button;
    And "Doctor" clicks on request a test button
    And "Doctor" should verify the request is success
#  Then close the application

  @TC02_FallowingItems
  Scenario Outline:TC_02_test_should_have_fallowing_items
    When "Doctor" clicks on my pages option
    Then "Doctor" clicks on my appointments icon
    And "Doctor" clicks on edit button;
    And "Doctor" clicks on request a test button
    Then "Doctor" should see items as checkmark "<items>"
    Then close the application

    Examples: test_data
      | items |
      |Glucose|
      | Urea  |
      | Creatinine  |
      |  Sodium     |
      | Potassium   |
      |Total protein|
      | Albumin     |
      | Hemoglobin  |
















# "Test should have following items as checkmark options; Glucose, Urea, Creatinine, Sodium
# Potassium, Total protein, Albumin, Hemoglobin"
#  @TC01_doctorRequest
#  Scenario:TC_01_doctor_request_test
#  @iphone_search
#  Scenario: TC_01_iphone_search
#    When user search for iPhone
#  Then verify page title contains iPhone
#  Then close the application
#
#    @teapot_search
#  Scenario: TC_02_teapot_search
#  When user search for TeaPot
#  Then verify page title contains TeaPot
#  Then close the application
#Scenario Outline: TC01_"<search_item>"_search
#When user search for "<search_item>" on google
#Then verify page title contains "<search_item>"
#Then close the application
#
#  Examples: test_data
#  | search_item |
#  | tesla       |
#  | nio         |
#  | mercedes    |
#  | bmw         |
#  | lexus       |