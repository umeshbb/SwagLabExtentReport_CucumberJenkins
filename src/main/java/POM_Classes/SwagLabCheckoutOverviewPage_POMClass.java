package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutOverviewPage_POMClass {
@FindBy(xpath = "//button[@name='finish']") private WebElement Finishbtn;


public SwagLabCheckoutOverviewPage_POMClass(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public void Clickonfinish() {
	Finishbtn.click();
}






}
