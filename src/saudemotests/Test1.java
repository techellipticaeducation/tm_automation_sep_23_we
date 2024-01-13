package saudemotests;

import org.testng.Assert;
import org.testng.annotations.Test;

import module.LoginModule;

public class Test1 extends TestCaseBase {
	
// JUnit4 - Devleopers , 
// TestNG - Automation Tester	
	@Test
	public void validate_errormsg_with_valid_username_invalid_password() {
		LoginModule.enterUserCredential(driver, "standard_user","invalid_test");
		String errorMsg = LoginModule.getErrorMsg(driver);
		Assert.assertTrue(errorMsg.contains("Username and password do not match any user in this service"), 
				"msg not match");
	}
	@Test
	public void validate_errormsg_with_invalid_username_invalid_password() {
		LoginModule.enterUserCredential(driver,"invalid_user","invalid_password");
		String errorMsg = LoginModule.getErrorMsg(driver);
		Assert.assertTrue(errorMsg.contains("Username and match any user in this service"), 
				"msg not match");
	}
	@Test
	public void validate_errormsg_with_empty_username_valid_password() {
		LoginModule.enterUserCredential(driver,"","invalid_password");
		String errorMsg = LoginModule.getErrorMsg(driver);
		Assert.assertTrue(errorMsg.contains("Username is required"), "msg not match");
	}
	@Test
	public void validate_errormsg_with_valid_username_emmpty_password() {
		LoginModule.enterUserCredential(driver,"valid_userame","");
		String errorMsg = LoginModule.getErrorMsg(driver);
		Assert.assertTrue(errorMsg.contains("Password is required"), "msg not match");
	}
}
