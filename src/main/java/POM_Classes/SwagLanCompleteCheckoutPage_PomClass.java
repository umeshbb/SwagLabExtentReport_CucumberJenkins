package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLanCompleteCheckoutPage_PomClass {
@FindBy(xpath = "//div[@class='complete-text']") private WebElement OrderdispatchMsg;



public SwagLanCompleteCheckoutPage_PomClass(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public String OrderdispatchMsg() {
	return OrderdispatchMsg.getText();
}






}
