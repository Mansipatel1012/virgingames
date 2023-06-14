@regression
Feature: Top menu headers

  As users I want to login in to virgingames website

  Scenario Outline: I am on homepage
    When  I click on accept cookies
    Then  I click on all "<tabs>"
    Examples:
      |     tabs       |
      |  Online slots  |
      |   Live Casino  |
      |     Casino     |
      |     Slingo     |
      |  Online Bingo  |
      |   Free Games   |
      |     Poker      |
      |   All Games    |