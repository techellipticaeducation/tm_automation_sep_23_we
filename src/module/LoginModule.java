package module;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginPageObject;

public class LoginModule {
	public static void enterUserCredential(WebDriver driver, String username, String password) {
		driver.findElement(LoginPageObject.txt_username).sendKeys(username);
		driver.findElement(LoginPageObject.txt_password).sendKeys(password);
		driver.findElement(LoginPageObject.btn_submit).click();
	}
	
	public static String getErrorMsg(WebDriver driver) {
		String errorMsg = driver.findElement(LoginPageObject.msg_error).getText();
		return errorMsg;
	}
	
}
