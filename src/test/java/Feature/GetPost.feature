Feature: Verify different Get Operations using Rest-Assured

  Scenario: Verify one Author of host
    Given I perform GET operation for "/post"
    And I perform GET operation for post number "1"
    Then I should be able to see the author name "Mark Tester"

  Scenario: Verify collection of Author in the post
    Given I perform GET operation for "/post"
    Then I should be able to see the author names

  Scenario: Verify path parameters of Author in the post
    Given I perform GET operation for "/post"
    Then I should be able to see the path parameter