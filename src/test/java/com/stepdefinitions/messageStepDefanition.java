package com.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.actions.MessageActions;
import com.utility.HelperClass;
import com.utility.UtilityClassMessage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class messageStepDefanition {
	
    //Object created for utility file and action file.
	UtilityClassMessage data1 = new UtilityClassMessage();
	MessageActions objMess = new MessageActions();	
	
	@Given("Users launch the url")
	public void user_launch_the_url() {
		HelperClass.openPage(data1.url);
	    System.out.println("url open");	
	    HelperClass.log.info("Cyclos URL is launched");
	}
	
 
	@When("Users provide valid username and password")
	public void user_provide_valid_username_and_password() {
		System.out.println("User provides username and password to signIn");
		objMess.setSignIn(data1.userName, data1.password);
		HelperClass.log.info("User enter valid user name and password");
		}

	@When("User choose the Message Tab")
	public void user_choose_the_message_tab() {
		objMess.clickMessageIcon();
		System.out.println("Message Tab is clicked !!");
		HelperClass.log.info("User selects the message tab");

	}

	@When("User select the Sent message option")
	public void user_select_the_sent_message_option() {
		objMess.clickSendMessageRadioButton();
		System.out.println("Send Message Check Box is cliked");
		HelperClass.log.info("User select the send message option");

	}

	
	@When("User gets the number of results in send message page")
	public void user_gets_the_number_of_results_in_send_message_page() {
		String resultSendMessage = objMess.getNumberResultSendMess();
   	    System.out.println("The number of result in send message " +resultSendMessage); 
		HelperClass.log.info("User gets the number of send messages");

	}

	
	@When("User choose the inbox option")
	public void user_choose_the_inbox_option() {
		objMess.clickInboxRadioButton();
		System.out.println("Inbox Check Box is cliked");
		HelperClass.log.info("User select the inbox option");

	}

	//Assertion included
	@When("User gets the number of results in inbox page.")
	public void user_gets_the_number_of_results_in_inbox_page() {
		String resultSendMessage1 = objMess.getNumberResultInbox();
     	 System.out.println("The number of result is " +resultSendMessage1);
     	 Assert.assertTrue(objMess.getNumberResultInbox().contains("results"));
		 System.out.println("The assert is true ");
		 HelperClass.log.info("User get the number of inbox messages");
     	 
	}  

	@When("User choose the Trash option")
	public void user_choose_the_trash_option() {
		objMess.clickTrashRadioButton();
		System.out.println("Trash Check Box is cliked");
		HelperClass.log.info("User select the Trash option");

	}

	@Then("User gets the number of results in Trash pages")
	public void user_gets_the_number_of_results_in_trash_pages() {
		String resultSendMessage1 = objMess.getNumberResultTrash();
     	 System.out.println("The number of result is " +resultSendMessage1);
     	HelperClass.log.info("User get the number of Trash message");
	}

	
	
	
	@When("User Creating new message")
	public void user_creating_new_message() {
		 objMess.clickNewButton();
		  System.out.println("User clicks the new message button");	
	     HelperClass.log.info("User clicks the new message button");

	}

	

	
	@When("Enter the required details")
	public void enter_the_required_details() throws InterruptedException {
		    objMess.setUserName(data1.User);
		    objMess.setSubject(data1.Subject);
		    objMess.setDescription(data1.Description);	
		    
		    System.out.println("The Message details are included");
		    
		    objMess.clickSendButton();
		    System.out.println("The send button clicked");	
		    
		    HelperClass.log.info("User clicks the message button");

	}
    
	@When("User enter the user name and subject")
	public void user_enter_the_user_name_and_subject() throws InterruptedException {
	    objMess.setUserName(data1.User);
	    objMess.setSubject(data1.Subject);
	    objMess.clickSendButton();
	    System.out.println("The send button clicked");		

	    HelperClass.log.info("User enter valid username and password");
		
	}

	@Then("User receives verification message shows the message not able to send")
	public void user_receives_verification_message_shows_the_message_not_able_to_send() {
		 
		 String notSendMess =objMess.getFailMess();
		 System.out.println("The displayed message is " +notSendMess);
		
		 Assert.assertTrue(objMess.getFailMess().contains("The action couldn't be processed"));
		 System.out.println("The assert is true");
		 System.out.println("The message not send");
		 HelperClass.log.info("User receive the message ");

		
	}

	
	
	
	
	
	@Then("User receives a verification message")
	public void user_receives_a_verification_message() {
		 String successMess =objMess.getSuccessMess();
		 System.out.println("The success message is " +successMess);
         
		 Assert.assertTrue(objMess.getSuccessMess().contains("The message was successfully sent."));
		 System.out.println("The assert is true");
		 System.out.println("The message succesfully send");
		 HelperClass.log.info("User receives a verification message");

		 
	}
	
	@Then("Print the send messages")
	public void print_the_send_messages() {
		List<WebElement> table = HelperClass.getDriver().findElements(By.xpath("//div[@class='resultsContainer']//table"));	
		 
		System.out.println(table.size());
		for(WebElement datas : table)
		{
		System.out.println(datas.getText());
		}

		 HelperClass.log.info("Print the send message");

	}

	
	
}