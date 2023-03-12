@US20
Feature: Health_Project_US20

  Background:User_goes_to_url
    When "Admin" goes home page
    When "Admin" clicks account menu dropdown
    Then "Admin" clicks sign in button
    And "Admin" enters "admin_username" in username field
    And "Admin" enters "admin_password" in password field
    And "Admin" clicks sign in submit button

  @registration
  Scenario Outline:TC_01_Registration
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<SSN>" into SSN input field
    And User enters the "<First Name>" into First Name input field
    And User enters the "<Last Name>" into Last Name input field
    And User enters the "<Username>" into Username input field
    And User enters the "<Email>" into Email input field
    And User enters the "<password>" into New Password input field
    And User enters the "<second password>" into New Password Confirmation input field
    And User clicks on Register submit button
    Then Verify that success message appears
    And User closes the application
    Examples:
#    | SSN         | First Name    | Last Name | Username      | Email               | password | second password |
#    | 443-11-4336 | Adele01-staff | Watson    | adele01team02 | adeline02@gmail.com | Adele1!  | Adele1!         |
#    | 443-22-4336 | Adele02-staff | Watson    | adele02team02 | adeline02@gmail.com | Adele1!  | Adele1!         |
#    | 443-33-4446 | Adele03-staff | Watson    | adele03team02 | adeline03@gmail.com | Adele1!  | Adele1!         |

  @admin
  Scenario:TC02_activate_registered_user
    Then Admin clicks administration dropdown
    And Admin click user management button
    Then Admin sort page by ID descending order
    And Admin click edit button of last registered user
    And Admin click Activated checkbox
    And Admin select "ROLE_STAFF" from profiles
    And Admin click save button
    And Admin sort page by ID descending order
    Then Admin verify user registration status Activated
    Then Admin verify user profiles "ROLE_STAFF"
    Then Admin close the app



  Scenario Outline:TC03_admin_searches_staff_by_SSN
    Then Admin clicks administration dropdown
    And Admin click user management button
    And Admin clicks on Items&Titles dropdown
    And Admin clicks on Staff from the dropdown
    And Admin clicks on Create A New Staff Button
    And Admin clicks on User Search checkbox
    And Admin types "<SSN>" into SSN field in New Staff Page
    And Admin clicks on Search User button
    Then Verify that message User found with search SSN pops up
    And Admin close the app
    Examples:
      | SSN         |
      | 443-11-4336 |


  @staff_search_and_info_populated
  Scenario Outline:TC04_staff_search_and_check_info_populated
    And Admin clicks on Items&Titles dropdown
    And Admin clicks on Staff from the dropdown
    And Admin clicks on Create A New Staff Button
    And Admin clicks on User Search checkbox
    And Admin types "<SSN>" into SSN field in New Staff Page
    And Admin clicks on Search User button
    Then Verify that message User found with search SSN pops up
    And Verify that firstname field is populated
    And Verify that lastname field is populated
    And Verify that birth date field is populated
    And Verify that phone field is populated
    And Verify that gender field is populated
    And Verify that blood group field is populated
    And Verify that address field is populated
    And Verify that description field is populated
    And Verify that created date field is populated
    And Verify that user field is populated
    And Verify that country field is populated
    And Verify that state_city field is populated
    Then Admin close the app

    Examples:
      | SSN         |
      | 443-11-4336 |


  @admin_selects_staff_account_05
  Scenario Outline:TC05_admin_edits_registered_user
    Then Admin clicks administration dropdown
    And Admin click user management button
    And Admin sorts page by created date
    And Admin selects a "<login>" of registered user
    And Admin clicks on the view button to see user's account
    Then Admin close the app
    Examples:
      | login |
      | etta-team02 |


  @admin_edits_staff_account_06
  Scenario Outline:TC05_admin_edits_registered_user
    Then Admin clicks administration dropdown
    And Admin click user management button
    And Admin sorts page by created date
    And Admin selects a "<login>" of registered user
    And Admin clicks on the edit button to see user's account
    And Admin types "<SSN>" into SSN field in Edit Page
    And Admin clicks on the Save Button
    And Admin sorts page by created date
    And Admin selects a "<login>" of registered user
    Then Verify that new SSN number of the user is "<SSN>"
    Then Admin close the app
    Examples:
      | login       | SSN         |
      | etta-team02 | 765-70-0907 |


#  //tbody//td[13]


  @admin_create_new_staff05
  Scenario Outline:TC06_admin_edits_registered_user
    Then Admin clicks administration dropdown
    And Admin click user management button
    And Admin clicks on Create a new user link
    And Admin enters login "<login>"
    And Admin enters the firstname "<firstname>"
    And Admin enters the lastname "<lastname>"
    And Admin enters the email  "<email>"
    And Admin enters the SSN "<SSN>"
    And Admin selects the language from the drop down
    And Admin select "ROLE_STAFF" from profiles
    And Admin clicks on the Save Button
    Then Verify that success message New User is Created pops up
    Then Admin close the app
    Examples:
      | login | firstname | lastname | email | SSN |
      | etna-team02 | Etna  | Watson | etna@gmail.com | 345-70-9378 |


  @admin_delete_staff10
  Scenario Outline:TC07_admin_edits_registered_user
    Then Admin clicks administration dropdown
    And Admin click user management button
    And Admin sorts page by created date
    And Admin selects a "<login>" to be deleted
    And Admin clicks on the delete button
    And Admin clicks on delete button
    And Verify that confirm delete opp pop up appears
    And Admin clicks on delete pop up button
    Then Verify that message delete is successful appears
    Then Admin close the app
    Examples:
      | login |
      | xsxss |
