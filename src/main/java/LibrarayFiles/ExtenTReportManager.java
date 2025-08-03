package LibrarayFiles;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenTReportManager {
 private static ExtentReports extent;
 private static ExtentTest test;
 
 
 public static ExtentReports getInstance() {
	 if(extent==null) {
		 ExtentSparkReporter reporter= new ExtentSparkReporter("test-output/ExtentReport.html");
		 extent= new ExtentReports();
		 
		 extent.attachReporter(reporter);
		
		 
	 }
	 return extent; 
	 
 }
	
public static ExtentTest createTest(String Name) {
	test=getInstance().createTest(Name);
	
	return test;
	
}
public static ExtentTest getTest() {
	return test;
}
	
public static void flush() {
	getInstance().flush();
	
}
	
	
	
	
}
