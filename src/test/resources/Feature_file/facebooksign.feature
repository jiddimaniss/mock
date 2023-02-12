Feature: Testing For Facebook Sinup Page

  Scenario: verify the sign up page
    When user open a url
    Then enter login creadtinals
      | santosh | 123456 |
    And click on create new button
    Then enter the signup information
      | Fristname   | Virat     |
      | lastname    | Kohli     |
      | mobile num. | 697438135 |
      | pass        |      6439 |
      
      
