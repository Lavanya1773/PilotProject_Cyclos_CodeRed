package com.actions;

<<<<<<< HEAD

=======
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
import java.io.IOException;
import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.locators.Login_Function_Locators;
import com.utility.Excel_Provider;
import com.utility.HelperClass;

public class Login_Function_Actions {
	WebDriver driver;
	Login_Function_Locators LF = new Login_Function_Locators();
	Actions act = new Actions(HelperClass.getDriver());
	Excel_Provider ex = new Excel_Provider(); 

	public Login_Function_Actions() {
		LF = new Login_Function_Locators();
		PageFactory.initElements(HelperClass.getDriver(),LF);
	}
//Login Valid Credentials
	
	// User click the Signin 
	public void Signin() {
		LF.Signin.click();
	}
	// User proides valid credentials LoginName   | Password
	public void setSigninName(String strSigninName) {
		LF.SigninName.sendKeys(strSigninName);
	}
	// User proides valid credentials Password

	public void setSigninPassword(String strSigninPassword) {
		LF.SigninPassword.sendKeys(strSigninPassword);
	}
	//User click submit
	public void Submit() {
		LF.Submit.click();
	}
	//User should be able to login Successfully Message
	public String SuccessfullMsg() {
		return LF.SuccessfullMsg.getText();
	}
	
	
// To Edit User Profile		
	
    // User click Personal field
	public void Personal() {
		LF.Personal.click();
	}
	
    // User click edit option
	public void Edit() {
		LF.Edit.click();
	}
	//User enter Website
	public void setWebsite(DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String Website = data.get("Website");
		LF.Website.sendKeys(Website);
	}
	}
	// User choose Gender
	public void Gender() {
		LF.Gender.click();
	}
	//User choose Business type
	public void BusinessType() {
		LF.BusinessType.click();
	}
	//User choose type
	public void Type() {
		LF.Type.click();
	}
	 // User click save
	public void Save() {
		LF.Save.click();
	}
	 // User click save and should able to see edit success message
	public String EditSuccessMessage() {
		return LF.EditSuccessMessage.getText();
	}
	

//To Edit Phone Number	
	// User click the Phone in leftside Column
	public void Phone() {
		LF.Phone.click();
	}
    // User click the Phone in profile
	public void Phone2() {
		LF.Phone2.click();
	}
    // User click the new for Adding Mobile
	public void New() {
		LF.New.click();
	}
    // User select the Mobile number
	public void SelectMobileNumber() {
		LF.SelectMobileNumber.click();
	}
    // User enter the Name
	public void setName(DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String  Name= data.get("Name");
		LF.Name.clear();
		LF.Name.sendKeys(Name);
	}
	}
    // User enter the Mobile Nuumber 
	public void setMobileNumber(DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String  MobileNumber= data.get("MobileNumber");
	
		LF.MobileNumber.sendKeys(MobileNumber);
	}
	}
    // User Click the save 
	public void SaveNumber() {
		LF.SaveNumber.click();
	}
    // User should able to see the phone edit Message
	public String PhoneEditMessage() {
		return LF.PhoneEditMessage.getText();
	}
	//User click the new for Adding Landline
	public void New2() {
		LF.New2.click();
	}
	//User select the Landline number
	public void SelectLandline() {
		LF.SelectLandline.click();
	}
	//User enter the Name 
	public void setName2(DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String  Name2= data.get("Name2");
		LF.Name2.clear();
		LF.Name2.sendKeys(Name2);
	}
	}
	//User enter the Landline number 
	public void setLandline(DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String  Landline= data.get("Landline");
		LF.Landline.sendKeys(Landline);
	}
	}
	// Get LandLine phone edit Message
	public String LandEditMessage() {
		return LF.LandEditMessage.getText();
	}
	
