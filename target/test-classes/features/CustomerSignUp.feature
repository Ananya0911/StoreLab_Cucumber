Feature: Customer Sign-Up

  Scenario Outline: Sign up with different credentials

    Given I am on the sign-up page
    When I enter the first name "<firstName>"
    And I enter the last name "<lastName>"
    And I enter the email "<email>"
    And I enter the password "<password>"
    And I enter the confirm password "<confirmPassword>"
    And I submit the registration form
    Then I should see "<message>"


    Examples:
      | firstName | lastName | email                   | password       | confirmPassword    | message                       |
      | Johny     | Deo      | john41@gmail.com        | asdf1234       | asdf1234         | User created, Please log in! |
