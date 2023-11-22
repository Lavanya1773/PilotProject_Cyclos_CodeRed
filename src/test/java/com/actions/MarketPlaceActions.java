package com.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.locators.MarketPlaceLocators;
import com.utility.HelperClass;

public class MarketPlaceActions {
	MarketPlaceLocators marketLocator = new MarketPlaceLocators(); 
	String userName, password; 
	
	
	public MarketPlaceActions() { 
		this.marketLocator = new MarketPlaceLocators();		
		PageFactory.initElements(HelperClass.getDriver(), marketLocator);
	}
	//method for signing in
	public void signIn(String userName, String password) {
		marketLocator.signIn.click();
		marketLocator.userName.sendKeys(userName);
		marketLocator.password.sendKeys(password);
		marketLocator.signInButton.click();
	}
	//method for welcome message
    public MarketPlaceActions verifyLoginText(String expectedText) {
        String actualText = marketLocator.loginText.getText();
        Assert.assertEquals(actualText, expectedText, "Login text mismatch");
        return this;
    }
    //method for clicking market
    public MarketPlaceActions clickMarket() {
    	marketLocator.market.click();
        return this;
    }
    //method for clickng list ads
    public MarketPlaceActions clickList() {
    	marketLocator.list.click();
        return this;
    }
    //method for clicking dropdown
    public MarketPlaceActions clickDrops() {
    	marketLocator.drops.click();
        return this;
    }
    //method for clicking highest filter
    public MarketPlaceActions clickHighest() {
    	marketLocator.highest.click();
        return this;
    }
    //method for clicking product
    public MarketPlaceActions clickProduct1() {
    	marketLocator.product1.click();
        return this;
    }
    //method for clicking favorites
    public MarketPlaceActions clickFav1() {
    	marketLocator.fav1.click();
        return this;
    }
    //method for clicking popup
    public MarketPlaceActions clickPopUp() {
    	marketLocator.popUp.click();
        return this;
    }
    //method for going back
    public MarketPlaceActions clickBack() {
    	marketLocator.back.click();
        return this;
    }
    //method for clicking lowest filter
    public MarketPlaceActions clickLowest() {
    	marketLocator.lowest.click();
        return this;
    }
    //method for clicking product 
    public MarketPlaceActions clickProduct2() {
    	marketLocator.product2.click();
        return this;
    }
    //method for clicking favorites
    public MarketPlaceActions clickFav2() {
    	marketLocator.fav2.click();
        return this;
    }
    //method for clicking relevance filter
    public MarketPlaceActions clickRelevance() {
    	marketLocator.relevance.click();
        return this;
    }
    //method for clicking product 
    public MarketPlaceActions clickProduct3() {
    	marketLocator.product3.click();
        return this;
    }
    //method for clicking favorites
    public MarketPlaceActions clickFav3() {
    	marketLocator.fav3.click();
        return this;
    }
    //method for clicking checkbox
    public MarketPlaceActions clickFavOnly() {
    	marketLocator.favOnly.click();
        return this;
    }
    //method for clicking checkbox
    public MarketPlaceActions clickEnableCheckBox() {
    	marketLocator.enableCheckBox.click();
        return this;
    }
    //method for removing product
    public MarketPlaceActions clickRem1() {
    	marketLocator.rem1.click();
        return this;
    }

    public MarketPlaceActions verifyResultCount() {
        String resultText = marketLocator.resultCount.getText();
        System.out.println("Count is:" +resultText);
        return this;
    }
}
