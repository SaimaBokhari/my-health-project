@US04
Feature: Health_Project US04

  Scenario: TC01_activate_registered_user
    When "Admin" goes home pagee
    When "Admin" clicks account menu dropdown
    Then "Admin" clicks sign in button
    And "Admin" enters "admin_username" in username field
    And "Admin" enters "admin_password" in password field
    And "Admin" clicks sign in submit button
    Then Admin clicks administration dropdown
    And Admin click user management button
    Then Admin sort page by ID descending order
    And Admin click edit button of last registered user
    And Admin click Activated checkbox
    And Admin select "ROLE_PATIENT" from profiles
    And Admin click save button
    And Admin sort page by ID descending order
    Then Admin verify user registration status Activated
    Then Admin verify user profiles "ROLE_PATIENT"
    Then Admin close the app