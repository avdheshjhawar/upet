Feature: sign up and HEIC image upload

  Scenario:
    Given user is present on sign in page
    When user click on create account link
    Then verify user redirected to create account page
    When user enter all details
    And click on create account button
    Then user redirected to pets page
    When user click on user profile
    Then user redirected to user profile page
    And user upload profile image
    Then verify successful message

