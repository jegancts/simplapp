#Check visa requirement for study from Japan to UK  -- DEMO Feature File
#Created By : Vimalnath N
#Creation Date: 02-Aug-2020
Feature: UK Study search


  Scenario Outline: Confirm whether a visa is required to visit the UK
    Given I provide a nationality of "<Nationality>"
    And I select the reason “<Study>”
    And I state I am intending to stay for "<Duration>"
    When I submit the form
    Then I will be informed “<I need a visa to study in the UK”

    Examples:
      |Nationality_VAR|Study_VAR|Duration_VAR|
      |Japan          |Study    |longer than 6 months|




