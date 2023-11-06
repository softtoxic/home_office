@regression
Feature: Home Page Test
  As user I want to visit data set page

  @smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I accept cookies
    And I click on data set link
    Then I should navigate to HM land registry page successfully
