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
	WebDriver driver;
	UtilityClassMarketPlace utility = new UtilityClassMarketPlace();
	MarketPlaceActions marketaction = new MarketPlaceActions();
	
	
	@Given("User launches the url")
	public void user_launches_the_url() {
	    HelperClass.openPage(utility.url);
//	    Assert.assertTrue(marketaction.getLoginPageText().contains("Welcome to the Cyclos4 Demo"));
	    System.out.println("In login page...");
	    //clicking marketplace tab
//	    marketaction.clickMarketplaceTab();
	}
	
	@When("User provide valid username and password")
	public void user_provide_valid_username_and_password() {
		System.out.println("User provides username and password to signIn");
		marketaction.setSignIn(utility.userName, utility.password);
		Assert.assertTrue(marketaction.getLoginPageText().contains("Welcome to the Cyclos4 Demo")); //asert for getting a welcome text after successful login
		marketaction.clickMarketplaceTab(); //MarketPlace tab clicking
		HelperClass.log.info("User gets Welcome to the Cyclos4 demo...");//log for welcome message
	}
	@When("User choose List ads")
	public void user_choose_list_ads() {
		System.out.println("Clicks list ads");
		marketaction.clickListAds(); //Listads clicking
		HelperClass.log.info("User clicks List ads..."); //log for listads button
	}

	@When("User choose the filter tab")
	public void user_choose_the_filter_tab() {
		System.out.println("Clicks dropdown");
		marketaction.clickDropDown(); //Dropdown clicking
		HelperClass.log.info("User clicks dropdown..."); //log for dropdown
	}

	@When("User choose the price highest filter")
	public void user_choose_the_price_highest_filter() {
		System.out.println("Chooses the filter Price Highest");
		marketaction.clickPriceHighest(); //Choosing Price highest filter
		HelperClass.log.info("User chooses the price highest filter..."); //log for highest filter
	}

	@When("User clicks for the productOne and added to favorites")
	public void user_clicks_for_the_product_one_and_added_to_favorites() {
		System.out.println("Choose product 1");
		marketaction.clickProducts1(); //choosing product one
		System.out.println("Added product 1 to Favorites");
		marketaction.clickAddToFavorites1(); //added to favorites
		Assert.assertTrue(marketaction.getPopupText().contains("Added to favorites")); //assert for getting the popup text after product added to favorites
		marketaction.clickSearchAdvertisements();//back button
		HelperClass.log.info("User added the product one to favorites..."); //log for product one added to favorites
	}

	@When("User again clicks for the productTwo and added to favorites")
	public void user_again_clicks_for_the_product_two_and_added_to_favorites() {
	    System.out.println("Choose product 2");
	    marketaction.clickProducts2(); //choosing product two
	    System.out.println("Added product 2 to Favorites");
	    marketaction.clickAddToFavorites2(); //added to favorites
	    Assert.assertTrue(marketaction.getPopupText().contains("Added to favorites")); //assert for getting the popup text after product added to favorites
	    marketaction.clickSearchAdvertisements();//back button
	    HelperClass.log.info("User added the product two to favorites..."); //log for product two added to favorites
	}

	@When("User choose the price lowest filter")
	public void user_choose_the_price_lowest_filter() {
		System.out.println("Chooses the filter Price Lowest");
		marketaction.clickDropDown(); //Dropdown clicking
		marketaction.clickPriceLowest(); //Choosing Price lowest filter
		HelperClass.log.info("User chooses the Price lowest filter...");
	}

	@When("User clicks for the productThree and adds it  to favorites")
	public void user_clicks_for_the_product_three_and_adds_it_to_favorites() {
		 System.out.println("Choose product 3");
		 marketaction.clickProducts3(); //choosing product three
   	 System.out.println("Added product 3 to Favorites");
		 marketaction.clickAddToFavorites3(); //added to favorites
		 Assert.assertTrue(marketaction.getPopupText().contains("Added to favorites")); //assert for getting the popup text after product added to favorites
		 marketaction.clickSearchAdvertisements();//back button
		 HelperClass.log.info("User added the product three to favorites..."); //log for product two added to favorites
	}

	@When("User clicks for the productFour and adds it  to favorites")
	public void user_clicks_for_the_product_four_and_adds_it_to_favorites() {
		System.out.println("Choose product 4");
		marketaction.clickProducts4(); //choosing product three
		System.out.println("Added product 4 to Favorites");
		marketaction.clickAddToFavorites4(); //added to favorites
		Assert.assertTrue(marketaction.getPopupText().contains("Added to favorites")); //assert for getting the popup text after product added to favorites
		marketaction.clickSearchAdvertisements();//back button
		HelperClass.log.info("User added the product 4 to favorites..."); //log for product two added to favorites
	}

	@When("User enables the checkbox \\(Show only favorites)")
	public void user_enables_the_checkbox_show_only_favorites() {
	    System.out.println("CheckBox is been clicked");
	    marketaction.clickShowOnlyFavorites(); //enabling the checkbox
	    
	    HelperClass.log.info("User enabled the checkbox (Show only favorites)..."); //log for enabling checkbox
	}

	@When("User remove the products from favorites")
	public void user_remove_the_products_from_favorites() throws InterruptedException {
		System.out.println("Remove a product"); 

		marketaction.clickRemoveFromFavorites1(); //removing product 
		System.out.println("Remove product 2");
		marketaction.clickRemoveFromFavorites2(); //removing a product 
		HelperClass.log.info("User removed products from favorites..."); //log for removed products
	}

	@Then("User is going to print the total number of results available in favorites")
	public void user_is_going_to_print_the_total_number_of_results_available_in_favorites() {
	   marketaction.clickMarketplaceTab(); //clicking marketplace tab   
	   marketaction.clickShowOnlyFavorites(); //enabling checkbox again
	    marketaction.getTotalCountInFavorites(); //getting total count 
	    HelperClass.log.info("User finally gets the total no. of. results:"); // log for getting count 
	    
	}
}
