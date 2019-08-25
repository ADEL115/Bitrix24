Feature:
  User Story: As a user I should be able to create a task from activity stream

  Scenario: Verify that user can create new task by clicking on tasks on activity stream
    Given I login as "marketing"
    When I click on Tasks
    Then I should be able to create new task

  Scenario: Verify that user can upload a file and image or link or add checklist regarding to new task
    Given I login as "help desk"
    When I click on Tasks
    And I click New Task
    Then I should be able to add "files and images"
    And I should be able to add "link"
    And I should be able to add "checklist"

  Scenario: Verify that user should be able to set up a deadline for new task
    Given I login as "hr"
    When I click on Tasks
    And I click New Task
    Then I should be able to add "deadline"

