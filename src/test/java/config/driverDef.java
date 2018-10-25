package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import StepDefn.ReadProperty;

public class driverDef {

	 protected WebDriver driver;
	
	public driverDef()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
	  
	}
	
	
}
