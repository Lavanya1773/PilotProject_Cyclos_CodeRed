package com.stepdefinitions;

import com.actions.InterestsAction;
import com.utility.HelperClass;
import com.utility.UtilityClassInterests;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InterestsDefinitions {
	UtilityClassInterests utility = new UtilityClassInterests(); //utility object creation
	InterestsAction interestsaction = new InterestsAction(); //interests action object creation
	
	@Given("User launches the url of the Cyclos Web Application") //Given Gherkin command
	public void user_launches_the_url_of_the_cyclos_web_application() {
		HelperClass.openPage(utility.url); //launching the url
        System.out.println("In login page...");
	}

	@When("User clicks Advertisement Interests in the left column") //When Gherkin command
	public void user_clicks_advertisement_interests_in_the_left_column() {
		System.out.println("User provides username and password to signIn");
		interestsaction.setSignIn(utility.userName, utility.password); //username and password is passed for signing in
		interestsaction.clickMarketplaceTab(); //MarketPlace tab clicking
		HelperClass.log.info("User gets Welcome to the Cyclos4 demo...");//log for welcome message
		interestsaction.clickAdvertisementsInterests(); //Advertisement interests clicking
		HelperClass.log.info("User clicks the Advertisements interests..."); //log for clicking advertisement interests
	}

	@When("User clicks New interests") //When Gherkin command
	public void user_clicks_new_interests() {
	    System.out.println("New addition to the interest:");
	    interestsaction.clickNew(); //clicking new button
	    HelperClass.log.info("next new page is opened..."); //log for clicking new button
	}

	@When("User provides the valid name") //When Gherkin command
	public void user_provides_the_valid_name() {
	    System.out.println("provide valid name:");
	    interestsaction.setName(utility.nameInput); //sending the name using sendkeys
	    HelperClass.log.info("Enters a valid name..."); //log for sending name
	}

	@When("User clicks the category dropdown") //When Gherkin command
	public void user_clicks_the_category_dropdown() {
	    System.out.println("Category dropdown is clicked:");
	    interestsaction.clickCategory(); //clicking category dropdown
	    HelperClass.log.info("User clicks category..."); //log for clicking the dropdown
	}

	@When("User chooses any of the category based on interest") //When Gherkin command
	public void user_chooses_any_of_the_category_based_on_interest() {
	    System.out.println("based on interest category is choosed:");
	    interestsaction.clickDownCategory(); //selecting one of the category
	    HelperClass.log.info("Chooses the musician category..."); //log for selecting one of the category
	    interestsaction.clickUserCheckbox(); //clicking the user checkbox
	    HelperClass.log.info("User checkbox is enabled..."); //log for enabling the checkbox
	    
	}

	@When("User saved the interest") //When Gherkin command
	public void user_saved_the_interest() {
	    System.out.println("Saved!!!");
	    interestsaction.clickSave(); //clicking save button
	    HelperClass.log.info("Saved the interests..."); //log for saving the interests
	    Assert.assertTrue(interestsaction.getSuccessPopup().contains("Saved successfully")); //assert for confirming the popup text received after saving
	}

	@When("User go back to the Advertisement interests") //When Gherkin command
	public void user_go_back_to_the_advertisement_interests() {
	    System.out.println("goes back to advertisement interests:");
	    interestsaction.clickGoBack(); //Going back to advertisement interests option
	    HelperClass.log.info("User in Advertisement interests page..."); //log for confirming user in advertisement interest
	}

	@Then("User is going to print the total number of interests") //Then Gherkin command
	public void user_is_going_to_print_the_total_number_of_interests() {
	    interestsaction.getTotalCountInInterests(); //getting the total result of interests
	}
	
	@When("User provides the already exists name") //When Gherkin command
	public void user_provides_the_already_exists_name() {
		System.out.println("Provides already exsisted name:");
		interestsaction.setName(utility.nameInput); //provides already exsisted name
		HelperClass.log.info("Enters a  invalid valid name...");	
	}
	
	@When("User saved the interest with the name which is already exsits") //When Gherkin command
	public void user_saved_the_interest_with_the_name_which_is_already_exsits() {
		System.out.println("Saved the interests:");
		interestsaction.clickSave(); //saving the interest
		HelperClass.log.info("Saved..."); //log for saving the interests

	}

	@Then("User gets a warning message") //Then Gherkin command
	public void user_gets_a_warning_message() {
	    interestsaction.getWarningMessage(); //getting a warning message
	}

}

