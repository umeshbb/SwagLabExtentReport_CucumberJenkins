package Stesp_package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import LibrarayFiles.DriverFactory;
import LibrarayFiles.ExtenTReportManager;
import LibrarayFiles.UtlityClass;
import POM_Classes.SwagLabCheckoutInfoPage_PomClass;
import POM_Classes.SwagLabCheckoutOverviewPage_POMClass;
import POM_Classes.SwagLabHomepage_POMClass;
import POM_Classes.SwagLabLoginPage_POMClass;
import POM_Classes.SwagLabYourCartPage_POMClass;
import POM_Classes.SwagLanCompleteCheckoutPage_PomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabOrder_Steps {

	SwagLabLoginPage_POMClass login= new SwagLabLoginPage_POMClass(DriverFactory.driver);
	SwagLabHomepage_POMClass home= new SwagLabHomepage_POMClass(DriverFactory.driver);
	SwagLabYourCartPage_POMClass cartpage= new SwagLabYourCartPage_POMClass(DriverFactory.driver);
	SwagLabCheckoutInfoPage_PomClass checkoutinfo=new SwagLabCheckoutInfoPage_PomClass(DriverFactory.driver);
	SwagLabCheckoutOverviewPage_POMClass Checkoutoverview=new SwagLabCheckoutOverviewPage_POMClass(DriverFactory.driver);
	SwagLanCompleteCheckoutPage_PomClass Confirmationpage= new SwagLanCompleteCheckoutPage_PomClass(DriverFactory.driver);
	
	
	@Given("user is on Login Page")
	public void user_is_on_login_page() throws IOException {
	    DriverFactory.driver.get(UtlityClass.GetPFData("URL"));
	    ExtenTReportManager.getTest().info("Navigating to Login Page");
	}

	@When("User enter the UN as {string}")
	public void user_enter_the_un_as(String UN) {
	   login.InpUN(UN);
	   
	   ExtenTReportManager.getTest().info("Entering the UN");
	}

	@When("User enter the PWD as {string}")
	public void user_enter_the_pwd_as(String PWD) {
	    login.InpPWD(PWD);
	    ExtenTReportManager.getTest().info("Entering the PWD");
	}

	@When("User Click on Login Button")
	public void user_click_on_login_button() {
	    login.clkloginbtn(DriverFactory.driver);
	    ExtenTReportManager.getTest().info("Clcking on Login Button ");
	}

	@When("User Click on Add to cart button")
	public void user_click_on_add_to_cart_button() {
		
		
	    home.addbackpacktocart();
	    ExtenTReportManager.getTest().info("Clicked on add to cart button");
	}

	@When("User click on Open Cart menu")
	public void user_click_on_open_cart_menu() {
	    home.opencart();
	    ExtenTReportManager.getTest().info("Clicked on Open Cart Menu");
	    }

	@When("User click on check out button")
	public void user_click_on_check_out_button() {
		cartpage.checkout();
		ExtenTReportManager.getTest().info("Clicked on Checkout button");
	}

	@When("User enter the FN as {string}")
	public void user_enter_the_fn_as(String FN) {
		checkoutinfo.InpFN(FN);
		ExtenTReportManager.getTest().info("Entered the FirstName");
	}

	@When("User Enter the LN as {string}")
	public void user_enter_the_ln_as(String LN) {
		checkoutinfo.InpLN(LN);
		ExtenTReportManager.getTest().info("Entered the LastName");
	}

	@When("User enter the Postal Code as {string}")
	public void user_enter_the_postal_code_as(String PostalCode) {
		checkoutinfo.InpPostalCode(PostalCode);
		ExtenTReportManager.getTest().info("Entered the Postal Code");
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		checkoutinfo.ClickOnContinue();
		ExtenTReportManager.getTest().info("Clicked On continue button");
	}

	@When("User Click on finish button on checkoutoverview page")
	public void user_click_on_finish_button_on_checkoutoverview_page() {
		Checkoutoverview.Clickonfinish();
		ExtenTReportManager.getTest().info("user clciked on Finish button");
	}

	@Then("User should reach on Order Complete Page With Message {string}")
	public void user_should_reach_on_order_complete_page_with_message(String ExpOrderDispatchMsg) {
		String ActOrderDispatchMsg = Confirmationpage.OrderdispatchMsg();
		Assert.assertEquals(ActOrderDispatchMsg, ExpOrderDispatchMsg,"Failed -- Actaul and Exp Confirmation Msg is diff");
		ExtenTReportManager.getTest().pass("User successfully Ordered the Back Pack");
	}
	
	
	
	
	
	
	
	
	
	
	
}
