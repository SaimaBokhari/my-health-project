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


  @TC_01_happy_path
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


  @TC_02_invalid_credentials
  Scenario: Admin checks registered user's information with invalid credentials
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on any id from among the registered users
    Then "Admin" can see "login" of that registered user
    Then verify login name of the registered user doesn't match
    And "Admin" can see "firstname" of that registered user
    Then verify firstName box contains invalid first name of that user
    And "Admin" can see "lastname" of that registered user
    Then verify lastName box contains invalid last name of that user
    And "Admin" can see "email" of that registered user
    Then verify email box contains invalid email of that user
    And "Admin" can see "createdBy" for that user
    Then verify createdBy box contains invalid information for that user
    And "Admin" can see "modifiedBy" for that user
    Then verify modifiedBy box contains invalid information for that user
    And "Admin" can see "modifiedDate" for that user
    Then verify modifiedDate box contains invalid information for that user
    And "Admin" closes the app


  @TC_03_patient_role
  Scenario: Admin can assign patient role to a registered user and delete it as well
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
 #   Then "Admin" clicks on Activated checkbox
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

  @TC_04_delete_patient
  Scenario: Admin can assign delete registered user with profile ROLE-PATIENT
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on delete button of the user registered as patient
    Then "Admin" clicks on pop up window
    And "Admin" confirms delete option
    Then "Admin" verify patient is deleted
    And "Admin" closes the app


  @TC_05_staff_role
  Scenario: Admin can assign registered user as staff
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
    Then "Admin" clicks on Activated checkbox
    And "Admin" selects "ROLE_STAFF" from profiles
    And "Admin" clicks on save button
    And "Admin" sorts the page by ID descending order
    Then "Admin" verify user registration status is Activated
    And "Admin" verify user profile as "ROLE_STAFF"
    And "Admin" closes the app

  @TC_06_delete_staff
  Scenario: Admin can assign delete registered user with profile ROLE-STAFF
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on delete button of the user registered as staff
    Then "Admin" clicks on pop up window
    And "Admin" confirms delete option
    Then "Admin" verify staff is deleted
    And "Admin" closes the app

  @TC_07_admin_role
  Scenario: Admin can assign registered user as ADMIN
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
    Then "Admin" clicks on Activated checkbox
    And "Admin" selects "ROLE_ADMIN" from profiles
    And "Admin" clicks on save button
    And "Admin" sorts the page by ID descending order
    Then "Admin" verify user registration status is Activated
    And "Admin" verify user profile as "ROLE_ADMIN"
    And "Admin" closes the app

  @TC_08_delete_admin
  Scenario: Admin can assign delete registered user with profile ROLE-ADMIN
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on delete button of the user registered as admin
    Then "Admin" clicks on pop up window
    And "Admin" confirms delete option
    Then "Admin" verify admin is deleted
    And "Admin" closes the app

  @TC_09_user_role
  Scenario: Admin can assign registered user as user - ROLE-USER
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
    Then "Admin" clicks on Activated checkbox
    And "Admin" selects "ROLE_USER" from profiles
    And "Admin" clicks on save button
    And "Admin" sorts the page by ID descending order
    Then "Admin" verify user registration status is Activated
    And "Admin" verify user profile as "ROLE_USER"
    And "Admin" closes the app

  @TC_10_delete_user
  Scenario: Admin can delete registered patient
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on delete button of the user registered as user
    Then "Admin" clicks on pop up window
    And "Admin" confirms delete option
    Then "Admin" verify user is deleted
    And "Admin" closes the app

  @TC_11_physician_role
  Scenario: Admin can assign registered user as physician
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on edit button of any registered user
    Then "Admin" clicks on Activated checkbox
    And "Admin" selects "ROLE_PHYSICIAN" from profiles
    And "Admin" clicks on save button
    And "Admin" sorts the page by ID descending order
    Then "Admin" verify user registration status is Activated
    And "Admin" verify user profile as "ROLE_PHYSICIAN"
    And "Admin" closes the app

  @TC_11_delete_physician
  Scenario: Admin can delete registered physician
    When "Admin" sorts the page by ID in Descending order
    And "Admin" clicks on delete button of the user registered as physician
    Then "Admin" clicks on pop up window
    And "Admin" confirms delete option
    Then "Admin" verify physician is deleted
    And "Admin" closes the app






