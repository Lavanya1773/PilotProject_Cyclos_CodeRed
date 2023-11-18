package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.locators.MarketPlaceLocators;
import com.utility.HelperClass;

public class MarketPlaceActions {
	MarketPlaceLocators marketLocator = new MarketPlaceLocators(); //object for MarketPlaceLocator Class
//	WebDriver driver;
	String userName, password; // passed values for username and password 
	
	
	public MarketPlaceActions() { //constructor for marketplaceAction
		this.marketLocator = new MarketPlaceLocators();		
		PageFactory.initElements(HelperClass.getDriver(), marketLocator);
	}
	public void setSignIn(String userName, String password) { //constructor for sign in into the page
		marketLocator.signIn.click();
		marketLocator.userName.sendKeys(userName);
		marketLocator.password.sendKeys(password);
		marketLocator.signInButton.click();
	}
	//constructor for getting the login page text after successful login
	public String getLoginPageText() { 
		return marketLocator.loginText.getText();
	}
	//constructor for clicking marketPlace tab
	public void clickMarketplaceTab() {
		marketLocator.market.click();
	}
	//constructor for clicking List ads button
	public void clickListAds() {
		marketLocator.list.click();
	}
	//constructor for clicking Dropdown button
	public void clickDropDown() {
		marketLocator.drops.click();
	}
	//constructor for choosing Price highest filter
	public void clickPriceHighest() {
		marketLocator.highest.click();
	}
	//constructor for choosing Product one
	public void clickProducts1() {
		marketLocator.product1.click();
	}
	//constructor for adding product one to favorites
	public void clickAddToFavorites1() {
		marketLocator.fav1.click();
	}
	//constructor for getting popup text "Added to favorites"
	public String getPopupText() {
		return marketLocator.popUp.getText();
	}
	//constructor for choosing Product two
	public void clickProducts2() {
		marketLocator.product2.click();
	}
	//constructor for adding product two to favorites
	public void clickAddToFavorites2() {
		marketLocator.fav2.click();
	}
	//constructor for going to product page
	public void clickSearchAdvertisements() {
		marketLocator.back.click();
	}
	//constructor for choosing Price highest filter
	public void clickPriceLowest() {
		marketLocator.lowest.click();
	}
	//constructor for choosing Product three
	public void clickProducts3() {
		marketLocator.product3.click();
	}
	//constructor for adding product three to favorites
	public  void clickAddToFavorites3() {
		marketLocator.fav3.click();
	}
	//constructor for choosing Product four
	public void clickProducts4() {
		marketLocator.product4.click();
	}
	//constructor for adding product four to favorites
	public  void clickAddToFavorites4() {
		marketLocator.fav4.click();
	}
	//constructor for enabling checkbox"Show only favorites"
	public void clickShowOnlyFavorites() {
		marketLocator.favOnly.click();
	}
//	public Boolean getStatusOfCheckBox() {
//		return marketLocator.enableCheckBox.isSelected();
//	}
	//constructor for removing the product from favorites
	public void clickRemoveFromFavorites1() {
		marketLocator.rem1.click();
	}
	//constructor for removing the product from favorites
	public void clickRemoveFromFavorites2() {
		marketLocator.rem2.click();
	}
	//constructor for getting the total count of product
	public void getTotalCountInFavorites() {
		String count1 =  marketLocator.resultCount.getText();
		System.out.println("Available count is:" +count1);
	}
	//constructor for sign in
	public void AccountInfo(String userName, String password) {
		this.setSignIn(userName, password);

	}
}

