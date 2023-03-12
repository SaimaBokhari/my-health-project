@US_21
Feature: US_21 Admin can see and edit registered user's information

  Background:
    Given "Admin" goes to the homepage
    When "Admin" clicks on user icon
    And "Admin" clicks on sign in button
    And "Admin" enters "admin_username" in username field
    And "Admin" enters "admin_password" in password field
    And "Admin" clicks on sign in submit button
    Then Admin clicks on administration option
    And Admin clicks on user management option
    And "Admin" clicks on "Create New User" option
    And "Admin" enters "Username" into Username input field
    And "Admin" enters "First Name" into First Name input field
    And "Admin" enters "Last Name" into Last Name input field
    And "Admin" enters "Email" into Email input field
    And "Admin" enters "SSN" into SSN input field
    And "Admin" clicks on Save button
    Then Verify the success message appears


  @TC_01_admin_views
  Scenario: Admin can view registered user's information
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on any id from among the registered users
    Then "Admin" can see "login" of that registered user
    Then verify login name of that registered user
    And Admin can see firstname of that registered user
    Then verify firstName box contains valid first name of that user
    And Admin can see the "lastname" of that registered user
    Then verify lastName box contains valid last name of that user
    And "Admin" can seee "email" of that registered user
    Then verify email box contains valid email of that user
    And Admin can see "createdBy" for that user
    Then verify createdBy box contains valid information for that user
    And "Admin" can see "modifiedBy" for that user
    Then verify modifiedBy box contains valid information for that user
    And "Admin" see "profile" of that user
    Then "Admin" goes back to the user management page
    And "Admin" sorts the page by ID in Descending order
    Then "Admin" deletes that registered user
    And "Admin" confirms the delete option
    And "Admin" verify that user is deleted
    And "Admin" closes the app


  @TC_02_physician_role
  Scenario: Admin can assign PHYSICIAN role to a registered user and delete it as well
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
    And "Admin" selects "ROLE_PHYSICIAN" from profiles
    And "Admin" clicks on Save button
    And "Admin" sorts the page by ID descending order
    Then "Admin" verify user registration status is Activated
    And "Admin" verify user profile as "ROLE_PHYSICIAN"
    And "Admin" sorts the page by ID in Descending order
    Then "Admin" deletes that registered user
    And "Admin" confirms the delete option
    And "Admin" verify that user is deleted
    And "Admin" closes the app


  @TC_03_staff_role
  Scenario: Admin can assign STAFF role to a registered user and delete it as well
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
    And "Admin" selects "ROLE_STAFF" from profiles
    And "Admin" clicks on Save button
    And "Admin" sorts the page by ID descending order
    Then "Admin" verify user registration status is Activated
    And "Admin" verify user profile as "ROLE_STAFF"
    And "Admin" sorts the page by ID in Descending order
    Then "Admin" deletes that registered user
    And "Admin" confirms the delete option
    And "Admin" verify that user is deleted
    And "Admin" closes the app


  @TC_04_admin_role
  Scenario: Admin can assign ADMIN role to a registered user and delete it as well
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
    And "Admin" selects "ROLE_ADMIN" from profiles
    And "Admin" clicks on Save button
    And "Admin" sorts the page by ID descending order
    Then "Admin" verify user registration status is Activated
    And "Admin" verify user profile as "ROLE_ADMIN"
    And "Admin" sorts the page by ID in Descending order
    Then "Admin" deletes that registered user
    And "Admin" confirms the delete option
    And "Admin" verify that user is deleted
    And "Admin" closes the app

  @TC_05_user_role
  Scenario: Admin can assign USER role to a registered user and delete it as well
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
    And "Admin" selects "ROLE_USER" from profiles
    And "Admin" clicks on Save button
    And "Admin" sorts the page by ID descending order
    Then "Admin" verify user registration status is Activated
    And "Admin" verify user profile as "ROLE_USER"
    And "Admin" sorts the page by ID in Descending order
    Then "Admin" deletes that registered user
    And "Admin" confirms the delete option
    And "Admin" verify that user is deleted
    And "Admin" closes the app

  @TC_06_patient_role
  Scenario: Admin can assign PATIENT role to a registered user and delete it as well
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
    And "Admin" selects "ROLE_PATIENT" from profiles
    And "Admin" clicks on Save button
    And "Admin" sorts the page by ID descending order
    Then "Admin" verify user registration status is Activated
    And "Admin" verify user profile as "ROLE_PATIENT"
    And "Admin" sorts the page by ID in Descending order
    Then "Admin" deletes that registered user
    And "Admin" confirms the delete option
    And "Admin" verify that user is deleted
    And "Admin" closes the app







