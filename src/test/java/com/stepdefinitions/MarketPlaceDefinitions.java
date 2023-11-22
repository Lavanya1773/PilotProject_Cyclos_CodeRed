package com.stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.actions.MarketPlaceActions;
import com.utility.HelperClass;
import com.utility.UtilityClassMarketPlace;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MarketPlaceDefinitions {
	UtilityClassMarketPlace utility = new UtilityClassMarketPlace(); //utility object creation
	MarketPlaceActions marketaction = new MarketPlaceActions(); //marketplace action object creation
	
	@Given("User launches the url of the web page") //Given Gherkin command
	public void user_launches_the_url_of_the_web_page() {
		HelperClass.openPage(utility.url); //launching the url of the web application
		System.out.println("In login page...");
	}

	@When("User provide correct username and password") //When Gherkin command
	public void user_provide_correct_username_and_password() {
		System.out.println("User provides username and password to signIn");
		marketaction.signIn(utility.userName, utility.password); //username and password is password for signing in
		HelperClass.log.info("User gets Welcome to the Cyclos4 demo...");
		marketaction.clickMarket(); //clicking marketplace 
		HelperClass.log.info("User goes to marketplace tab..."); //log
	}

	@When("User goes to List ads") //When Gherkin command
	public void user_goes_to_list_ads() {
		System.out.println("Clicks list ads");
		marketaction.clickList(); //clicking list ads
		HelperClass.log.info("User goes to list ads button..."); //log	 
	}

	@When("User applies the filter tab") //When Gherkin command
	public void user_applies_the_filter_tab() {
		marketaction.clickDrops(); //clicking dropdown
	}

	@When("User chooses price highest filter") //When Gherkin command
	public void user_chooses_price_highest_filter() {
		marketaction.clickHighest(); //choosing price highest filter
		HelperClass.log.info("User chooses the price highest filter..."); //log
	}

	@When("User clicks for the product and added to favorites") //When Gherkin command
	public void user_clicks_for_the_product_and_added_to_favorites() {
		marketaction.clickProduct1().clickFav1(); //adding the product to favorites
		marketaction.clickBack(); //going back
		HelperClass.log.info("User chooses a product and added to favorites..."); //log
	}

	@When("User enables the checkbox \\(Show only favorites)") //When Gherkin command
	public void user_enables_the_checkbox_show_only_favorites() {
		marketaction.clickFavOnly(); //enabling the checkbox
		HelperClass.log.info("User enabled the checkbow..."); //log
	}

	@Then("User prints the total number of results available in favorites after added from highest filter") //Then Gherkin command
	public void user_prints_the_total_number_of_results_available_in_favorites_after_added_from_highest_filter() {
		marketaction.verifyResultCount(); //getting the total results
		HelperClass.log.info("Total number of count printed after adding product in highest filter..."); //log
	}

	@When("User chooses price lowest filter") //When Gherkin command
	public void user_chooses_price_lowest_filter() {
		marketaction.clickLowest(); //choosing price lowest filter
		HelperClass.log.info("User chooses the price lowest filter..."); //log
	}

	@When("User clicks for the product and adds it  to favorites") //When Gherkin command
	public void user_clicks_for_the_product_and_adds_it_to_favorites() {
		marketaction.clickProduct2().clickFav2(); //adding the product to favorites
		marketaction.clickBack(); //going back
		HelperClass.log.info("User chooses a product and added to favorites..."); //log
	}

	@Then("User prints the total number of results available in favorites after added from lowest filter") //Then Gherkin command
	public void user_prints_the_total_number_of_results_available_in_favorites_after_added_from_lowest_filter() {
		marketaction.clickFavOnly(); //enabling the checbox
		marketaction.verifyResultCount(); //getting the total results
		HelperClass.log.info("Total number of count printed after adding product in lowest filter..."); //log
	}

	@When("User chooses relevance filter") //When Gherkin command
	public void user_chooses_relevance_filter() {
		marketaction.clickRelevance(); //choosing relevance filter
		HelperClass.log.info("User chooses the price relevance filter..."); //log
	}

	@When("User clicks for the product ann adds it to favorites") //When Gherkin command
	public void user_clicks_for_the_product_ann_adds_it_to_favorites() {
		marketaction.clickProduct3().clickFav3(); //adding the product to favorites
		marketaction.clickBack(); //going back
		HelperClass.log.info("User chooses a product and added to favorites..."); //log
	}

	@Then("User prints the total number of results available in favorites after added from relevance filter") //Then Gherkin command
	public void user_prints_the_total_number_of_results_available_in_favorites_after_added_from_relevance_filter() {
		marketaction.clickFavOnly(); //enabling the checkbox
		marketaction.verifyResultCount(); //getting the total results
		HelperClass.log.info("Total number of count printed after adding product in relevance filter..."); //log
	}

	@When("User correct valid username and password") //When Gherkin command
	public void user_correct_valid_username_and_password() {
		System.out.println("User provides username and password to signIn");
		marketaction.signIn(utility.userName, utility.password); //username and password is passed for signing in 
		HelperClass.log.info("User gets Welcome to the Cyclos4 demo...");
		marketaction.clickMarket(); //clicking marketplace
		HelperClass.log.info("User goes to marketplace tab..."); //log
		
	}

	@When("User removes a product from list") //When Gherkin command
	public void user_removes_a_product_from_list() {
		marketaction.clickFavOnly(); //enabling the checkbox
		HelperClass.log.info("Enabled checkbox for removing...");
		marketaction.clickRem1(); //removing the product from favorites
		HelperClass.log.info("Removed the product...");
		marketaction.clickMarket(); 
		marketaction.clickFavOnly();
		HelperClass.log.info("Again checkbow is enabled..."); //log
	}

	@Then("user prints the total number of results available in favorites after removing product") //Then Gherkin command
	public void user_prints_the_total_number_of_results_available_in_favorites_after_removing_product() {
		marketaction.verifyResultCount(); //getting the total results
		HelperClass.log.info("Total number of count printed after removing a product in highest filter..."); //log
	}
	
}






