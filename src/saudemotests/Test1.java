package saudemotests;

import org.testng.Assert;
import org.testng.annotations.Test;

import module.LoginModule;

public class Test1 extends TestCaseBase {
	
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

}
