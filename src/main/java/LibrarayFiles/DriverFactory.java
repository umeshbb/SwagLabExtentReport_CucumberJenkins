package LibrarayFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
 public static WebDriver driver;
 
 
 public static void initalizebrowser(String browserName) {
	 if(browserName.equalsIgnoreCase("Chrome")) {
		 driver=new ChromeDriver();
	 }
	 else if (browserName.equalsIgnoreCase("edge")) {
		 driver= new EdgeDriver();
		 
	 }
	 else if (browserName.equalsIgnoreCase("firefox")) {
		 driver=new FirefoxDriver();
	 }
 }
	
	
	
	
	
	
	
	
}
