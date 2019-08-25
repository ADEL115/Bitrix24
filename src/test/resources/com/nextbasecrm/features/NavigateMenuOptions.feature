Feature: Navigate module options

  @wip
  Scenario Outline: Verify module title
    Given I login as "<user>"
    When I click on "<module>"
    Then The title should be "<title>"

    Examples: help desk

      | user      | module           | title                   |
      | help desk | Activity Stream  | Portal                  |
      | help desk | Tasks            | My tasks                |
      | help desk | Chat and Calls   | Chat and Calls          |
      | help desk | Workgroups       | Workgroups and projects |
      | help desk | Drive            | My Drive                |
      | help desk | Calendar         | Calendar                |
      | help desk | Mail             | Mailbox Integration     |
      | help desk | Contact Center   | Contact Center          |
      | help desk | Time and Reports | Absence Chart           |
      | help desk | Employees        | Company Structure       |
      | help desk | Services         | Meeting Rooms           |
      | help desk | Company          | Company                 |


