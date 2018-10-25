package StepDefn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
		
	@Before
	public void beforeScenario() throws IOException {
		ReadProperty.Read();
		
	}
	
		
	
}

