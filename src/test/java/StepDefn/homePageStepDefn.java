package StepDefn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.driverDef;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class homePageStepDefn extends driverDef {
	
	WebDriver driver;
	
		
 	@Given("^customer is on coya\\.com$")
	public void customer_is_on_coya_com()  {
 		
 		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get(ReadProperty.getSelector("URL"));			
	  
	}

	@Then("^verify title of the homepage$")
	public void verify_title_of_the_homepage() {
		
		String homepageTitle  = driver.getTitle();		
		Assert.assertEquals("Coya: Vergiss Papierkram – werde Teil einer neuen Versicherung!", homepageTitle);
	   
	}
	
	
	@When("^user selects EN as language$")
	public void user_selects_EN_as_language()  {
		
		driver.findElement(By.linkText("EN")).click();
		
		
		   
	}

	@Then("^Tabs should be displayed in english$")
	public void tabs_should_be_displayed_in_english()  {
		
		String Tab1 = driver.findElement(By.xpath(ReadProperty.getSelector("HomePageTab1"))).getText();
		String Tab2 = driver.findElement(By.xpath(ReadProperty.getSelector("HomePageTab2"))).getText();
		String Tab3 = driver.findElement(By.xpath(ReadProperty.getSelector("HomePageTab3"))).getText();
		
		Assert.assertEquals("Home Contents Insurance", Tab1);
		Assert.assertEquals("About us", Tab2);
		Assert.assertEquals("Coya Care", Tab3);
		
		
			    
	}


	

	
	


	
	
	
	
	

}
