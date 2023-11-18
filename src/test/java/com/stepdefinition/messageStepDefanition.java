package com.stepdefinition;

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
	

	@Given("User launch the url")
	public void user_launch_the_url() {
	   
		HelperClass.openPage(data1.url);
	    System.out.println("url open");
		
	}
	

	@When("User provide valid username and password")
	public void user_provide_valid_username_and_password() {
	   
		
	}

	@When("User choose the Message Tab")
	public void user_choose_the_message_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the Sent message option")
	public void user_select_the_sent_message_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User gets the number of results in that page")
	public void user_gets_the_number_of_results_in_that_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User choose the inbox option")
	public void user_choose_the_inbox_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User choose the Trash option")
	public void user_choose_the_trash_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User gets the number of results in that page")
	public void user_gets_the_number_of_results_in_that_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Creating new message")
	public void user_creating_new_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter the required details")
	public void enter_the_required_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User receives a verification message")
	public void user_receives_a_verification_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
