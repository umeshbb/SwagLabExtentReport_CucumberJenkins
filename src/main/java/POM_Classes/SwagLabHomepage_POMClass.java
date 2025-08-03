package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomepage_POMClass {

	
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]") private WebElement Addbackpacktocart;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement OpenCart;
	
	
	
	public SwagLabHomepage_POMClass(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	
	public void addbackpacktocart() {
		Addbackpacktocart.click();
	}
	
	public void opencart() {
		OpenCart.click();
	}
	
	
	
	
	
	
}
