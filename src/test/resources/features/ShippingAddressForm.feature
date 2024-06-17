Feature: Shipping Address Form

  Scenario Outline: Enter Shipping addresses

    Given User signs in using "<emailid>" and "<password>"
    And User is on the shipping address form
    When User enters the address "<address>"
    And User enters the city "<city>"
    And User enters the country "<country>"
    And User enters the zip code "<zip_code>"
    And User enters the first name "<first_name>"
    And User enters the last name "<last_name>"
    Then User submits the address form

    Examples:
      | emailid              | password | address     | city      | country | zip_code | first_name | last_name |
      | johny8q1@gmail.com  | asdf1234  | 123 Main St | Bangalore | India   | 755019   | Annay      | Mohanty   |
