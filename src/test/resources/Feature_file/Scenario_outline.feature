Feature: Testing TestProject

  Scenario Outline: Verify the personal info
    Given user open the website
    Then user enter the "<Username>" & "<Password>"
    Then user verify the Title
    Then user enter "<Adderss>" & "<Email>"& "<Phone>"
     then
    Examples: 
      | Username | Password | Adderss     | Email           | Phone      |
      | Snantosh |    12345 | Maharashtra | abc@gmail.com   | 9741361135 |
      | Santosh  |    12345 | solapur     | Rohit@gmail.com | 6597923651 |
      | Santosh  |    12345 | akkalkot    | Yuraj@gmai.com  | 3691254786 |
      | Santosh  |    12345 | india       | Virat@gmail.com | 8745213698 |
    
