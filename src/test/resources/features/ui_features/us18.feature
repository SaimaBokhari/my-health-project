@TestItem
Feature:Create new test items
  Background:
    Given Admin is logged in as an admin user
    When Admin navigate to the create test item page

  Scenario: Admin can create new test item
    #Given Admin is logged in as an admin user
    #When Admin navigate to the create test item page
    Then Admin should see the required fields for creating or updating test items
    When Admin fill in the necessary fields to create a new test item
    And Admin save the new test item
    Then Admin should see the new test item added to the list of test items


  Scenario: Admin can view test items
    #Given Admin is logged in as an admin user
    #When Admin navigate to the create test item page
    Then Admin should see all the created test items displayed on the page


  Scenario: Admin can delete test item
    #Given Admin is logged in as an admin user
    And Admin have at least one test item created
    #When Admin navigate to the test items page
    And Admin select the test item that needs to be deleted
    And Admin confirm the deletion
    Then Admin should see the test item is no longer displayed on the test items page



  Scenario: Validate test item API endpoints
    Given Admin have an API testing tool
    When Admin send API requests for creating, viewing, and deleting test items
    Then Admin should receive the expected status codes and data in the API responses


  Scenario: Admin can create test item using API
    Given Admin have an API testing tool
    When Admin send a POST request for creating a new test item
    Then Admin should see the new test item is created successfully
    And the API response contains the correct details of the created test item


  Scenario: Verify test items in database
    Given Admin have a database querying tool
    When Admin query the database for the test items
    Then Admin should see the data in the database matches the expected values for the created test items
