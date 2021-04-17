@blocks
Feature:
  Scenario:Opening the blog by clicking picture
    Given User will be on home page
    When User will click on blog section
    And User will click to picture
    Then User will see the correct blog

  Scenario:Opening page 2 of blogs posted in English Article
    Given User will be on home page
    When User will click on blog section
    And User will click to English Article
    And User will click to second page
    Then User will see the list of English Articles

  Scenario:Opening blog by clicking headline title
    Given User will be on home page
    When User will click on blog section
    And User will click to headline title
    Then User will see the blog

  Scenario:Opening source link in the blog
    Given User will be on home page
    When User will click on blog section
    And User will open the blog
    And User will click the source link
    Then User will see the IELTS destination page


  Scenario:Opening writings with the tag Online learning
    Given User will be on home page
    When User will click on blog section
    And User will click to English Article
    And User will click to Online learning tag
    Then User will see the list of Articles with the Online learning tag
