Feature: User Processing the Advertisement Interests in Marketplace feature available in Cyclos Payment Software Web Application

Scenario: User uses the Advertisement Interests
Given User launches the url of the Cyclos Web Application
When User clicks Advertisement Interests in the left column
And User clicks New interests 
And User provides the valid name
And User clicks the category dropdown
And User chooses any of the category based on interest
And User saved the interest
And User go back to the Advertisement interests 
Then User is going to print the total number of interests  

Scenario: User uses the Advertisement Interests
Given User launches the url of the Cyclos Web Application
When User clicks Advertisement Interests in the left column
And User clicks New interests 
And User provides the already exists name
And User saved the interest with the name which is already exsits
Then User gets a warning message
