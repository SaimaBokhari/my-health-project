Feature:Registration

  Background:User_goes_to_url
    Given User goes to the home page


  @registration
  Scenario Outline:Registration
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
      | SSN         | First Name | Last Name | Username        | Email               | password | second password |
      | 443-35-4336 | Adeline22  | Watson    | adeline22team02 | adeline22@gmail.com | Adele1!  | Adele1!         |

    # ******  need to change credentials in every usage  *************
