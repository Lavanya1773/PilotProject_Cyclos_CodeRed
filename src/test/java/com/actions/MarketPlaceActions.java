package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.locators.MarketPlaceLocators;
import com.utility.HelperClass;

public class MarketPlaceActions {
	MarketPlaceLocators marketLocator = new MarketPlaceLocators();
//	WebDriver driver;
	String userName, password;
	
	
	public MarketPlaceActions() {
		this.marketLocator = new MarketPlaceLocators();		
		PageFactory.initElements(HelperClass.getDriver(), marketLocator);
	}
	public void setSignIn(String userName, String password) {
		marketLocator.signIn.click();
		marketLocator.userName.sendKeys(userName);
		marketLocator.password.sendKeys(password);
		marketLocator.signInButton.click();
	}
	
//	public String getLoginPageText() {
//		return marketLocator.loginText.getText();
//	}
	
	public void clickMarketplaceTab() {
		marketLocator.market.click();
	}
	public void clickListAds() {
		marketLocator.list.click();
	}
	public void clickDropDown() {
		marketLocator.drops.click();
	}
	public void clickPriceHighest() {
		marketLocator.highest.click();
	}
	public void clickProducts1() {
		marketLocator.product1.click();
	}
	public void clickAddToFavorites1() {
		marketLocator.fav1.click();
	}
	public String getPopupText() {
		return marketLocator.popUp.getText();
	}
	public void clickProducts2() {
		marketLocator.product2.click();
	}
	public void clickAddToFavorites2() {
		marketLocator.fav2.click();
	}
	public void clickSearchAdvertisements() {
		marketLocator.back.click();
	}
	public void clickPriceLowest() {
		marketLocator.lowest.click();
	}
	public void clickProducts3() {
		marketLocator.product2.click();
	}
	public  void clickAddToFavorites3() {
		marketLocator.fav2.click();
	}
	public void clickProducts4() {
		marketLocator.product2.click();
	}
	public  void clickAddToFavorites4() {
		marketLocator.fav2.click();
	}
	public void clickShowOnlyFavorites() {
		marketLocator.favOnly.click();
	}
	public Boolean getStatusOfCheckBox() {
		return marketLocator.enableCheckBox.isSelected();
	}
	public void clickRemoveFromFavorites1() {
		marketLocator.rem1.click();
	}
	public void clickRemoveFromFavorites2() {
		marketLocator.rem2.click();
	}
	public String getTotalCountInFavorites() {
		return marketLocator.resultCount.getText();
	}
	public void AccountInfo(String userName, String password) {
		this.setSignIn(userName, password);

	}
}

