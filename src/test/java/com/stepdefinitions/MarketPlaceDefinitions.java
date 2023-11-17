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
	    marketaction.clickMarketplaceTab();
	}
	
	@When("User provide valid username and password")
	public void user_provide_valid_username_and_password() {
		System.out.println("User provides username and password to signIn");
		marketaction.setSignIn(utility.userName, utility.password);
	}
	@When("User choose List ads")
	public void user_choose_list_ads() {
		System.out.println("Clicks list ads");
		marketaction.clickListAds();
	}

	@When("User choose the filter tab")
	public void user_choose_the_filter_tab() {
		System.out.println("Clicks dropdown");
		marketaction.clickDropDown();
	}

	@When("User choose the price highest filter")
	public void user_choose_the_price_highest_filter() {
		System.out.println("Chooses the filter Price Highest");
		marketaction.clickPriceHighest();
	}

	@When("User clicks for the productOne and added to favorites")
	public void user_clicks_for_the_product_one_and_added_to_favorites() {
		System.out.println("Choose product 1");
		marketaction.clickProducts1();
		System.out.println("Added product 1 to Favorites");
		marketaction.clickAddToFavorites1();
		Assert.assertTrue(marketaction.getPopupText().contains("Added to favorites"));
		marketaction.clickSearchAdvertisements();//back button
	   
	}

	@When("User again clicks for the productTwo and added to favorites")
	public void user_again_clicks_for_the_product_two_and_added_to_favorites() {
	    System.out.println("Choose product 2");
	    marketaction.clickProducts2();
	    System.out.println("Added product 2 to Favorites");
	    marketaction.clickAddToFavorites2();
	    Assert.assertTrue(marketaction.getPopupText().contains("Added to favorites"));
	    marketaction.clickSearchAdvertisements();//back button
	}

	@When("User choose the price lowest filter")
	public void user_choose_the_price_lowest_filter() {
		System.out.println("Chooses the filter Price Highest");
		marketaction.clickPriceLowest();
	}

	@When("User clicks for the productThree and adds it  to favorites")
	public void user_clicks_for_the_product_three_and_adds_it_to_favorites() {
		 System.out.println("Choose product 3");
		 marketaction.clickProducts3();
		 System.out.println("Added product 3 to Favorites");
		 marketaction.clickAddToFavorites3();
		 Assert.assertTrue(marketaction.getPopupText().contains("Added to favorites"));
		 marketaction.clickSearchAdvertisements();//back button
	}

	@When("User clicks for the productFour and adds it  to favorites")
	public void user_clicks_for_the_product_four_and_adds_it_to_favorites() {
		System.out.println("Choose product 4");
		marketaction.clickProducts4();
		System.out.println("Added product 3 to Favorites");
		marketaction.clickAddToFavorites4();
		Assert.assertTrue(marketaction.getPopupText().contains("Added to favorites"));
		marketaction.clickSearchAdvertisements();//back button
	}

	@When("User enables the checkbox \\(Show only favorites)")
	public void user_enables_the_checkbox_show_only_favorites() {
	    System.out.println("CheckBox is been clicked");
	    marketaction.clickShowOnlyFavorites();
	    Assert.assertTrue(marketaction.getStatusOfCheckBox());	    
	}

	@When("User remove the products from favorites")
	public void user_remove_the_products_from_favorites() {
		System.out.println("Remove a product");
		marketaction.clickRemoveFromFavorites1();		
		marketaction.clickRemoveFromFavorites2(); 
	}

	@Then("User is going to print the total number of results available in favorites")
	public void user_is_going_to_print_the_total_number_of_results_available_in_favorites() {
	    driver.navigate().refresh();
	    marketaction.clickShowOnlyFavorites();
	    marketaction.getTotalCountInFavorites();
	}
}
