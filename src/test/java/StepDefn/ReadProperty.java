package StepDefn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	static Properties prop = new Properties();
	
	public static void Read() throws IOException
	{
		
		
		FileInputStream ip = new FileInputStream("C:\\Users\\hemchauh\\Desktop\\CoyaTest\\src\\test\\java\\Support\\homePage.properties");
		prop.load(ip);
		
	}
	
	public static String getSelector(String locator)
	{
		String locatorValue = prop.getProperty(locator);
		return locatorValue;
		
	} 

}
