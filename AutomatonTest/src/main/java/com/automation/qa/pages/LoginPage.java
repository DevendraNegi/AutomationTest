package com.automation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(id="email")
	static WebElement username;
	@FindBy(id="pass")
	static WebElement password;
	
	public LoginPage() {
		System.out.println("LoginPage.initElements");
		PageFactory.initElements(driver, this);
	}
public static String validateTitle(){
	return driver.getTitle();
	
}

public static void enterCredentials(String user,String pass){
	username.sendKeys(user);
	password.sendKeys(pass);
	
}
}
