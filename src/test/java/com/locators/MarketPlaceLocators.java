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
	
	//back
	@FindBy(xpath="//span[text()='Price Lowest']")
	public WebElement lowest; //xpath for lowest filter
	
	@FindBy(xpath="//div[text()='Trapkuiser gezicht testvraag']")
	public WebElement product2; //xpath for choosing product

	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]")
	public WebElement fav2; //xpath for add to favorites
	//back	

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
	

