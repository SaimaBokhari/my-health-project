@registration_password
Feature:Password_strength_test

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


  @reg_pass_length_6_two_criteria
  Scenario Outline: TC_01_Verify_password_strength_when_pass_length_6_two_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is weak-red
    And User closes the application
    Examples:
      | password |
      | 12345W   |
      | 12345a   |
      | 12345!   |

  @reg_pass_length_6_all_criteria
  Scenario Outline: TC_02_Verify_password_strength_when_pass_length_6_four_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is weak-red
    And User closes the application
    Examples:
      | password |
      | 123!wW   |
      | 123&Wa   |
      | 123Ss!   |


  @reg_pass_length_3_three_criteria
  Scenario Outline:TC_03_Verify_password_strength_when_pass_length_3_three_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    And User clicks on Register submit button
    Then Verify that password strength is weak-red
    Then Verify that error message appears
    And User closes the application
    Examples:
      | password |
      | Aid      |
      | 1Bb      |
      | 1@B      |


  @reg_pass_length_0
  Scenario: TC_04_Verify_password_strength_when_pass_length_0
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User clicks on Register submit button
    Then Verify that password strength is weak-red
    And Verify that the error message appears
    And User closes the application


  @reg_pass_length_4_one_criteria
  Scenario Outline:TC_05_Verify_password_strength_when_pass_length_4_one_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is weak-red
    And User closes the application
    Examples:
      | password |
      | 1234     |
      | ABCD     |
      | abcd     |


  @reg_pass_length_4_all_criteria
  Scenario Outline:TC_06_Verify_password_strength_when_pass_length_4_all_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is weak-red
    And User closes the application
    Examples:
      | password |
      | 1Aa!     |
      | Aa2!     |
      | aA.5     |

  @reg_pass_length_4_three_criteria
  Scenario Outline:TC_07_Verify_password_strength_when_pass_length_4_three_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is weak-red
    And User closes the application
    Examples:
      | password |
      | 1Aab     |
      | Aa2c     |
      | aA.d     |


  @reg_pass_length_7_all_criteria
  Scenario Outline:TC_08_Verify_password_strength_when_pass_length_7_four_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is the strongest-green
    And User closes the application
    Examples:
      | password |
      | 123Wd!7  |
      | A.2e!67  |
      | Ai5!123  |


  @reg_pass_length_7_one_criteria
  Scenario Outline:TC_09_Verify_password_strength_when_pass_length_7_one_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is weak-red
    And User closes the application
    Examples:
      | password |
      | 1234567  |
      | ABCDEFG  |
      | abcdefg  |

  @reg_pass_length_7_two_criteria
  Scenario Outline:TC_10_Verify_password_strength_when_pass_length_7_two_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is good-orange
    And User closes the application
    Examples:
      | password |
      | 123W567  |
      | A234567  |
      | a234567  |

  @reg_pass_length_7_three_criteria
  Scenario Outline:TC_11_Verify_password_strength_when_pass_length_7_three_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is strong-green
    And User closes the application
    Examples:
      | password |
      | 123Wd67  |
      | A.67867  |
      | AB5!123  |


  @reg_pass_length_8_all_criteria
  Scenario Outline:TC_12_Verify_password_strength_when_pass_length_8_four_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is the strongest-green
    And User closes the application
    Examples:
      | password |
      | 12345Wa! |
      | A.2e!678 |
      | Ai5!1238 |



  @reg_pass_length_8_one_criteria
  Scenario Outline:TC_13_Verify_password_strength_when_pass_length_8_one_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is weak-red
    And User closes the application
    Examples:
      | password |
      | 12345789 |
      | ABCDEFGE |
      | abcdefge |


  @reg_pass_length_8_three_criteria
  Scenario Outline:TC_14_Verify_password_strength_when_pass_length_8_three_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is strong-green
    And User closes the application
    Examples:
      | password |
      | 12345Wa  |
      | 12345W!  |
      | 12345W.  |



  @reg_pass_length_max_50_one_criteria
  Scenario Outline:TC_15_Verify_password_strength_when_pass_length_50_one_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is weak-red
    And User closes the application
    Examples:
      | password                                           |
      | 12345678901234567890123456789012345678901234567890 |
      | 12345678901234567890123456789012345678901234567777 |
      | 12345678901234567890123456789012345678901234565555 |

  @reg_pass_length_max_50_four_criteria
  Scenario Outline:TC_16_Verify_password_strength_when_pass_length_50_four_criteria
    When User clicks on "User Icon" in the top right corner
    And User clicks on Register from drop down menu
    And User enters the "<password>" into New Password input field
    Then Verify that password strength is the strongest-green
    And User closes the application
    Examples:
      | password                                           |
      | 123456789012345678901234567890123456789012345Aa.45 |
      | 12345678901234567890123456789012345678901234567W!w |
      | 12345678901234567890123456789012345678901234567H?f |




