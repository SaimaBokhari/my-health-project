@us_23
Feature: Patient Test results by Staff (Laboratory technician)
    Background:
      Given "Staff" goes to the homepage
      When "Staff" clicks on user icon
      And "Staff" clicks on sign in button
      And "Staff" enters "staff_username" in username field
      And "Staff" enters "staff_password" in password field
      And "Staff" clicks on sign in submit button



  @us23_tc_01
    Scenario Outline: US23_TC_01
    Then Staff clicks on MY PAGES link
    And Staff clicks on Search Patients link
    Then Staff verifies patients search input box is visible
    Then Staff enters a valid SSN "<SSN>" into search input box
    And Staff verifies the required ssn result is visible
    And close the application

    Examples: Ssn
      | SSN         |
      | 856-45-6789 |
      | 321-12-1212 |
      | 496-38-7027 |


  @us23_tc_02
  Scenario Outline: US23_TC_02
    Then Staff clicks on MY PAGES link
    And Staff clicks on Search Patients link
    Then Staff verifies patients search input box is visible
    Then Staff enters a invalid SSN "<SSN>" into search input box
    And Staff verifies that result do not match
    And close the application

    Examples: Ssn
      | SSN         |
      | 879-12-2834 |
      | 654-10-7890 |
      | 908-12-5689 |


    @us23_tc_03
  Scenario Outline: US23_TC_03
    Then Staff clicks on MY PAGES link
    And Staff clicks on Search Patients link
    Then Staff verifies patients search input box is visible
    And Staff clicks on Show appointments button for the first patient
    And Staff verify appointments page is visible
    And Staff clicks on Show tests button
    And Staff verify tests page is visible
    And Staff clicks on test view result button
    And Staff verify test results page is visible
    And Staff clicks on test edit button
    And Staff verify test result update page is visible
    And Staff enters a number "<result>" into result input box
    And Staff clicks on Save button
    And Staff verify the test result is updated message comes up
    And Staff verify the test result is updated
    And close the application

    Examples: Result
      | result |
      | 25     |



