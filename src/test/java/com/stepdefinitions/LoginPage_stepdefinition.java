package com.stepdefinitions;
import java.util.List;
import java.util.Map;
import org.testng.Assert;
import com.actions.LoginPage_Actions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginPage_stepdefinition {
	LoginPage_Actions LPA= new LoginPage_Actions();
		
	@When("User click the Signin")
	public void user_click_the_signin() {
	LPA.Signin();
	}

	@When("User provides credentials")
	public void user_provides_credentials(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("Valid credentials Entered");
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String LoginName = data.get("LoginName");
	    	String Password = data.get("Password");
				LPA.Login(LoginName, Password);
				 LPA.SigninButton();	
	    	 }
			}

	@Then("User Should be able to login successfully and see the HomePage")
	public void user_should_be_able_to_login_successfully_and_see_the_home_page() {
		 Assert.assertTrue(LPA.SuccessMsg().contains("Welcome to the Cyclos4 Demo"));
	}
	//Welcome to the Cyclos4 Demo
	@Then("User Should be able see Unsuccessfull error message")
	public void user_should_be_able_see_unsuccessfull_error_message() {
		 Assert.assertTrue(LPA.ErrorMsg().contains("Sign in failed. The given user / password are incorrect. Please, try again."));
	}
	@Then("User click the user profile")
	public void user_click_the_user_profile() {
	  LPA.Profile();
	}

	@Then("User click the edit profile")
	public void user_click_the_edit_profile() {
		LPA.EditProfile();
	}

	@Then("Update the Website")
	public void update_the_website(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String Website = data.get("Website");
				LPA.Web(Website);
				
	    	 }
	}

	@Then("User enter the Gender")
	public void user_enter_the_gender() {
		LPA.Gender();
	}

	@Then("User enter the bussinessType")
	public void user_enter_the_bussiness_type() {
		LPA.BussinessType();
		LPA.ChooseBussinessType();
	}

	@Then("User click the Save and able to see Saved successfully msg")
	public void user_click_the_save_and_able_to_see_saved_successfully_msg() {
		LPA.Save();
		 Assert.assertTrue(LPA.ProfileSucessfullyMsg().contains(""));

		
	}
}
