Feature: Test website TradeMe to get numbers of options and cars

  @Test1
  Scenario: The user visit the website TradeMe and get the numbers of car's options in the make's dropbox
    Given The user go to website TradeMe
    When go to the header's option motor
    And select the Make's dropbox
    Then the numbers of car's model available to search is 98


  @Test2
  Scenario Outline: The user visit the website TradeMe and get the numbers of car's options in the make's dropbox
    Given The user go to website TradeMe
    When go to the header's option motor
    And select "<Model Car>" in the Make's dropbox
    And do the search
    Then the number of results of this search is <Result>

    Examples:
      | Model Car | Result  |
      | Ferrari   | 46      |
      | BMW       | 2282   |
      | Mazda     | 3982   |
      | Honda     | 1733   |