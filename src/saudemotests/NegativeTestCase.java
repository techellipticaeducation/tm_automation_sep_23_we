package saudemotests;

import pageobjects.LoginPageObject;

public class NegativeTestCase extends TestCaseBase{
	
	
	public void validate_errormsg_with_empty_username_valid_password() {
		setup();
		driver.findElement(LoginPageObject.txt_password).sendKeys("invalid_password");
		driver.findElement(LoginPageObject.btn_submit).click();
		String errorMsg = driver.findElement(LoginPageObject.msg_error).getText();
		
		if(errorMsg.contains("Username is required")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		tearDown();
		
		
	}
	
	public void validate_errormsg_with_valid_username_empty_password() {
		setup();
		driver.findElement(LoginPageObject.txt_username).sendKeys("standard_user");
		driver.findElement(LoginPageObject.btn_submit).click();
		String errorMsg = driver.findElement(LoginPageObject.msg_error).getText();
		
		if(errorMsg.contains("Password is required")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		tearDown();
		
		
	}
	
}
