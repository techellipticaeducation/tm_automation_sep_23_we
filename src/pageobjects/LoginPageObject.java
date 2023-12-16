package pageobjects;

import org.openqa.selenium.By;

public class LoginPageObject {
	public static By txt_username = By.id("user-name");
	public static By txt_password = By.id("password");
	public static By btn_submit = By.id("login-button");
	
	
	public static By msg_error = By.className("error-message-container");
}