// Manage Password
	//User Click  Password
	public void ChangePassword() {
		LF.ChangePassword.click();
	}
	// User Click Change Option
	public void ChangeOption() {
		LF.ChangeOption.click();
	}
	//User enter the Old password 
	public void setOldPassword(DataTable datatable) {
		//HelperClass.wait.until(ExpectedConditions.visibilityOf(LF.OldPassword));
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String  OldPassword= data.get("OldPassword");
	    	
		LF.OldPassword.sendKeys(OldPassword);
	}
	}
	//User enter the New password
	public void setNewPassword(DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
		String NewPassword = data.get("NewPassword");
    
		LF.NewPassword.sendKeys(NewPassword);
	}
	}
	//User enter the Confirm New password
	public void setConfirmNewPassword(DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	
		String ConfirmNewPassword = data.get("ConfirmNewPassword");
		LF.ConfirmNewPassword.sendKeys(ConfirmNewPassword);
	}
	}

    // User Click the Confirm button 
	public void ConfirmButton() {
		LF.ConfirmButton.click();
	}
	// Get password reset message
	public String PasswordResetMessage() {
		return LF.PasswordResetMessage.getText();
	}
	// Get password and username error message
	public String PasswordErrorMessage() {
		return LF.PasswordErrorMessage.getText();
		
	}
    // User Click User option
	public void UserOption() {
		LF.UserOption.click();
	}
    // User Click My Contact
	public void MyContact() {
		LF.MyContact.click();
	}
    //User Click Add 
	public void AddOption() {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(LF.AddOption));
		LF.AddOption.click();
	
	}
    // User enter the Name to add in My Contact list
	public void setMyContactName(DataTable datatable) {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(LF.MyContactName));
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String  MyContactName= data.get("MyContactName");
		act.moveToElement(LF.MyContactName).sendKeys(MyContactName).perform();
		act.moveToElement(LF.MyContactName).sendKeys(Keys.DOWN,Keys.ENTER).perform();;
		
	    }
		
	}
	
    // User Click save 
	public void SaveMyList() {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(LF.SaveMyList));

		LF.SaveMyList.click();
		
	}
    // User able to see My Contact Added list
	public String MyContactAddedList() {
		return LF.MyContactAddedList.getText();
	}
	
//Invalid credential
	// Enter invalid credentials and attempt login
	public void InLoginName(String InLoginName){
		LF.InLoginName.sendKeys(InLoginName);
	}
	
	public void InPassword(String InPassword){
		LF.InPassword.sendKeys(InPassword);
	}
    // User click submit button
	public void InvalidSignin() {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(LF.InvalidSignin));
		LF.InvalidSignin.click();
		
	}
	// Get error message for invalid login
	public String ErrorMsg() {
		return LF.ErrorMsg.getText();
	}
	
	public void ClickAddress() {
		LF.ClickAddress.click();
	}
	
	public void NewAddress() {
		LF.NewAddress.click();
	}
	
	public void setAddressName(String strAddressName){
		LF.AddressName.sendKeys(strAddressName);
	}
	
	public void setAddress(String strAddress){
		LF.Address.sendKeys(strAddress);
	}
	
	public void setZipecode(String strZipecode){
		LF.Zipecode.sendKeys(strZipecode);
	}
	
	public void setCity(String strCity){
		LF.City.sendKeys(strCity);
	}
	
	public void setRegionorState(String strRegionorState){
		LF.RegionorState.sendKeys(strRegionorState);
	}
	
	public void Country() {
		LF.Country.click();
	}
	
	public void setCountryName(String strCountryName){
		LF.CountryName.sendKeys(strCountryName);
	}
	
	public void details(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
<<<<<<< HEAD
		List<Map<String,String>> testdata=ex.getData("C:\\Users\\alakshmanan\\eclipse-workspace\\CodeRed\\PilotProject_Cyclos_CodeRed\\src\\test\\resources\\AddressData.xlsx", sheetname);
=======
		List<Map<String,String>> testdata=ex.getData("src/test/resources/AddressData.xlsx", sheetname);
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
		String AddressName = testdata.get(rownumber).get("AddressName");
		String Address = testdata.get(rownumber).get("Address");
		String Zipecode = testdata.get(rownumber).get("Zipecode");
		String City = testdata.get(rownumber).get("City");
		String RegionorState = testdata.get(rownumber).get("RegionorState");
		setAddressName(AddressName);
		setAddress(Address);
		setZipecode(Zipecode);
		setCity(City);
		setRegionorState(RegionorState);
		
	}
	public void detailsAddress(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
<<<<<<< HEAD
		List<Map<String,String>> testdata=ex.getData("C:\\Users\\alakshmanan\\eclipse-workspace\\CodeRed\\PilotProject_Cyclos_CodeRed\\src\\test\\resources\\AddressData.xlsx", sheetname);
=======
		List<Map<String,String>> testdata=ex.getData("src/test/resources/AddressData.xlsx", sheetname);
>>>>>>> e1b89dfce1145d8aaf16c43e166302f9b6bcfbe1
	String CountryName = testdata.get(rownumber).get("CountryName");
	setCountryName(CountryName);
	}
	public void ChooseCountry() {
		LF.ChooseCountry.click();
	}
	
	public void Visibility() {
		LF.Visibility.click();
	}
	
	public void AddressSave() {
		LF.AddressSave.click();
	}
	
	public String AddressMsg() {
		return LF.AddressMsg.getText();
	}
}
