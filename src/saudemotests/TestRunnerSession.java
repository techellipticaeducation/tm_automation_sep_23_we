package saudemotests;

public class TestRunnerSession {
	public static void main(String[] args) {
		Test1 testcases = new Test1();
		testcases.validate_errormsg_with_valid_username_invalid_password();
		testcases.validate_errormsg_with_invalid_username_invalid_password();
		NegativeTestCase testcases1 = new NegativeTestCase();
		testcases1.validate_errormsg_with_empty_username_valid_password();
		testcases1.validate_errormsg_with_valid_username_empty_password();
	}
	
}
