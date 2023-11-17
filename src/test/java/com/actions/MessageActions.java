package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.MessageLocators;
import com.utility.HelperClass;

public class MessageActions {
	MessageLocators messagelocators=new MessageLocators();
	
	String  userName, password, strUser, strSubject, strDescription;
	
	//constructor
	public  MessageActions() {  
		this.messagelocators = new MessageLocators();
		PageFactory.initElements(HelperClass.getDriver(),messagelocators);
	}
	
	//Clicking Inbox Radio Button
	public void clickInboxRadioButton() {
		messagelocators.InBoxRadioButton.click();
	}
	
	//Clicking SendMessage Radio Button
	public void clickSendMessageRadioButton() {
		messagelocators.SendMessageRadioButton.click();
	}
	
	//Clicking Trash Radio Button
	public void clickTrashRadioButton() {
		messagelocators.TrashRadiOButton.click();
	}
	
	//Clicking NEW Button
	public void clickNewButton() {
		messagelocators.NewButton.click();
	}
	
	//Enter the user name
	public void setUserName(String strUserName) {
		messagelocators.UserInputField.sendKeys(strUserName);
	}
	

	//Enter text data in Subject field
	public void setSubject(String strSubject) {
		messagelocators.SubjectInputField.sendKeys(strSubject);
	}
	
	//Enter text data in description field
	public void setDescription(String strDescription) {
		messagelocators.DescriptionInputField.sendKeys(strDescription);
	}
	
	//Clicking SEND Button
	public void clickSendButton() {
			messagelocators.ButtonSend.click();
	}
	
	//Login Actions
	public void setSignIn(String userName, String password) {
		messagelocators.signIn.click();
		messagelocators.userName.sendKeys(userName);
		messagelocators.password.sendKeys(password);
		messagelocators.signInButton.click();
	}
	
	public void message(String strUserName, String strSubject, String strDescription) {
		this.setUserName(strUserName);
		this.setSubject(strSubject);
		this.setDescription(strDescription);
	}
		
}
