package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlaceLocators {
	@FindBy(xpath = "//*[name()=\"svg\" and @class=\"ci ci-login\"]") //xpath for signin tab 
	public WebElement signIn;
	
	@FindBy(xpath = "//input[@name='principal']") //xpath for username text box
	public WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']") //xpath for password trxt box
	public WebElement password;
	
	@FindBy(xpath = "//button[@class='actionButton']") //xpath for sign button
	public WebElement signInButton;
	//MarketPlace locators.
	@FindBy(xpath="//div[@class='pageSectionHeading']") //xpath for the text that displayed after login
	public WebElement loginText;
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"ci ci-shop-fill\"]") //xpath for marketplace tab
	public WebElement market;	
	
	@FindBy(xpath="(//button[@class='actionButton'])[2]") //xpath for list ads button
	public WebElement list;
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"bi bi-caret-down-fill\"])[3]") //xpath for clicking dropdown
	public WebElement drops;
	
	@FindBy(xpath="//span[text()='Price Highest']") //xpath for choosing Price highest filter
	public WebElement highest;
	
	@FindBy(xpath="(//td[@class='tiledResultThumbnail tiledResult-selectable'])[2]") //xpath for choosing product 1
	public WebElement product1;
	
	@FindBy(xpath="(//div[@class='iconLabel iconLabel-hasIcon iconLabel-hasText'])[15]") //xpath for adding to favorites
	public WebElement fav1;
	
	@FindBy(xpath="//div[text()='Added to favorites']") //xpath for popup text that displayed after adding product to favorites
	public WebElement popUp;
	
	@FindBy(xpath="//a[@class='breadCrumbLink']") //xpath for going back to search advertisements
	public WebElement back;

	@FindBy(xpath="(//td[@class='tiledResultThumbnail tiledResult-selectable'])[14]") //xpath for choosing product 2
	public WebElement product2;
	
	@FindBy(xpath="(//a[@class='itemsPanelLink linkPanel'])[1]") //xpath for adding to favorites
	public WebElement fav2;
//	//back
	@FindBy(xpath="//span[text()='Price Lowest']") //xpath for choosing Price lowest filter
	public WebElement lowest;
	
	@FindBy(xpath="(//td[@class='tiledResultThumbnail tiledResult-selectable'])[6]") //xpath for choosing product 3
	public WebElement product3;

	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]") //xpath for adding to favorites
	public WebElement fav3;
//	//back	
	
	@FindBy(xpath="(//td[@class='tiledResultThumbnail tiledResult-selectable'])[8]") //xpath for choosing product 4
	public WebElement product4;
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]") //xpath for adding to favorites
	public WebElement fav4;
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"ci ci-checkbox-unchecked\"])[1]") //xpath for enabling show only favorites checkbox
	public WebElement favOnly;
	
//	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-check2-square\"]")
//	public WebElement enableCheckBox;
//	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"bi bi-heart-fill\"])[1]") //xpath for removing a product
	public WebElement rem1;
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"bi bi-heart-fill\"])[2]") //xpath for removing a product
	public WebElement rem2;
	
	@FindBy(xpath="//div[contains(text(),'results')]") //xpath for displaying the total count that displayed after removing
	public WebElement resultCount;
	
}

