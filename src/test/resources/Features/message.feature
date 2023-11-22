Feature: The user accessing the Message functionality
 
@SendMessage
Scenario: The user view the message history of send message
Given Users launch the url
When Users provide valid username and password
And User choose the Message Tab
And User select the Sent message option
And User gets the number of results in send message page
Then Print the send messages
 
 
@InBoxMessage
Scenario: The user view the message history of inbox message
Given Users launch the url
When Users provide valid username and password
And User choose the Message Tab
And User choose the inbox option
And User gets the number of results in inbox page.
 
@TrashMessage
Scenario: The user view the message history of Trash message
Given Users launch the url
When Users provide valid username and password
And User choose the Message Tab
And User choose the Trash option
Then User gets the number of results in Trash pages
 
@MessageSendFunctionality
Scenario: The user send the message
 
Given Users launch the url
When Users provide valid username and password
And User choose the Message Tab
When User Creating new message
And Enter the required details
Then User receives a verification message
 
@MessageNotSend
Scenario: The user not able to send message without required details
 
Given Users launch the url
When Users provide valid username and password
And User choose the Message Tab
When User Creating new message
And User enter the user name and subject
Then User receives verification message shows the message not able to send