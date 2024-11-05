Feature: check home page functionality

Background:user is logged in
Given user is on login page
When user enters username and password
And click on login button
Then user navigate to home page

Scenario: check logout link

When user click on shahid patel
Then logout  link should display


Scenario: verify quick launch toolbar is present

When user click on performance
Then Employee toolbar should be display

