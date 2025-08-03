package LibrarayFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtlityClass {

	public  static  String GetPFData(String key) throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Umesh\\eclipse-workspace\\SwagLabExtentReport_Cucumber\\src\\main\\java\\LibrarayFiles\\PropertiesFile.properties");
		Properties p= new Properties();
		p.load(file);
		String value = p.getProperty(key);
		
		return value;
	}
	
	
	
	
	
	
	
	
	
	
}
