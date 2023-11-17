//package com.stepdefinitions;
//
//import com.actions.MessageActions;
//import com.utility.HelperClass;
//import com.utility.UtilityClassMessage;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class messageStepDefanition {
//	
//    //Object created for utility file and action file.
//	
//	UtilityClassMessage data1 = new UtilityClassMessage();
//	MessageActions objMess = new MessageActions();
//	
//
//	@Given("User launch the url")
//	public void user_launch_the_url() {   
//		HelperClass.openPage(data1.url);
//	    System.out.println("url open");	
//	}
//	
//    
//	@When("User provide valid username and password")
//	public void user_provide_valid_username_and_password() {	
//		System.out.println("User provides username and password to signIn");
//		objMess.setSignIn(data1.userName, data1.password);		
//	}
//	
//
//	@When("User choose the Message Tab")
//	public void user_choose_the_message_tab() {			
//		objMess.clickMessageIcon();
//		System.out.println("Message Tab is clicked !!");
//	}
//
//	@When("User select the Sent message option")
//	public void user_select_the_sent_message_option() {
//		objMess.clickSendMessageRadioButton();
//		System.out.println("Send Message Check Box is cliked");
//		
//	}
//
//	
//	@When("User gets the number of results in that page")
//	public void user_gets_the_number_of_results_in_that_page() {
//	    String resultSendMessage = objMess.getNumberResultInbox();
//	    System.out.println("The number of result is " +resultSendMessage);		
//	}
//
//	
//	@When("User choose the inbox option")
//	public void user_choose_the_inbox_option() {
//		objMess.clickInboxRadioButton();
//		System.out.println("Inbox Check Box is cliked");	
//	}
//
//	
//	@When("User choose the Trash option")
//	public void user_choose_the_trash_option() {
//		objMess.clickTrashRadioButton();
//		System.out.println("Trash Check Box is cliked");
//		
//	}
//
//	
//	@Then("User gets the number of results in that pages")
//	public void user_gets_the_number_of_results_in_that_pages() {
//		 String resultSendMessage1 = objMess.getNumberResultTrash();
//		 System.out.println("The number of result is " +resultSendMessage1);		
//	}
//
//	
//	@When("User Creating new message")
//	public void user_creating_new_message() {
//	   objMess.clickNewButton();
//	   System.out.println("User clicks the new message button");
//		
//	}
//
//	@When("Enter the required details")
//	public void enter_the_required_details() {
//	    objMess.setUserName(data1.User);
//	    objMess.setSubject(data1.Subject);
//	    objMess.setDescription(data1.Description);	
//	    System.out.println("The Message details are included");
//	    
//	    objMess.clickSendButton();
//	    System.out.println("The send button clicked");
//	}
//
//	
//	@Then("User receives a verification message")
//	public void user_receives_a_verification_message() {
//	    String successMess =objMess.getSuccessMess();
//	    System.out.println("The success message is " +successMess);
//				
//	}	
//}
