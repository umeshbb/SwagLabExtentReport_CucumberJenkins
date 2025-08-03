package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutInfoPage_PomClass {

	@FindBy(xpath = "//input[@name='firstName']") private WebElement FN;
	@FindBy(xpath = "//input[@name='lastName']")private WebElement LN;
	
	@FindBy(xpath = "//input[@name='postalCode']")private WebElement PostalCode;
	@FindBy(xpath = "//input[@name='continue']") private WebElement Continue;
	
	
	public SwagLabCheckoutInfoPage_PomClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void InpFN(String FirstName) {
		FN.sendKeys(FirstName);
	}
	
	public void InpLN(String LastName) {
		LN.sendKeys(LastName);
	}
	
	public void InpPostalCode(String Postcode) {
		PostalCode.sendKeys(Postcode);
	}
	
	public void ClickOnContinue() {
		Continue.click();
	}
	
}
