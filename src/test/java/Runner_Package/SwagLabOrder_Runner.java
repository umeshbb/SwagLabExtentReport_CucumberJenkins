package Runner_Package;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		features = {"C:\\Users\\Umesh\\eclipse-workspace\\SwagLabExtentReport_Cucumber\\src\\test\\resources\\Featurefiles\\SwagLabOrder.feature"},
		glue= {"Stesp_package","Hooks"},
		publish=true,
		plugin = {"pretty"}
		
		
		)
public class SwagLabOrder_Runner extends AbstractTestNGCucumberTests{

}
