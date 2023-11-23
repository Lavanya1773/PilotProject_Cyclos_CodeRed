package com.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.locators.ProfilePhotoUpdateLocators;
import com.utility.HelperClass;

public class ProfilePhotoUpdateActions {
	
	ProfilePhotoUpdateLocators profilePictureLocators = new ProfilePhotoUpdateLocators();
	String userName, password;
	
	public ProfilePhotoUpdateActions() {
		this.profilePictureLocators = new ProfilePhotoUpdateLocators();
		PageFactory.initElements(HelperClass.getDriver(), profilePictureLocators);		
	}
	
	public void setSignIn(String userName, String password) {
		profilePictureLocators.signIn.click();
		profilePictureLocators.userName.sendKeys(userName);
		profilePictureLocators.password.sendKeys(password);
		profilePictureLocators.signInButton.click();
	}
	
	public void clickPersonal() {
		profilePictureLocators.personalOption.click();
	}
	
	public void clickProfileImages() {
		profilePictureLocators.profileImagesSection.click();
	}
	
	public void clickUploadNew() throws AWTException, InterruptedException {
		
		Thread.sleep(5000);
//		HelperClass.wait.until(ExpectedConditions.visibilityOf(profilePictureLocators.uploadNewButton));
		profilePictureLocators.uploadNewButton.click();
		
		Thread.sleep(5000);

		Robot rb = new Robot();

		StringSelection str = new StringSelection("file:///C:/Users/lsethuraj/Downloads/pictureFolder/picture.jpg");
//		file:///C:/arun/Newfolder/Arun_Passport_Photo.jpg
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		}
	
	public String getIamgeResultsCount() {
		return profilePictureLocators.profileImagesSection.getText();
	}
}