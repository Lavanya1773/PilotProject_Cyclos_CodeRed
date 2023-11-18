package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.locators.LoginPage_Loctors;
import com.utility.HelperClass;

public class LoginPage_Actions {
	WebDriver driver;
	LoginPage_Loctors LP = new LoginPage_Loctors();
	
	public LoginPage_Actions() {
		LP = new LoginPage_Loctors();
		PageFactory.initElements(HelperClass.getDriver(),LP);
	}
	
	public void Signin() {
		LP.Signin.click();
	}
	
	public void setLoginName(String LoginName) {
		LP.LoginName.sendKeys(LoginName);
	}
	
	public void setPassword(String Password) {
		LP.Password.sendKeys(Password);
	}
	
	public void SigninButton() {
		LP.SigninButton.click();
	}
	
	public String SuccessMsg() {
		return LP.SuccessMsg.getText();
	}
	
	public String ErrorMsg() {
		return LP.ErrorMsg.getText();
	}
	
	public void Profile() {
		LP.Profile.click();
	}
	
	public void EditProfile() {
		LP.EditProfile.click();
	}
	
	public void setWebsite(String Website) {
		LP.Website.sendKeys(Website);
	}
	
	public void Gender() {
		LP.Gender.click();
	}
	
	public void BussinessType() {
		LP.BussinessType.click();
	}
	
	public void ChooseBussinessType() {
		LP.ChooseBussinessType.click();
	}
	
	public void Save() {
		LP.Save.click();
	}
	
	public String ProfileSucessfullyMsg() {
		return LP.ProfileSucessfullyMsg.getText();
	}

	
	public void Login(String LoginName,String Password) {
		setLoginName(LoginName);
		setPassword(Password);
			
	}
	public void Web(String Website){
	setWebsite(Website);
	}
}