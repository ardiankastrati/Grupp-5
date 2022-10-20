Feature: I want to calculate results for all different disciplines.

  Scenario Outline: LongJump
    Given I have selected <discipline>
    And I enter the <result>
    When I press calculate
    Then I verify the <score>

    Examples: 
      | discipline       | result | score | errormessage |
      | "Long Jump"      |    250 |    16 |              |
   
   