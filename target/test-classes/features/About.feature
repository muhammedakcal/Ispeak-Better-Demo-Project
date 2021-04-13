

Feature:About Feature

  Scenario:We are cahecking base url

    Given User on the About page
    When I see correct url
    Then Verify Url

  Scenario:We are cahecking about page links

    Given User on the About page
    When User clicks to term_conditions page
    Then Verify that you switch to the Terms & Conditions  page

  Scenario:We are cahecking about page links

    Given User on the About page
    When User clicks to PrivacyPolicy page
    Then Verify that you switch to the PrivacyPolicy  page


  Scenario:We are cahecking about page links

    Given User on the About page
    When User clicks to Contact Us page
    Then Verify that you switch to the Contact Us  page


  Scenario:We are cahecking about page links

    Given User on the About page
    When User clicks to Partners page
    Then Verify that you switch to the Partners  page




