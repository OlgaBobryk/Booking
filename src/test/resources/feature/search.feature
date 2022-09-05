Feature: Search

  Scenario: Search for hotel
    Given Main Booking Page is opened
    When User enters "Congress Plaza Hotel Chicago" into the "Destination/property name:" field
    And Clicks  "Search" Button
    Then "Congress Plaza Hotel Chicago" is presented on  page

  Scenario: Hotel rating check
    Given Main Booking Page is opened
    When User enters "Congress Plaza Hotel Chicago" into the "Destination/property name:" field
    And Clicks  "Search" Button
    Then "7.3" is presented for "Congress Plaza Hotel Chicago"



