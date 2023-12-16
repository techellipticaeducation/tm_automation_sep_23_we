package saudemotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCaseBase {

	WebDriver driver =null;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Vaibhav\\git\\tm_automation_sep_23_we\\chrome\\chromedriver.exe");
		driver = new ChromeDriver(); // selenium create a new session (no cookies)
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}


	@AfterMethod
	public void tearDown() {

		driver.quit();
		// screenshot
	}

}
