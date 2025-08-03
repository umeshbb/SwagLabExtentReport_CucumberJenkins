package Hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import LibrarayFiles.DriverFactory;
import LibrarayFiles.ExtenTReportManager;
import LibrarayFiles.UtlityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class SwagLabHooks {

	@Before
	public void openbrwser(io.cucumber.java.Scenario scenario) throws IOException {
		DriverFactory.initalizebrowser(UtlityClass.GetPFData("browserName"));
		
		ExtenTReportManager.createTest(scenario.getName());
	}
	
	@BeforeStep
	public void Waitforsec() throws InterruptedException {
		Thread.sleep(500);
	}
	
	
	@After
	public void QuitBrowser(io.cucumber.java.Scenario scenario) {
		if(scenario.isFailed()) {
			ExtenTReportManager.getTest().fail("Scenario Failed");
		}
		else {
			ExtenTReportManager.getTest().fail("Scenario Passed");
		}
		
		ExtenTReportManager.flush();
	DriverFactory.driver.quit();
	}
	
	
	
	
	
	
	
}
