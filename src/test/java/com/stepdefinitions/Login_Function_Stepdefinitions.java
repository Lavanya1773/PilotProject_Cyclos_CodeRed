package com.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import com.actions.Login_Function_Actions;
import com.utility.Excel_Provider;
import com.utility.HelperClass;
import com.utility.UtilityClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Function_Stepdefinitions {
	
	Login_Function_Actions LFA = new Login_Function_Actions();
	UtilityClass UC = new UtilityClass();
	Excel_Provider ex = new Excel_Provider(); 

//Login Valid Credentials	
	
	// When User clicks the Signin button
	@When("User click the Signin")
	public void user_click_the_signin() {
		LFA.Signin();
		HelperClass.log.info("User click the Signin");
	}

	// When User provides valid credentials (LoginName and Password)
	@When("User proides valid credentials LoginName and Password")
	public void user_proides_valid_credentials_login_name_and_password() {
	   LFA.setSigninName(UC.strSigninName);
	   HelperClass.log.info("User proides valid LoginName");
	   LFA.setSigninPassword(UC.strSigninPassword);
	   HelperClass.log.info("User proides valid Password");
	   LFA.Submit();
	   HelperClass.log.info("User Click Submit");

	}
	
	// Then User should be able to see the successful login message
	@Then("User should be able to login Successfully Message")
	public void user_should_be_able_to_login_successfully_message() {
		 Assert.assertTrue(LFA.SuccessfullMsg().contains("Welcome to the Cyclos4 Demo"));
		 HelperClass.log.info("User get Successfully Message");
	}
// To Edit User Profile	
	
	// When User clicks the Personal field
	@When("User click Personal field")
	public void user_click_personal_field() {
	   LFA.Personal();
	   HelperClass.log.info("User click personal field");
	}

	// When User clicks the Edit option
	@When("User click edit option")
	public void user_click_edit_option() {
	    LFA.Edit();
		HelperClass.log.info("User click edit option");
	}

	// When User enters the Website
	@When("User enter Website")
	public void user_enter_website(io.cucumber.datatable.DataTable dataTable) {
	    	LFA.setWebsite(dataTable);
	 	    HelperClass.log.info("User enter website");
	    }
	
	// When User chooses Gender and Business Type
	@When("User choose Gender")
	public void user_choose_gender() {
	    LFA.Gender();
		HelperClass.log.info("User choose gender");
	}

	@When("User choose Business type")
	public void user_choose_business_type() {
	  LFA.BusinessType();
	  HelperClass.log.info("User enter the business type");
	  LFA.Type();
	  HelperClass.log.info("User choose the business type in drop down");
	}

	// Then User clicks Save and should see the edit success message
	@Then("User click save and should able to see edit success message")
	public void user_click_save_and_should_able_to_see_edit_success_message() {
	   LFA.Save();
	   HelperClass.log.info("User click save ");
		 Assert.assertTrue(LFA.EditSuccessMessage().contains("Saved successfully"));
		 HelperClass.log.info("User get edit success message");	
	}
//To Edit Phone Number
	
	// When User clicks on Phone in the left-side column and in the profile
	@When("User click the Phone in leftside Column")
	public void user_click_the_phone_in_leftside_column() {
	   LFA.Phone();
	   HelperClass.log.info("User click the phone in leftside column");
	}

	@When("User click the Phone in profile")
	public void user_click_the_phone_in_profile() {
	    LFA.Phone2();
	    HelperClass.log.info("User click phone option in profile");
	}

	// When User clicks on New for Adding Mobile
	@When("User click the new for Adding Mobile")
	public void user_click_the_new_for_adding_mobile() {
		LFA.New();
		HelperClass.log.info("User click new to add mobile number");
	}

	// When User selects the Mobile number and enters Name and Mobile Number
	@When("User select the Mobile number")
	public void user_select_the_mobile_number() {
	   LFA.SelectMobileNumber();
	   HelperClass.log.info("User select mobile number add option");
	}

	@When("User enter the Mobile Nuumber Name")
	public void user_enter_the_mobile_nuumber_name(io.cucumber.datatable.DataTable dataTable) {
		LFA.setName(dataTable);
		HelperClass.log.info("User enter name of the person for mobile number");
		LFA.setMobileNumber(dataTable);
		HelperClass.log.info("User enter mobile number of the person");
	}

	// Then User clicks Save and should see the phone edit message
	@Then("User Click the save and should able to see the phone edit Message")
	public void user_click_the_save_and_should_able_to_see_the_phone_edit_message() {
	    LFA.SaveNumber();
	    HelperClass.log.info("User click the save");
	    Assert.assertTrue(LFA.PhoneEditMessage().contains("Arun (Hidden)"));
	    HelperClass.log.info("User get mobile number added success message");
	}

	@Then("User click the new for Adding Landline")
	public void user_click_the_new_for_adiing_landline() {
	    LFA.New2();
	    HelperClass.log.info("User click new to add number");
	}

	@Then("User select the Landline number")
	public void user_select_the_landline_number() {
	    LFA.SelectLandline();
	    HelperClass.log.info("User select lanline add option");
	}

	@Then("User enter the Landline number Name")
	public void user_enter_the_landline_number_name(io.cucumber.datatable.DataTable dataTable) {
			LFA.setName2(dataTable);
			HelperClass.log.info("User enter name of the person for landline number");
	    	LFA.setLandline(dataTable);
	    	HelperClass.log.info("User enter landline number of the person");

	}
	
	@Then("User Click the save and should able to see the LandLine phone edit Message")
	public void user_click_the_save_and_should_able_to_see_the_land_line_phone_edit_message() {
		 LFA.SaveNumber();
		 HelperClass.log.info("User click the save ");
	 	    Assert.assertTrue(LFA.LandEditMessage().contains("Nirupama (Hidden)"));
	 	    HelperClass.log.info("User get landline number added success message");
	}
// Manage Password
	
	// When User clicks on Change Password and Change Option
	@Then("User Click Change Password")
	public void user_click_change_password() {
	    LFA.ChangePassword();
	    HelperClass.log.info("User click change password in profile");
	}

	@Then("User Click Change Option")
	public void user_click_change_option() {
	    LFA.ChangeOption();
	    HelperClass.log.info("User click change option");
	}

	// When User enters the Old password, New password, and Confirm New password
	@Then("User enter the Old password New password Confirm New password")
	public void user_enter_the_old_password_new_password_confirm_new_password(io.cucumber.datatable.DataTable dataTable) {
	    	LFA.setOldPassword(dataTable);  	
	    	HelperClass.log.info("User enter the old password ");
	    	LFA.setNewPassword(dataTable);
	    	HelperClass.log.info("User enter the new password ");
	    	LFA.setConfirmNewPassword(dataTable);
	    	HelperClass.log.info("User enter the confrim new password ");
	}
	
	// Then User clicks the Confirm button and should see the password reset message
	@Then("User Click the Confirm button and able to see Password reset message")
	public void user_click_the_confirm_button_and_able_to_see_password_reset_message() {
	    LFA.ConfirmButton();
	    HelperClass.log.info("User click the confrim button");
 	    Assert.assertTrue(LFA.PasswordResetMessage().contains("Password has been changed"));
 	   HelperClass.log.info("User get password reset successful message");
 	   
	}
	@Then("User Click the Confirm button and able to see Password Error reset message")
	public void user_click_the_confirm_button_and_able_to_see_password_error_reset_message() {
	    LFA.ConfirmButton();
	    HelperClass.log.info("User click the confrim button");
	    Assert.assertTrue(LFA.PasswordErrorMessage().contains("The action couldn't be processed, as there were validation errors:"));
	    HelperClass.log.info("User get password error message");
	    
	}
	
//To Manage My Contact

	// When User clicks on User option, My Contact, and Add option
	@Then("User Click User option")
	public void user_click_user_option() {
	   LFA.UserOption();
	   HelperClass.log.info("User click User option in mainpage");
	}

	@Then("User Click My Contact")
	public void user_click_my_contact() {
	   LFA.MyContact(); 
	   HelperClass.log.info("User click my contact");
	}

	@Then("User Click Add option")
	public void user_click_add_option() {
	    LFA.AddOption();
	    HelperClass.log.info("User click add option");
	}

	// When User enters the Name to add in My Contact list
	@Then("User enter the Name to add in My Contact list")
	public void user_enter_the_name_to_add_in_my_contact_list(io.cucumber.datatable.DataTable dataTable){
		LFA.setMyContactName(dataTable);
		HelperClass.log.info("User enter the name to add in my contact list");
	}
	
	// Then User clicks Save and should see the My Contact added list
	@Then("User Click save and  able to see My Contact Added list")
	public void user_click_save_and_able_to_see_my_contact_added_list() {
		 LFA.SaveMyList();
		 HelperClass.log.info("User click save for add list");
	    Assert.assertTrue(LFA.MyContactAddedList().contains("Junior has been added to the contact list"));
	    HelperClass.log.info("User get successful add list message");
	}
	

//Invalid credentials

	// When User provides Invalid Sign in name and password
	@When("User proides Invalid Sign in name {string}")
	public void user_proides_invalid_sign_in_name(String string) {
	   LFA.InLoginName(string);	
	   HelperClass.log.info("User provides invalid sign in name");
	   }

	@When("User proides Invalid Sign in Password {string}")
	public void user_proides_invalid_sign_in_password(String string) {
	    LFA.InPassword(string);
	    HelperClass.log.info("User provides invalid sign in password ");
	}

	// Then User clicks Submit for invalid credentials and should see the login error message
	@Then("User click submit for invalid and should be able to login Error Message")
	public void user_click_submit_for_invalid_and_should_be_able_to_login_error_message() {
		LFA.InvalidSignin();
		HelperClass.log.info("User click singin for invalid");
		Assert.assertTrue(LFA.ErrorMsg().contains("Sign in failed. The given user / password are incorrect. Please, try again."));
		HelperClass.log.info("User get login error message");
	}
	
	@When("User click the Address")
	public void user_click_the_address() {
	    LFA.ClickAddress();
	    HelperClass.log.info("User click the address to edit address");
	}

	@When("User click the new in Address")
	public void user_click_the_new_in_address() {
	   LFA.NewAddress();
	   HelperClass.log.info("User click the new to add address");
	}

	@When("User enter the Name Address Zip code City State and Country using sheetname {string} and rownumber {int}")
	public void user_enter_the_name_address_zip_code_city_state_and_country_using_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {

		LFA.details(sheetname, rownumber);
		HelperClass.log.info("User enter name,address,zipecode,city,state which get from AddressData.xlsx");
		LFA.Country();
		HelperClass.log.info("User click country");
		LFA.detailsAddress(sheetname, rownumber);
		HelperClass.log.info("User enter country name which get from AddressData.xlsx");
		LFA.ChooseCountry();
		HelperClass.log.info("User choose the country");
	}

	@When("User Choose the Visibility")
	public void user_choose_the_visibility() {
	  LFA.Visibility();
	  HelperClass.log.info("User choose the visibility of address");
	}

	@Then("User Click the save and user get Save Successfull Message")
	public void user_click_the_save_and_user_get_save_successfull_message() {
	    LFA.AddressSave();
	    HelperClass.log.info("User click the save");
	    Assert.assertTrue(LFA.AddressMsg().contains("Saved successfully"));
	    HelperClass.log.info("User get save successfull message");
	}
}
