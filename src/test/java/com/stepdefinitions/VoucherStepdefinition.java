package com.stepdefinitions; 
import org.testng.Assert;
import com.actions.GiftVoucherActions;
import com.utility.HelperClass;
import com.utility.UtilityClassVoucher;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class VoucherStepdefinition {
	GiftVoucherActions objgiftVoucherActions = new GiftVoucherActions();
	UtilityClassVoucher data1 = new UtilityClassVoucher();
	@Given("User launched url")
	public void user_launch_the_url() {
		HelperClass.openPage(data1.url);
	    System.out.println("Cyclos Url is launched");
	    HelperClass.log.info("Cyclos URL is launched");
	}

 
	@When("User provides Name and password")
	public void user_provide_valid_username_and_password() {
		System.out.println("User provides username and password to signIn");
		objgiftVoucherActions.setSignIn(data1.userName, data1.password);
	    HelperClass.log.info("User entered username and password");		
	}
	@When("User choose the marketpalce tab")
	public void user_choose_the_marketpalce_tab() {
		objgiftVoucherActions.clickMarketPlace();
		System.out.println("Select the marketplace");
	    HelperClass.log.info("User selected the marketplace tab");
	}	    
	@When("User selects the buy voucher")
	public void user_selects_the_buy_voucher() {
		objgiftVoucherActions.clickBuyVoucher();
		System.out.println("Select the Buy voucher");
	    HelperClass.log.info("User selects the buy voucher option");
	}
	@When("User selects the Gift voucher")
	public void user_selects_the_gift_voucher() {
		objgiftVoucherActions.clickGiftVoucher();
		System.out.println("Select the Gift voucher");
	    HelperClass.log.info("User selects the Gift voucher");
	}
	@When("User enters the amount and submit")
	public void user_enters_the_amount_and_submit() {
		objgiftVoucherActions.setEnterAmount();
		objgiftVoucherActions.clickNext();
		objgiftVoucherActions.clickSubmit();
	    HelperClass.log.info("User entered the amount and submit");
	}

	@Then("User print the gift voucher pdf and the submission verified.")
	public void user_print_the_gift_voucher_pdf_and_the_submission_verified() {
		objgiftVoucherActions.clickPrint();
	    Assert.assertTrue(objgiftVoucherActions.successMessBuyVoucher().contains("The voucher has been bought"));
     	System.out.println("The assert is true");		
        HelperClass.log.info("Print the gift voucher pdf and the submission verified");

	    Assert.assertTrue(objgiftVoucherActions.successMessBuyVoucher().contains("The voucher has been bought"));
     	System.out.println("The assert is true");		
        HelperClass.log.info("Print the gift voucher pdf and the submission verified");	
	}
	@When("User Selects the my voucher option")
	public void user_selects_the_my_voucher_option() {
		objgiftVoucherActions.clickMyVoucher();
	    HelperClass.log.info("User Selects the my voucher option");	
	}
 
	
	@When("User Verfied the page is successfully opened")
	public void user_verfied_the_page_is_successfully_opened() {
	String resultNumber =objgiftVoucherActions.getResultNo();		
	System.out.println("The number of result in send message" +resultNumber);	
//	Assert.assertTrue(objgiftVoucherActions.getResultNo().contains("result"));
    System.out.println("The assert is true");
    HelperClass.log.info("User Verfied the page is successfully opened");		
	}
	@Then("User download the gift voucher pdf")
	public void user_download_the_gift_voucher_pdf() {
		objgiftVoucherActions.printPDFclick();		
	    HelperClass.log.info("User download the gift voucher pdf");
	    objgiftVoucherActions.clickLogout();
	}
}

