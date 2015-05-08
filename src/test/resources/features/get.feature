# language: en

Feature:
  test the http get

  Scenario: normal get
    Given an id joejoejoejoejoe
    When call the get method with this id
    Then the http status code should be 200
    And the mid in response should be 000005545036

  Scenario:
      When post a new merchandise
      Then the http status code should be 200

