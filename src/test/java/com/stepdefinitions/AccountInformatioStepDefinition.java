package com.stepdefinitions;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.actions.AccountInformationActions;
import com.locators.AccountInformationLocators;
import com.utility.HelperClass;
import com.utility.UtilityClassAccountInformation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountInformatioStepDefinition {
	UtilityClassAccountInformation data = new UtilityClassAccountInformation();
	AccountInformationActions objAccountActions = new AccountInformationActions();
	AccountInformationLocators objAccountLocators = new AccountInformationLocators();
	public static JavascriptExecutor javascriptExe;
	
	@Given("User launch the url")
	public void user_launch_the_url() {
		HelperClass.openPage(data.url);
	    System.out.println("Cyclos Url is launched");
	    HelperClass.log.info("Cyclos URL is launched");
	}

	@When("User provide valid username and password")
	public void user_provide_valid_username_and_password() {
		System.out.println("User provides username and password to signIn");
		objAccountActions.setSignIn(data.userName, data.password);	
		 HelperClass.log.info("User Logined and currently in the Home Page");
	}

	@When("User choose the Banking Tab")
	public void user_choose_the_banking_tab() {
		objAccountActions.clickBanking();
		System.out.println("Banking Tab is clicked!!");
		 HelperClass.log.info("User selected Banking Tab");
	}

	@When("User view the current balance")
	public void user_view_the_current_balance() {
		String currentBalance = objAccountActions.getCurrentBalanceText();
		System.out.println("The Current Balance of the user is : " + currentBalance);
		 HelperClass.log.info("User gets the current balance");
	}

	@When("User checks the negative balance")
	public void user_checks_the_negative_balance() {
		String negativeBalance = objAccountActions.getNegativeBalanceText();
		System.out.println("The Negative Balance of the user is : " + negativeBalance);
		 HelperClass.log.info("User gets the negative balance");
	}

	@When("User checks Total received")
	public void user_checks_total_received() {
		String Totalreceived = objAccountActions.getTotalReceivedBalanceText();
		System.out.println("The total number of incoming payment is : " + Totalreceived);
		 HelperClass.log.info("User gets the Total received payments");

	}

	@Then("User download the payment history")
	public void user_download_the_payment_history() {
		objAccountActions.scrollAction();//
		objAccountActions.clickDownloadFile();
		objAccountActions.clickPdf();			
		System.out.println("Payment file is downloaded. Please Check your system");
		 HelperClass.log.info("User prints the pdf");

	}

	@When("User provide filters as System Payments and check the number of incoming payments")
	public void user_provide_filters_as_system_payments_and_check_the_number_of_incoming_payments() {
		objAccountActions.clickSystemFilters();		
		 HelperClass.log.info("User choose system Payment filter");

	}

	@Then("User get the payment account details based on System filter")
	public void user_get_the_payment_account_details_based_on_system_filter() {

		Assert.assertTrue(objAccountActions.getSystemPaymentVerification().contains("Initial credit"));		
		
		List<WebElement> table = HelperClass.getDriver().findElements(By.xpath("//div[@class='dataTableContainer']//table"));	

		System.out.println(table.size());
		for(WebElement datas : table)
		{
		System.out.println(datas.getText());
		}
		 HelperClass.log.info("User get the data's from system filter");

	}

	@When("User provide filters as Member Payments and check the number of incoming payments")
	public void user_provide_filters_as_member_payments_and_check_the_number_of_incoming_payments() {
		objAccountActions.clickMemberPaymentFilters();
		 HelperClass.log.info("User choose Member Payment filter");

	}

	@Then("User get the payment details based on Member filter")
	public void user_get_the_payment_details_based_on_member_filter() {
		
		objAccountActions.scrollAction();
		Assert.assertTrue(objAccountActions.getMemberPaymentVerification().contains("Amount for buying gifts"));
		
		HelperClass.javascriptExe.executeScript("window.scrollBy(0,doc.body.scrollHeight)");		
		
		List<WebElement> table = HelperClass.getDriver().findElements(By.xpath("//div[@class='dataTableContainer']//table"));	
		System.out.println(table.size());
		for(WebElement datas : table)
		{
		System.out.println(datas.getText());
		}
		 HelperClass.log.info("User get the data's from system filter");
		
	}
		
}
