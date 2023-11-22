package com.stepdefinitions;

import java.awt.AWTException;

import org.testng.Assert;

import com.actions.ProfilePhotoUpdateActions;
import com.utility.HelperClass;
import com.utility.UtilityClassAccountInformation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePhotoUpdateStepDefinition {
	
	UtilityClassAccountInformation data = new UtilityClassAccountInformation();
	ProfilePhotoUpdateActions objProfileActions = new ProfilePhotoUpdateActions();

	
	@Given("User launched the web application and login into the application")
	public void user_launched_the_web_application_and_login_into_the_application() {
		HelperClass.openPage(data.url);
	    System.out.println("Cyclos Url is launched");
	    objProfileActions.setSignIn(data.userName, data.password);	
	    HelperClass.log.info("User successfully logins the cyclos web application");
	}

	@When("User goes to Personal Tab and goes to profile image option")
	public void user_goes_to_personal_tab_and_goes_to_profile_image_option() {
		objProfileActions.clickPersonal();
		objProfileActions.clickProfileImages();
	    HelperClass.log.info("User is currently in Profile Images Tab");
	}

	@When("User choose Upload new option and added picture from the system")
	public void user_choose_upload_new_option_and_added_picture_from_the_system() throws AWTException, InterruptedException{
		objProfileActions.clickUploadNew();
	    HelperClass.log.info("User uploading the profile picture using Robot class");
	}

	@Then("User checks the profile picture")
	public void user_checks_the_profile_picture() {
		System.out.println("completed");
	    Assert.assertFalse(objProfileActions.getIamgeResultsCount().contains("1 result"));
	    HelperClass.log.info("User uploaded the profile picture");
	}

}