package com.actions;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

import com.locators.MessageLocators;
import com.utility.HelperClass;

public class MessageActions {
	MessageLocators messagelocators=new MessageLocators();
	Actions action = new Actions(HelperClass.getDriver());
	
	//HelperClass driv = new HelperClass();

	
	String  userName, password, strUser, strSubject, Description ,User;
	
	//constructor
	public  MessageActions() {  
		this.messagelocators = new MessageLocators();
		PageFactory.initElements(HelperClass.getDriver(),messagelocators);
	}
	
	
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
		
	//Clicking Inbox Radio Button
	public void clickInboxRadioButton() {
		messagelocators.InBoxRadioButton.click();
	}
	
	
	//Get number of result  after clicking Inbox radio button
	public String getNumberResultInbox() {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(messagelocators.ResultInbox));
		return messagelocators.ResultInbox.getText();
	}
		
	//Clicking SendMessage Radio Button
	public void clickSendMessageRadioButton() {
		messagelocators.SendMessageRadioButton.click();
		
	}
	
	
	//Get number of result  after clicking SendMessage radio button
		public String getNumberResultSendMess(){
			HelperClass.wait.until(ExpectedConditions.visibilityOf(messagelocators.ResultSendMessage));
			return messagelocators.ResultSendMessage.getText();
		}
	
	
	//Clicking Trash Radio Button
	public void clickTrashRadioButton() {
		messagelocators.TrashRadiOButton.click();
		messagelocators.AdvanceButton.click();
		messagelocators.SearchButton.click();
		
	}
	
	
	//Get number of result  after clicking Trash radio button
	public String getNumberResultTrash() {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(messagelocators.ResultTrash));
		return messagelocators.ResultTrash.getText();
	}
	
	
	//Clicking NEW Button
	public void clickNewButton() {
		messagelocators.NewButton.click();
	}
	
	
	//Enter the user name
	public void setUserName(String User) throws InterruptedException {		
		    HelperClass.wait.until(ExpectedConditions.visibilityOf(messagelocators.UserInputField));			
			action.moveToElement(messagelocators.UserInputField).sendKeys(User).build().perform();
			HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//action.moveToElement(objPaymentLocators.user).sendKeys(Keys.DOWN,Keys.ENTER).build().perform();
			Thread.sleep(2000);
			action.moveToElement(messagelocators.UserInputField).sendKeys(Keys.DOWN,Keys.ENTER).build().perform();		
	}
	

	//Enter text data in Subject field
	public void setSubject(String strSubject) {
		messagelocators.SubjectInputField.sendKeys(strSubject);
	}
	
     //Enter text data in description field
	public void setDescription(String Description) throws InterruptedException {
		
	//	WebElement description = (WebElement) HelperClass.getDriver().switchTo().frame("//iframe[@class= 'richTextField']");
	//	description.sendKeys(Description);
		messagelocators.clickSquareBox.click();
		HelperClass.getDriver().switchTo().frame(messagelocators.iframe);
		messagelocators.DescriptionInputField.sendKeys("Demo description");
		HelperClass.getDriver().switchTo().parentFrame();
		
//		System.out.println("Frame switched");
//		//action.moveToElement(messagelocators.DescriptionInputField).sendKeys("Demo description");
//		action.moveToElement(messagelocators.DescriptionInputField).sendKeys(Description).build().perform();
//		HelperClass.getDriver().switchTo().parentFrame();	
	//	WebElement name = driv.driver.findElement(By.xpath("//body[@marginwidth='0']"));
	//	name.sendKeys("demo description");		
		//driv.driver.switchTo().frame(strDescription);
		//messagelocators.DescriptionInputField.sendKeys(strDescription);
	}
	
	
	//Clicking SEND Button
	public void clickSendButton() {
			messagelocators.ButtonSend.click();
	}
	
	//Get the verification message
	public String getSuccessMess() {
		return messagelocators.Successmessage.getText();
		
	}
	//Get verification message that message unable to send
	public String getFailMess() {
		return messagelocators.Failmessage.getText();
	}
	
	
	public void message(String userName,String password, String User, String strSubject, String strDescription) throws InterruptedException {
		this.setSignIn(userName,password);
		this.clickInboxRadioButton();
		this.getNumberResultInbox();
		
		this.clickNewButton();
		this.clickSendMessageRadioButton();
		this.clickSendMessageRadioButton();
		
		this.clickTrashRadioButton();
		this.getNumberResultTrash();
		
		this.clickNewButton();
		this.setUserName(User);
		this.setSubject(strSubject);
		this.setDescription(strDescription);
	}
		
}