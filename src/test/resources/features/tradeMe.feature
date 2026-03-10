Feature: Test website TradeMe to get numbers of options and cars

  @Test1
  Scenario: The user visit the website TradeMe and get the numbers of car's options in the make's dropbox
    Given The user go to website TradeMe
    When go to the header's option motor
    And select the Make's dropbox
    Then get the numbers of car's model available to search


#  @Test2
#  Scenario Outline: The user visit the website TradeMe and get the numbers of car's options in the make's dropbox
#    Given The user go to website TradeMe
#    When go to the header's option motor
#    And select "<ModelCar>" in the Make's dropbox
#    And do the search
#    Then get the numbers of result of this search
#
#    Example:
#      | Model Car |
#      | Ferrari   |
#      | BMW       |
#      | Mazda     |
#      | Honda     |