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
<<<<<<< HEAD
	
=======
		
	
	//Login Actions
	public void setSignIn(String userName, String password) {
		messagelocators.signIn.click();
		messagelocators.userName.sendKeys(userName);
		messagelocators.password.sendKeys(password);
		messagelocators.signInButton.click();
	}	
	
	//Clicking the message Button
	public void clickMessageIcon() {
		messagelocators.messageIcon.click();
		
	}
		
>>>>>>> main
	//Clicking Inbox Radio Button
	public void clickInboxRadioButton() {
		messagelocators.InBoxRadioButton.click();
	}
	
<<<<<<< HEAD
=======
	
	//Get number of result  after clicking Inbox radio button
	public String getNumberResultInbox() {
		return messagelocators.ResultInbox.getText();
	}
		
>>>>>>> main
	//Clicking SendMessage Radio Button
	public void clickSendMessageRadioButton() {
		messagelocators.SendMessageRadioButton.click();
	}
	
<<<<<<< HEAD
=======
	
	//Get number of result  after clicking SendMessage radio button
		public String getNumberResultSendMess() {
			return messagelocators.ResultSendMessage.getText();
		}
	
	
>>>>>>> main
	//Clicking Trash Radio Button
	public void clickTrashRadioButton() {
		messagelocators.TrashRadiOButton.click();
	}
	
<<<<<<< HEAD
=======
	
	//Get number of result  after clicking SendMessage radio button
	public String getNumberResultTrash() {
		return messagelocators.ResultTrash.getText();
	}
	
	
>>>>>>> main
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
<<<<<<< HEAD
		messagelocators.DescriptionInputField.sendKeys(strDescription);
=======
		messagelocators.frametext.sendKeys(strDescription);
>>>>>>> main
	}
	
	//Clicking SEND Button
	public void clickSendButton() {
			messagelocators.ButtonSend.click();
	}
	
<<<<<<< HEAD
	//Login Actions
	public void setSignIn(String userName, String password) {
		messagelocators.signIn.click();
		messagelocators.userName.sendKeys(userName);
		messagelocators.password.sendKeys(password);
		messagelocators.signInButton.click();
	}
	
	public void message(String strUserName, String strSubject, String strDescription) {
=======
	//Get the verification message
	public String getSuccessMess() {
		return messagelocators.Successmessage.getText();
	}
	
	
	public void message(String userName,String password, String strUserName, String strSubject, String strDescription) {
		this.setSignIn(userName,password);
		this.clickInboxRadioButton();
		this.getNumberResultInbox();
		
		this.clickNewButton();
		this.clickSendMessageRadioButton();
		this.clickSendMessageRadioButton();
		
		this.clickTrashRadioButton();
		this.getNumberResultTrash();
		
		this.clickNewButton();
>>>>>>> main
		this.setUserName(strUserName);
		this.setSubject(strSubject);
		this.setDescription(strDescription);
	}
		
}
