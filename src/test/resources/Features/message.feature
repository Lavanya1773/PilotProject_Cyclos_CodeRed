 Feature: The user accessing the Message functionality
  
 @MessageFuctionality
 Scenario: The user view the message history and The user send the message.
 
 Given User launch the url
 When User provide valid username and password
 And User choose the Message Tab
 And User select the Sent message option
 And User gets the number of results in that page
 And User choose the inbox option
 And User gets the number of results in that page
 And User choose the Trash option
<<<<<<< HEAD
 Then User gets the number of results in that page
 When User Creating new message
 And Enter the required details
 Then User receives a verification message

 
=======
 Then User gets the number of results in that pages
 When User Creating new message
 And Enter the required details
 Then User receives a verification message
>>>>>>> main
