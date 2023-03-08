@US_11
Feature:US11_Doctor_Test

  Background: doctor_goes_to_medunna_site
    When "Doctor" goes home page
    Then "Doctor" clicks on the menu dropdown
    And "Doctor" clicks on the Sign in button
    And "Doctor" enters "doctorJames" in username field
    And "Doctor" enters "James1234." in password field
    And "Doctor" clicks on Sign in button


  @TC01_doctorRequest
  Scenario:TC_01_doctor_can_see_appointments
    When "Doctor" clicks on my pages option
    Then "Doctor" clicks on my appointments icon
    And "Doctor" can see the appointment lists
    And "Doctor" can see the appointment time slots
    Then close the application


  @TC02_doctorCanSeeInfo
  Scenario:TC_02_doctor_can_see_Information
    When "Doctor" clicks on my pages option
    Then "Doctor" clicks on my appointments icon
    And "Doctor" can see the Information
    Then  close the application












