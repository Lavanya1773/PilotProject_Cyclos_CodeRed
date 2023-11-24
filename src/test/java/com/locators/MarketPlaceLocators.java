package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlaceLocators {
	@FindBy(xpath = "//*[name()=\"svg\" and @class=\"ci ci-login\"]")
	public WebElement signIn; //xpath for sign in 
	
	@FindBy(xpath = "//input[@name='principal']")
	public WebElement userName; //xpath for username text field
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password; //xpath for password text field
	
	@FindBy(xpath = "//button[@class='actionButton']")
	public WebElement signInButton; //xpath for sign in button
	//MarketPlace locators.
	@FindBy(xpath="//div[@class='pageSectionHeading']")
	public WebElement loginText; //xpath for welcome meesage
	
	@FindBy(xpath="//span[text()='Marketplace']")
	public WebElement market; //xpath for marketplace
	
	@FindBy(xpath="(//button[@class='actionButton'])[2]")
	public WebElement list; //xpath for list ads button
	
	@FindBy(xpath="(//button[@class='resultsToolbarButton resultsToolbarButton-left'])[1]")
	public WebElement drops; //xpath for dropdown button
	
	@FindBy(xpath="//span[text()='Price Highest']")
	public WebElement highest; //xpath for highest filter
	
	@FindBy(xpath="//div[text()='food']")
	public WebElement product1; //xpath for choosing product
	
	@FindBy(xpath="(//div[@class='iconLabel iconLabel-hasIcon iconLabel-hasText'])[15]")
	public WebElement fav1; //xpath for add to favorites
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-info-circle\"]")
	public WebElement popUp; //xpath for popup text
	
	@FindBy(xpath="//a[@title='Search advertisements']")
	public WebElement back; //xpath for going back
	
//	//back
	@FindBy(xpath="//span[text()='Price Lowest']")
	public WebElement lowest; //xpath for lowest filter
	
	@FindBy(xpath="//div[text()='Trapkuiser gezicht testvraag']")
	public WebElement product2; //xpath for choosing product

	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]")
	public WebElement fav2; //xpath for add to favorites
//	//back	

	@FindBy(xpath="//span[text()='Relevance']")
	public WebElement relevance; //xpath for relevance filter
	
	@FindBy(xpath="//div[text()='Ndulla']")
	public WebElement product3; //xpath for choosing product
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]")
	public WebElement fav3; //xpath for add to favorites
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"ci ci-checkbox-unchecked\"]//parent::div)[1]")
	public WebElement favOnly; //xpath for enabling show only favorites checkbox
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-check2-square\"]")
	public WebElement enableCheckBox; //xpath for enabling show only favorites checkbox
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"bi bi-heart-fill\"])[1]")
	public WebElement rem1; //xpath for removing the product
	
	@FindBy(xpath="//div[contains(text(),' result')]")
	public WebElement resultCount; //xpath for getting the total counts
	

}
	
//	@FindBy(xpath = "//*[name()=\"svg\" and @class=\"ci ci-login\"]") //xpath for signin tab 
//	public WebElement signIn;
//	
//	@FindBy(xpath = "//input[@name='principal']") //xpath for username text box
//	public WebElement userName;
//	
//	@FindBy(xpath = "//input[@name='password']") //xpath for password trxt box
//	public WebElement password;
//	
//	@FindBy(xpath = "//button[@class='actionButton']") //xpath for sign button
//	public WebElement signInButton;
//	//MarketPlace locators.
//	@FindBy(xpath="//div[@class='pageSectionHeading']") //xpath for the text that displayed after login
//	public WebElement loginText;
//	
//	@FindBy(xpath="//*[name()=\"svg\" and @class=\"ci ci-shop-fill\"]") //xpath for marketplace tab
//	public WebElement market;	
//	
//	@FindBy(xpath="(//button[@class='actionButton'])[2]") //xpath for list ads button
//	public WebElement list;
//	
//	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"bi bi-caret-down-fill\"])[3]") //xpath for clicking dropdown
//	public WebElement drops;
//	
//	@FindBy(xpath="//span[text()='Price Highest']") //xpath for choosing Price highest filter
//	public WebElement highest;
//	
//	@FindBy(xpath="//div[text()='test software']") //xpath for choosing product 1
//	public WebElement product1;
//	
//	@FindBy(xpath="//span[text()='Add to favorites']") //xpath for adding to favorites
//	public WebElement fav1;
//	
//	@FindBy(xpath="//div[text()='Added to favorites']") //xpath for popup text that displayed after adding product to favorites
//	public WebElement popUp;
//	
//	@FindBy(xpath="//a[@title='Search advertisements']") //xpath for going back to search advertisements
//	public WebElement back;
//	
//	@FindBy(xpath="//a[@class='breadCrumbLink']")
//	public WebElement back2;
//
//	@FindBy(xpath="//div[text()='black brand burger']") //xpath for choosing product 2
//	public WebElement product2;
//	
//	@FindBy(xpath="(//a[@class='itemsPanelLink linkPanel'])[1]") //xpath for adding to favorites
//	public WebElement fav2;
////	//back
//	@FindBy(xpath="//span[text()='Price Lowest']") //xpath for choosing Price lowest filter
//	public WebElement lowest;
//	
//	@FindBy(xpath="//div[text()='Ndulla']") //xpath for choosing product 3
//	public WebElement product3;
//
//	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]") //xpath for adding to favorites
//	public WebElement fav3;
////	//back	
//	
////	@FindBy(xpath="(//td[@class='tiledResultThumbnail tiledResult-selectable'])[10]") //xpath for choosing product 4
////	public WebElement product4;
////	
////	@FindBy(xpath="//span[text()='Add to favorites']") //xpath for adding to favorites
////	public WebElement fav4;
//	
//	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"ci ci-checkbox-unchecked\"])[1]") //xpath for enabling show only favorites checkbox
//	public WebElement favOnly;
//	
////	@FindBy(xpath="//span[text()='Relevance']")
////	public WebElement relevance;
//	
//	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"bi bi-heart-fill\"])[1]")
//	public WebElement rem1;
//	
//	@FindBy(xpath="//div[contains(text(),' results')]") //xpath for displaying the total count that displayed after removing
//	public WebElement countResult;
//	
//}

