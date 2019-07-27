Feature: Log in to the application
  To listen my favorite music
  As a registered user
  I would like to log in to listen my music

  @test
  Scenario: Log in with valid credentials
    Given Sergey is a registered user
    When he sends their credentials
    Then should be able to access to their favorite music