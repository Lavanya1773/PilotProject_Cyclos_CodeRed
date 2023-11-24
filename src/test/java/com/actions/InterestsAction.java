package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.InterestsLocators;
import com.utility.HelperClass;

public class InterestsAction {
	InterestsLocators interestLocator = new InterestsLocators(); //object for MarketPlaceLocator Class
	String nameInput, userName, password;
	
	public InterestsAction() { 
		this.interestLocator = new InterestsLocators();		
		PageFactory.initElements(HelperClass.getDriver(), interestLocator);
	}
	//method for signing in to the web application
	public void setSignIn(String userName, String password) { 
		interestLocator.signIn1.click();
		interestLocator.userName1.sendKeys(userName);
		interestLocator.password1.sendKeys(password);
		interestLocator.signInButton1.click();
	}
	//method for clicking marketplace 
	public void clickMarketplaceTab() {
		interestLocator.market1.click();
	}	
	//method for clicking advertisement interests
	public void clickAdvertisementsInterests() {
		interestLocator.advertisementInterests.click();
	}
	//method for clickinn new
	public void clickNew() {
		interestLocator.newButton.click();
	}
	//method for sending name
	public void setName(String nameInput) {
		interestLocator.nameField.sendKeys(nameInput);
	}
	//method for clicking category
	public void clickCategory() {
		interestLocator.category.click();
	}
	//method for clicking one of the category
	public void clickDownCategory() {
		interestLocator.downCategory.click();
	}
	//method for enabling the user checkbox
	public void clickUserCheckbox() {
		interestLocator.checkbox1.click();
	}
	//method for clicking save
	public void clickSave() {
		interestLocator.saveButton.click();
	}
	//method for getting success pop up text after successful save
	public String getSuccessPopup() {
		return interestLocator.poUpSuccess.getText();
	}
	//method for going back
	public void clickGoBack() {
		interestLocator.goBack.click();
	}
	//method for getting the total count
	public void getTotalCountInInterests() {
		String count2 =  interestLocator.adResultCount.getText();
		System.out.println("Available count is:" +count2);
	}
	//method for getting the warning text
	public void getWarningMessage() {
		String warn = interestLocator.warnMessage.getText();
		System.out.println("The displayed message is:" +warn);
	}
	
	public void AccountInformation(String userName, String password) {
		this.setSignIn(userName, password);
	}
}

