Feature: As an user i want to get all data

  @Get
  Scenario: As user i want to get all data
    Given user has set Get endpoint
    When user send Get user endpoint
    Then user see status code 200