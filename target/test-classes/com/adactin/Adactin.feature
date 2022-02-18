Feature: Hotel Booking In Adactin Application

Scenario: Login page

Given user Launch The Application
When user Enter the Username In Username Field
And  user Enter The Password In Password Field
Then user Click On Login Button And Navigate To The Search Hotel Page

Scenario: Search Hotel Page

when user Select The Location 
And user Select The Hotels
And user Select The Number Of Room
And user Select The Check In And Out Date
And user Select The Adult Room
Then user Click On Search Button And Navigate To Select Hotel Page

Scenario: select Hotel
Then click On Select Button And Also Click On Continue Button And It Navigates To The Book Hotel Page

when user Enter The First Name And Last Name, Billing Address, Credit Card No And CCV Value
Then then User Will Click On Booking Confirmation

Scenario: Booking confirmation
Then click On Booked Itinerary And It Navigates To The Booked Itinerary Page

Scenario: Booked Itineracy

