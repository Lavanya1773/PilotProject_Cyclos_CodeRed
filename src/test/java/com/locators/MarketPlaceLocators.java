package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlaceLocators {
	@FindBy(xpath = "//*[name()=\"svg\" and @class=\"ci ci-login\"]")
	public WebElement signIn;
	
	@FindBy(xpath = "//input[@name='principal']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@class='actionButton']")
	public WebElement signInButton;
	//MarketPlace locators.
//	@FindBy(xpath="//div[@class='pageSectionHeading']")
//	public WebElement loginText;
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"ci ci-shop-fill\"]")
	public WebElement market;	
	
	@FindBy(xpath="(//button[@class='actionButton'])[2]")
	public WebElement list;
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"bi bi-caret-down-fill\"])[3]")
	public WebElement drops;
	
	@FindBy(xpath="//span[text()='Price Highest']")
	public WebElement highest;
	
	@FindBy(xpath="(//td[@class='tiledResultThumbnail tiledResult-selectable'])[2]")
	public WebElement product1;
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]")
	public WebElement fav1;
	
	@FindBy(xpath="//div[@class='notificationText notificationText-singleLine']")
	public WebElement popUp;
	
	@FindBy(xpath="//a[@class='breadCrumbLink']")
	public WebElement back;
	
	@FindBy(xpath="(//td[@class='tiledResultThumbnail tiledResult-selectable'])[14]")
	public WebElement product2;
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]")
	public WebElement fav2;
	//back
	@FindBy(xpath="//span[text()='Price Lowest']")
	public WebElement lowest;
	
	@FindBy(xpath="(//td[@class='tiledResultThumbnail tiledResult-selectable'])[6]")
	public WebElement product3;
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]")
	public WebElement fav3;
	//back	
	
	@FindBy(xpath="(//td[@class='tiledResultThumbnail tiledResult-selectable'])[8]")
	public WebElement product4;
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-heart\"]")
	public WebElement fav4;
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"ci ci-checkbox-unchecked\"])[1]")
	public WebElement favOnly;
	
	@FindBy(xpath="//*[name()=\"svg\" and @class=\"bi bi-check2-square\"]")
	public WebElement enableCheckBox;
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"bi bi-heart-fill\"])[1]")
	public WebElement rem1;
	
	@FindBy(xpath="(//*[name()=\"svg\" and @class=\"bi bi-heart-fill\"])[2]")
	public WebElement rem2;
	
	@FindBy(xpath="//div[@class='paginationLeft']")
	public WebElement resultCount;
	
}

