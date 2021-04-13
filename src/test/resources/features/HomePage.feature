
#Autor: Ebru Kul

Feature: HomePage Feature
  Scenario:Lesson Duration
    Given User is on the ISpeakBetter HomePage
    When User clicks to Try for Free
    Then Sign in window pops up


  Scenario: See the Courses
    Given User is on the ISpeakBetter HomePage
    When User clicks on 'See our courses button
    Then User is on the Courses Provided page

  Scenario: Learnmore Link
    Given User is on the ISpeakBetter HomePage
    When User clicks on LearnMore
    Then User is on the LearnMore page

  Scenario: Select Duration
    Given User is on the ISpeakBetter HomePage
    When User selects duration for 30 min
    Then User sees it on the duration selection box

  Scenario: Select Program
    Given User is on the ISpeakBetter HomePage
    When User selects program for Business English
    Then User sees it on the program selection box

