package POM_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabLoginPage_POMClass {

	//Step-- Declaration 
	
	@FindBy(xpath = "//input[@name='user-name']") private WebElement UN;
	@FindBy(xpath = "//input[@name='password']") private WebElement pwd;
	@FindBy(xpath = "//input[@name='login-button']") private WebElement loginbtn;
	
	
	public SwagLabLoginPage_POMClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void InpUN(String Username) {
		UN.sendKeys(Username);
	}
	
	public void InpPWD(String Password)
	{
		pwd.sendKeys(Password);
	}
	
	public void clkloginbtn(WebDriver driver) {
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(3));
		w.until(ExpectedConditions.visibilityOf(loginbtn));
		
		loginbtn.click();
	}
	
	

	public void clickOnOkBtnOnAlert(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.alertIsPresent());
				
		driver.switchTo().alert().accept();
	}
	
	
	
	
	
	
	
	
	
	
}
