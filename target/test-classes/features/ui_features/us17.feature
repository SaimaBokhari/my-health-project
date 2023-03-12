@US17
Feature: Room creation / View / Update / Delete

  Background:Doctor_goes_homepage_and_signin
    Given "Admin" goes home page
    When "Admin" clicks account menu
    And "Admin" clicks sign in
    And "Admin" enters "admin_username" in username field
    And "Admin" enters "admin_password" in password field
    And "Admin" clicks sign in submit button
    And "Admin" clicks items&titiles menu
    And "Admin" clicks room

  Scenario: TC01 User (Admin) can create new rooms for impatients
    When "Admin"clicks create a new room button
    And "Admin"enters room number
    And "Admin"enters room price
    And "Admin"clicks save button
    And "Admin" clicks ID for sort list
    And "Admin" get room id
    Then "Admin" verify "room_number" from Rooms Page
    Then "Admin"verify "room_id" from API
    Then "Admin"verify "room_id" from DB
    And Admin close the app

  Scenario: TC02  there should be room number and room type
    When "Admin"clicks create a new room button
    Then "Admin" verify "room_number" field is required.
    And "Admin"enters room number
    And "Admin"select room type "DELUXE"
    And "Admin"enters room price
    And "Admin"clicks save button
    And "Admin" clicks ID for sort list
    And "Admin" get room id
    Then "Admin" verify "room_number" from Rooms Page
    Then Admin verify room_type is "DELUXE" from Rooms Page
    Then "Admin" verify roomNumber from API
    Then "Admin" verify room_number from DB
    Then Admin verify room_type is "DELUXE" from API
    Then Admin verify "room_type" is "DELUXE" from DB
    And Admin close the app


  Scenario: TC03 Current status can be set for the room
    When "Admin"clicks create a new room button
    And "Admin"enters room number
    And "Admin"enters room price
    And "Admin" clicks status
    And "Admin"clicks save button
    And "Admin" clicks ID for sort list
    And "Admin" get room id
    Then "Admin" verify status from Rooms Page
    Then "Admin" verify status is "true" from API
    Then Admin verify "status" is "t" from DB
    And Admin close the app

  Scenario: TC04 Price can be added and cannot be blank
    When "Admin"clicks create a new room button
    And "Admin"enters room number
    And Admin verify "price" field is required.
    And "Admin"enters room price
    And "Admin"clicks save button
    And "Admin" clicks ID for sort list
    And "Admin" get room id
    Then Admin verify "price" from API
    Then Admin verify "price" from DB
    And Admin close the app

  Scenario: TC05 Description can be provided optionally
    When "Admin"clicks create a new room button
    And "Admin"enters room number
    And "Admin"enters room price
    And "Admin"clicks save button
    And "Admin" clicks ID for sort list
    And "Admin" get room id
    Then "Admin" verify "room_number" from Rooms Page
    And Admin close the app

  Scenario: TC06 Created date as MM/DAY/YEAR and cannot be typed earlier
    When "Admin"clicks create a new room button
    And Admin enters "12.12.2000 00:00" in Created Date field
    Then Admin verify earlier date can typed
    And Admin close the app

  Scenario: TC07 Admin can view all rooms with same items
    And "Admin" verify all rooms on the page has "Room Number" header
    And Admin close the app

  Scenario: TC08 Admin can edit(update) existing rooms
    And "Admin" clicks ID for sort list
    And "Admin" get room id
    And "Admin" click edit button of lastest room
    And "Admin" change "room_number"
    And "Admin"clicks save button
    And "Admin" clicks ID for sort list
    Then "Admin" verify "room_number" from Rooms Page
    Then "Admin" verify roomNumber from API
    Then "Admin" verify room_number from DB
    And Admin close the app