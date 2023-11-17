Feature: User Accessing Marketplace feature available in Cyclos Web Application

Scenario: User access Search Advertisements

Given User launches the url
When User provide valid username and password
And User choose List ads 
And User choose the filter tab
And User choose the price highest filter
And User clicks for the productOne and added to favorites 
And User again clicks for the productTwo and added to favorites
And  User choose the price lowest filter 
And User clicks for the productThree and adds it  to favorites 
And User clicks for the productFour and adds it  to favorites
And User enables the checkbox (Show only favorites)
And User remove the products from favorites
Then User is going to print the total number of results available in favorites
