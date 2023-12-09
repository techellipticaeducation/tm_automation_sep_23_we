package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {

		
		// download selenium lib
		// download webdriver exe as per you browser
		// setup webdriverexe path in system property
		// Object creation of Webdriver
		
		
		//webdriver.chrome.driver 
		//webdriver.gecko.driver
		//webdriver.edge.driver
		
		// you provide your driver path to you script
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Vaibhav\\git\\tm_automation_sep_23_we\\chrome\\chromedriver.exe");
		
		// chromedriver.exe
		WebDriver driver = new ChromeDriver(); // selenium create a new session (no cookies)
		
		// method
		driver.manage().window().maximize();
		// when we use url (url - protocol)
		driver.get("https://www.google.com");
		
		
		
//		driver.close(); // close only close active tab 
		driver.quit(); // kill entire session . 
		
	}
}
