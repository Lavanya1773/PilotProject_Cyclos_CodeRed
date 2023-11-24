Feature: User using Search Advertisements in Marketplace tab available in Cyclos Payment Software Application
 
Scenario: User uses Price Highest filter
Given User launches the url of the web page
When User provide correct username and password
And User goes to List ads
And User applies the filter tab
And User chooses price highest filter
And User clicks for the product and added to favorites
And User enables the checkbox (Show only favorites)
Then User prints the total number of results available in favorites after added from highest filter
 
Scenario: User access Price Lowest filter
Given User launches the url of the web page
When User provide correct username and password
And User goes to List ads
And User applies the filter tab
And User chooses price lowest filter
And User clicks for the product and adds it  to favorites
And User enables the checkbox (Show only favorites)
Then User prints the total number of results available in favorites after added from lowest filter

Scenario: User access Price Relevance filter
Given User launches the url of the web page
When User provide correct username and password
And User goes to List ads
And User applies the filter tab
And User chooses relevance filter
And User clicks for the product ann adds it to favorites
And User enables the checkbox (Show only favorites)
Then User prints the total number of results available in favorites after added from relevance filter
 
Scenario: User removes a product from Price Highest filter
Given User launches the url of the web page
When User correct valid username and password
And User enables the checkbox (Show only favorites)
And User removes a product from list
Then user prints the total number of results available in favorites after removing product