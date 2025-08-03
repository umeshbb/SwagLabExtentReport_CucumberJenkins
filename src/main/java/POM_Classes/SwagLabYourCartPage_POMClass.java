package POM_Classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabYourCartPage_POMClass {

	@FindBy(xpath = "//button[@name='checkout']") private WebElement checkout;
	
	
	public SwagLabYourCartPage_POMClass(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	
	
	public void checkout() {
		checkout.click();
		
	}
	
	
	
	
	
	
}
