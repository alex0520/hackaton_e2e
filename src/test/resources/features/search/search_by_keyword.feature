Feature: Search music by keyword

  @test
  Scenario: Searching for artist
    Given Sergey like to listen music
    When he searches for "Calamaro"
    Then all the result titles should contain the word "Calamaro"