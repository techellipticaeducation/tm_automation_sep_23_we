package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		// Test case 
		/*
		 * 1 - Open Google chrome
		 * 2 - Open Google website
		 * 3 - Enter Sachin and press ENter in search term
		 * 4 - Validate Search Results
		 * 5 - Click on Sachin Wikipedia page
		 */
		
		
		// when we use url (url - protocol)
		driver.get("https://www.google.com");
//		name="q"
		
		
		// Ref of locator
		driver.findElement(By.name("q")).sendKeys("Sachin",Keys.SPACE, "Tendulkar", Keys.ENTER);
		
		
		By sachinLink  = By.partialLinkText("Sachin Tendulkar");
//		WebElement linkText = driver.findElement(sachinLink);
//		linkText.click();
		
		
		List<WebElement> allLinks = driver.findElements(sachinLink);
		System.out.println(allLinks.size());
//		allLinks.get(1).click();
		
		
		
//		driver.close(); // close only close active tab 
//		driver.quit(); // kill entire session . 
		
	}
}
