Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    ##And I enter the users email address as Email:admin
    ##And I verify the count of my salary digits for Rs 1000000
    ##And I just need to see how step looks for Cucumber-Java8
    And I enter the following for Login
      | username                  | password   |
      | cynthiardzdel@hotmail.com | cecret1234 |
    And I click login button
    Then I should see the userform page

  ##Scenario Outline: Login with correct username and password using Scenario outline
    ##Given I navigate to the login page
    ##And I enter <username> and <password>
    ##And I click login button
    ##Then I should see the userform page

    ##Examples:
      ##| username | password      |
      ##| admin    | adminpassword |
      ##| execute  | automation    |