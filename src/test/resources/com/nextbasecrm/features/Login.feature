@login
Feature: Login

  Scenario Outline: Positive login
    Given I am on a login page
    When I enter "<username>" and "<password>"
    Then I should be able to see the dashboard page

    Examples:
      | username                       | password |
      | marketing36@cybertekschool.com | UserUser |
      | hr37@cybertekschool.com        | UserUser |
      | helpdesk38@cybertekschool.com  | UserUser |

  Scenario Outline: Negative login
    Given I am on a login page
    When I enter "<username>" and "<password>"
    Then I shouldn't be able to see the dashboard page

    Examples:
      | username                       | password |
      | marketing36@cybertekschool.com |          |
      |                                | UserUser |
