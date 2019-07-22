Feature: login functionality

   #work in progress
  Scenario: teacher login
   # Given user on the login page
    When user logs in using "myemail@gmail.com" and "mysecurepassword"
    #Then homepage should be displayed
    And the title should be "my application title"
    And there should be 22 menu options